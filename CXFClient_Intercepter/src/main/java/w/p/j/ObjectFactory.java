
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

    private final static QName _AddStudent_QNAME = new QName("http://j.p.w/", "addStudent");
    private final static QName _AddStudentResponse_QNAME = new QName("http://j.p.w/", "addStudentResponse");
    private final static QName _GetStuList_QNAME = new QName("http://j.p.w/", "getStuList");
    private final static QName _GetStuListResponse_QNAME = new QName("http://j.p.w/", "getStuListResponse");
    private final static QName _GetStudentById_QNAME = new QName("http://j.p.w/", "getStudentById");
    private final static QName _GetStudentByIdResponse_QNAME = new QName("http://j.p.w/", "getStudentByIdResponse");
    private final static QName _GetStudentMap_QNAME = new QName("http://j.p.w/", "getStudentMap");
    private final static QName _GetStudentMapResponse_QNAME = new QName("http://j.p.w/", "getStudentMapResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: w.p.j
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetStudentMapResponse }
     * 
     */
    public GetStudentMapResponse createGetStudentMapResponse() {
        return new GetStudentMapResponse();
    }

    /**
     * Create an instance of {@link GetStudentMapResponse.Return }
     * 
     */
    public GetStudentMapResponse.Return createGetStudentMapResponseReturn() {
        return new GetStudentMapResponse.Return();
    }

    /**
     * Create an instance of {@link AddStudent }
     * 
     */
    public AddStudent createAddStudent() {
        return new AddStudent();
    }

    /**
     * Create an instance of {@link AddStudentResponse }
     * 
     */
    public AddStudentResponse createAddStudentResponse() {
        return new AddStudentResponse();
    }

    /**
     * Create an instance of {@link GetStuList }
     * 
     */
    public GetStuList createGetStuList() {
        return new GetStuList();
    }

    /**
     * Create an instance of {@link GetStuListResponse }
     * 
     */
    public GetStuListResponse createGetStuListResponse() {
        return new GetStuListResponse();
    }

    /**
     * Create an instance of {@link GetStudentById }
     * 
     */
    public GetStudentById createGetStudentById() {
        return new GetStudentById();
    }

    /**
     * Create an instance of {@link GetStudentByIdResponse }
     * 
     */
    public GetStudentByIdResponse createGetStudentByIdResponse() {
        return new GetStudentByIdResponse();
    }

    /**
     * Create an instance of {@link GetStudentMap }
     * 
     */
    public GetStudentMap createGetStudentMap() {
        return new GetStudentMap();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link GetStudentMapResponse.Return.Entry }
     * 
     */
    public GetStudentMapResponse.Return.Entry createGetStudentMapResponseReturnEntry() {
        return new GetStudentMapResponse.Return.Entry();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "addStudent")
    public JAXBElement<AddStudent> createAddStudent(AddStudent value) {
        return new JAXBElement<AddStudent>(_AddStudent_QNAME, AddStudent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddStudentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "addStudentResponse")
    public JAXBElement<AddStudentResponse> createAddStudentResponse(AddStudentResponse value) {
        return new JAXBElement<AddStudentResponse>(_AddStudentResponse_QNAME, AddStudentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStuList }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "getStuList")
    public JAXBElement<GetStuList> createGetStuList(GetStuList value) {
        return new JAXBElement<GetStuList>(_GetStuList_QNAME, GetStuList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStuListResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "getStuListResponse")
    public JAXBElement<GetStuListResponse> createGetStuListResponse(GetStuListResponse value) {
        return new JAXBElement<GetStuListResponse>(_GetStuListResponse_QNAME, GetStuListResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentById }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "getStudentById")
    public JAXBElement<GetStudentById> createGetStudentById(GetStudentById value) {
        return new JAXBElement<GetStudentById>(_GetStudentById_QNAME, GetStudentById.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentByIdResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "getStudentByIdResponse")
    public JAXBElement<GetStudentByIdResponse> createGetStudentByIdResponse(GetStudentByIdResponse value) {
        return new JAXBElement<GetStudentByIdResponse>(_GetStudentByIdResponse_QNAME, GetStudentByIdResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentMap }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "getStudentMap")
    public JAXBElement<GetStudentMap> createGetStudentMap(GetStudentMap value) {
        return new JAXBElement<GetStudentMap>(_GetStudentMap_QNAME, GetStudentMap.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetStudentMapResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://j.p.w/", name = "getStudentMapResponse")
    public JAXBElement<GetStudentMapResponse> createGetStudentMapResponse(GetStudentMapResponse value) {
        return new JAXBElement<GetStudentMapResponse>(_GetStudentMapResponse_QNAME, GetStudentMapResponse.class, null, value);
    }

}
