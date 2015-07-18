package w.p.j.Interceptor;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.helpers.DOMUtils;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;
import java.util.List;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.19:49
 * ****************************************************
 */
public class LoginIntertecptor extends AbstractSoapInterceptor {
    private  String name;
    private String password;
    public LoginIntertecptor(String name,String password) {
        //准备协议化的时候拦截
        super(Phase.PRE_PROTOCOL);
        this.name=name;
        this.password=password;
    }

    /**
     * 请求体的结构 我们需要构造一个头信息进去<head>信息</head>
     * <Envelope>
     *
     *     <head>
         *      <wupeijiInfo>
             *      <name>wupeiji</name>
             *      <password>123456789</password>
         *      </wupeijiInfo>
     *     </head>
     *********************************
     *     <Body>
     *
     *     </Body>
     * </Envelope>
     * @param message
     * @throws Fault
     */
    public void handleMessage(SoapMessage message) throws Fault {
        List<Header> headers=message.getHeaders();
        QName qName=new QName("wupeijiInfo");
        Document document= DOMUtils.createDocument();
        Element rootEle=document.createElement("wupeijiInfo");
        Element nameEle=document.createElement("name");
        nameEle.setTextContent(name);
        rootEle.appendChild(nameEle);
        Element passEle=document.createElement("password");
        passEle.setTextContent(password);
        rootEle.appendChild(passEle);

        headers.add(new Header(qName, rootEle));
        System.out.println("拦截成了");
    }
}
