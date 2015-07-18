package w.p.j.mian;

import org.apache.cxf.endpoint.Client;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;
import w.p.j.ICXFTypeTest;
import w.p.j.Interceptor.LoginIntertecptor;
import w.p.j.Student;
import w.p.j.impl.CXFTypeImplService;

import java.util.List;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.19:40
 * ****************************************************
 */
public class InterceptionTest {
    public static void main(String[]args){
        CXFTypeImplService factory=new CXFTypeImplService();
        ICXFTypeTest typeTest= factory.getCXFTypeImplPort();
        Client client=ClientProxy.getClient(typeTest);
//        添加日志出的拦截器
        List<Interceptor<? extends Message>> listOut= client.getOutInterceptors();
        listOut.add(new LoggingOutInterceptor());
        listOut.add(new LoginIntertecptor("wepeiji","123456"));
//        添加入拦截器
        List<Interceptor<? extends Message>> listIn=client.getInInterceptors();
        listIn.add(new LoggingInInterceptor());
        Student s=new Student();
        s.setAddress("福州");
        s.setAge(23);
        s.setName("小鸭子");
      System.out.println(typeTest.addStudent(s));
    }
}
