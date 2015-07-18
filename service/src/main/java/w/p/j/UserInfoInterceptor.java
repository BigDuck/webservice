package w.p.j;

import org.apache.cxf.binding.soap.SoapMessage;
import org.apache.cxf.binding.soap.interceptor.AbstractSoapInterceptor;
import org.apache.cxf.headers.Header;
import org.apache.cxf.interceptor.Fault;
import org.apache.cxf.phase.Phase;
import org.w3c.dom.Element;

import javax.xml.namespace.QName;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.20:58
 * ****************************************************
 * 检查用户信息的拦截器
 * 验证用户名和密码
 */
public class UserInfoInterceptor  extends AbstractSoapInterceptor {
    public UserInfoInterceptor() {
        super(Phase.PRE_PROTOCOL);
    }

    public void handleMessage(SoapMessage message) throws Fault {
       Header header= message.getHeader(new QName("wupeijiInfo"));
        if(header!=null){
            Element wupeijiInfo= (Element) header.getObject();
            String name=wupeijiInfo.getElementsByTagName("name").item(0).getTextContent();
            String password=wupeijiInfo.getElementsByTagName("password").item(0).getTextContent();
            if("wepeiji".equals(name)&&"123456".equals(password)){
                System.out.println("验证通过");
                return;
            }
        }
        //未通过
        System.out.println("未通过验证");
        throw new Fault(new RuntimeException("用户名或密码错误"));

    }
}
