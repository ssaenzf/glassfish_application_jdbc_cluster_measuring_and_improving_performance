/**
 * Pr&aacute;ctricas de Sistemas Inform&aacute;ticos II
 * VisaCancelacionJMSBean.java
 */

package ssii2.visa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ejb.EJBException;
import javax.ejb.MessageDriven;
import javax.ejb.MessageDrivenContext;
import javax.ejb.ActivationConfigProperty;
import javax.jms.MessageListener;
import javax.jms.Message;
import javax.jms.TextMessage;
import javax.jms.JMSException;
import javax.annotation.Resource;
import java.util.logging.Logger;

/**
 * @author jaime
 */
@MessageDriven(mappedName = "jms/VisaPagosQueue")
public class VisaCancelacionJMSBean extends DBTester implements MessageListener {
  static final Logger logger = Logger.getLogger("VisaCancelacionJMSBean");
  @Resource
  private MessageDrivenContext mdc;

    private static final String UPDATE_CANCELA_QRY =
                            "update pago " +
                            " set codRespuesta=999 " +
                            " where idAutorizacion=?";
   // TODO : Definir UPDATE sobre la tabla pagos para poner
   // codRespuesta a 999 dado un código de autorización
    private static final String UPDATE_SALDO_QRY =
                            "update tarjeta " +
                            " set saldo=saldo + pago.importe" +
                            " from pago " +
                            " where pago.idAutorizacion=? and pago.numeroTarjeta=tarjeta.numeroTarjeta ";

  public VisaCancelacionJMSBean() {
  }

  // TODO : Método onMessage de ejemplo
  // Modificarlo para ejecutar el UPDATE definido más arriba,
  // asignando el idAutorizacion a lo recibido por el mensaje
  // Para ello conecte a la BD, prepareStatement() y ejecute correctamente
  // la actualización
  public void onMessage(Message inMessage) {
      TextMessage msg = null;

      PreparedStatement pstmt = null;
      Connection con = null;
      int idAutorizacion = 0;

      try {
          if (inMessage instanceof TextMessage) {
            msg = (TextMessage) inMessage;
            logger.info("MESSAGE BEAN: Message received: " + msg.getText());

            idAutorizacion = Integer.parseInt(msg.getText());
            con = getConnection();

            // Cancelar pago
            String aux = UPDATE_CANCELA_QRY;
            pstmt = con.prepareStatement(aux);
            pstmt.setInt(1, idAutorizacion);
            if (!(!pstmt.execute()
                  && pstmt.getUpdateCount() == 1)) {
                    logger.warning("Error al cancelar pago usando id " + idAutorizacion);
                }

            // Update saldo
            String aux2 = UPDATE_SALDO_QRY;
            pstmt = con.prepareStatement(aux2);
            pstmt.setInt(1, idAutorizacion);
            if (!(!pstmt.execute()
                  && pstmt.getUpdateCount() == 1)) {
                    logger.warning("Error al actualizar saldo para pago usando id " + idAutorizacion);
                }

          } else {
              logger.warning(
                      "Message of wrong type: "
                      + inMessage.getClass().getName());
          }
      } catch (JMSException e) {
          e.printStackTrace();
          mdc.setRollbackOnly();
      } catch (Throwable te) {
          te.printStackTrace();
      } finally { // Control de errores en el método onMessage y cierre de conexiones.
            try {
                if (pstmt != null) {
                    pstmt.close();
                    pstmt = null;
                }
                if (con != null) {
                    closeConnection(con);
                    con = null;
                }
            } catch (SQLException e) {
            }
      }
  }
}