
package ssii2.visa.dao;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ssii2.visa.dao package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetPagos_QNAME = new QName("http://dao.visa.ssii2/", "getPagos");
    private final static QName _SetDebugResponse_QNAME = new QName("http://dao.visa.ssii2/", "setDebugResponse");
    private final static QName _ErrorLogResponse_QNAME = new QName("http://dao.visa.ssii2/", "errorLogResponse");
    private final static QName _DelPagos_QNAME = new QName("http://dao.visa.ssii2/", "delPagos");
    private final static QName _DelPagosResponse_QNAME = new QName("http://dao.visa.ssii2/", "delPagosResponse");
    private final static QName _GetPagosResponse_QNAME = new QName("http://dao.visa.ssii2/", "getPagosResponse");
    private final static QName _ErrorLog_QNAME = new QName("http://dao.visa.ssii2/", "errorLog");
    private final static QName _SetDebug_QNAME = new QName("http://dao.visa.ssii2/", "setDebug");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ssii2.visa.dao
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SetDebugResponse }
     * 
     */
    public SetDebugResponse createSetDebugResponse() {
        return new SetDebugResponse();
    }

    /**
     * Create an instance of {@link GetPagos }
     * 
     */
    public GetPagos createGetPagos() {
        return new GetPagos();
    }

    /**
     * Create an instance of {@link DelPagos }
     * 
     */
    public DelPagos createDelPagos() {
        return new DelPagos();
    }

    /**
     * Create an instance of {@link ErrorLogResponse }
     * 
     */
    public ErrorLogResponse createErrorLogResponse() {
        return new ErrorLogResponse();
    }

    /**
     * Create an instance of {@link GetPagosResponse }
     * 
     */
    public GetPagosResponse createGetPagosResponse() {
        return new GetPagosResponse();
    }

    /**
     * Create an instance of {@link DelPagosResponse }
     * 
     */
    public DelPagosResponse createDelPagosResponse() {
        return new DelPagosResponse();
    }

    /**
     * Create an instance of {@link ErrorLog }
     * 
     */
    public ErrorLog createErrorLog() {
        return new ErrorLog();
    }

    /**
     * Create an instance of {@link SetDebug }
     * 
     */
    public SetDebug createSetDebug() {
        return new SetDebug();
    }

    /**
     * Create an instance of {@link TarjetaBean }
     * 
     */
    public TarjetaBean createTarjetaBean() {
        return new TarjetaBean();
    }

    /**
     * Create an instance of {@link PagoBean }
     * 
     */
    public PagoBean createPagoBean() {
        return new PagoBean();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPagos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.visa.ssii2/", name = "getPagos")
    public JAXBElement<GetPagos> createGetPagos(GetPagos value) {
        return new JAXBElement<GetPagos>(_GetPagos_QNAME, GetPagos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDebugResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.visa.ssii2/", name = "setDebugResponse")
    public JAXBElement<SetDebugResponse> createSetDebugResponse(SetDebugResponse value) {
        return new JAXBElement<SetDebugResponse>(_SetDebugResponse_QNAME, SetDebugResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorLogResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.visa.ssii2/", name = "errorLogResponse")
    public JAXBElement<ErrorLogResponse> createErrorLogResponse(ErrorLogResponse value) {
        return new JAXBElement<ErrorLogResponse>(_ErrorLogResponse_QNAME, ErrorLogResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelPagos }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.visa.ssii2/", name = "delPagos")
    public JAXBElement<DelPagos> createDelPagos(DelPagos value) {
        return new JAXBElement<DelPagos>(_DelPagos_QNAME, DelPagos.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DelPagosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.visa.ssii2/", name = "delPagosResponse")
    public JAXBElement<DelPagosResponse> createDelPagosResponse(DelPagosResponse value) {
        return new JAXBElement<DelPagosResponse>(_DelPagosResponse_QNAME, DelPagosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetPagosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.visa.ssii2/", name = "getPagosResponse")
    public JAXBElement<GetPagosResponse> createGetPagosResponse(GetPagosResponse value) {
        return new JAXBElement<GetPagosResponse>(_GetPagosResponse_QNAME, GetPagosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ErrorLog }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.visa.ssii2/", name = "errorLog")
    public JAXBElement<ErrorLog> createErrorLog(ErrorLog value) {
        return new JAXBElement<ErrorLog>(_ErrorLog_QNAME, ErrorLog.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SetDebug }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://dao.visa.ssii2/", name = "setDebug")
    public JAXBElement<SetDebug> createSetDebug(SetDebug value) {
        return new JAXBElement<SetDebug>(_SetDebug_QNAME, SetDebug.class, null, value);
    }

}
