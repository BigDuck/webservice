package w.p.j.main;

import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.message.Message;
import w.p.j.UserInfoInterceptor;
import w.p.j.impl.CXFTypeImpl;

import javax.xml.ws.Endpoint;
import java.util.List;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.16:07
 * ****************************************************
 */
public class MainApp2 {
    public static void main(String []args){
        String address="http://127.0.0.1:9999/ws/cxf";

       Endpoint endpoint= Endpoint.publish(address, new CXFTypeImpl());
        /**
         * 添加一个入的日志拦截器
         */
        EndpointImpl endpointImpl=(EndpointImpl)endpoint;
        //获取拦截器的列表
        List<Interceptor<? extends Message>> listIn= endpointImpl.getInInterceptors();
//       验证用户名密码
        listIn.add(new UserInfoInterceptor());
       //往引用集合里添加数据
        listIn.add(new LoggingInInterceptor());
        //日志出拦截器获取出拦截器的集合
        List<Interceptor<? extends Message>> listOut=   endpointImpl.getOutInterceptors();
        listOut.add(new LoggingOutInterceptor());
        System.out.println("发布成功了");
    }
}
