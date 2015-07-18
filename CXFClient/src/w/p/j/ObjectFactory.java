
package w.p.j;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the w.p.j package. 
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

    private final static QName _SayAge_QNAME = new QName("http://j.p.w/", "sayAge");
    private final static QName _SayAgeResponse_QNAME = new QName("http://j.p.w/", "sayAgeResponse");
    private final static QName _SayHello_QNAME = new QName("http://j.p.w/", "sayHello");
    private final static QName _SayHelloResponse_QNAME = new QName("http://j.p.w/", "sayHelloResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: w.p.j
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SayAge }
     * 
     */
    public SayAge createSayAge() {
        return new SayAge();
    }

    /**
     * Create an instance of {@link SayAgeResponse }
     * 
     */
    public SayAgeResponse createSayAgeResponse() {
        return new SayAgeResponse();
    }

    /**
     * Create an instance of {@link SayHello }
     * 
     */
    public SayHello createSayHello() {
        return new SayHello();
    }

    /**
     * Create an instance of {@link SayHelloResponse }
     * 
     */
    public SayHelloResponse createSayHelloResponse() {
        return new SayHelloResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayAge }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "sayAge")
    public JAXBElement<SayAge> createSayAge(SayAge value) {
        return new JAXBElement<SayAge>(_SayAge_QNAME, SayAge.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayAgeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "sayAgeResponse")
    public JAXBElement<SayAgeResponse> createSayAgeResponse(SayAgeResponse value) {
        return new JAXBElement<SayAgeResponse>(_SayAgeResponse_QNAME, SayAgeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "sayHello")
    public JAXBElement<SayHello> createSayHello(SayHello value) {
        return new JAXBElement<SayHello>(_SayHello_QNAME, SayHello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SayHelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "sayHelloResponse")
    public JAXBElement<SayHelloResponse> createSayHelloResponse(SayHelloResponse value) {
        return new JAXBElement<SayHelloResponse>(_SayHelloResponse_QNAME, SayHelloResponse.class, null, value);
    }

}
