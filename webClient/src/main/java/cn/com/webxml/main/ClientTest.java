package cn.com.webxml.main;

import cn.com.webxml.ArrayOfString;
import cn.com.webxml.WeatherWS;
import cn.com.webxml.WeatherWSSoap;
import org.apache.cxf.frontend.ClientProxy;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.interceptor.Interceptor;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.message.Message;

import java.util.List;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/17.13:05
 * ****************************************************
 */
public class ClientTest {
    public static void main(String[] args){
        WeatherWS weatherWS=new WeatherWS();
        WeatherWSSoap weatherWSSoap=weatherWS.getWeatherWSSoap();
        Client client=ClientProxy.getClient(weatherWSSoap);
        //客户端出的的日志拦截器
        List<Interceptor<? extends Message>> listOut=client.getOutInterceptors();
        listOut.add(new LoggingOutInterceptor());
        //添加入拦截器
        List<Interceptor<? extends Message>> lisIn=client.getInInterceptors();
        lisIn.add(new LoggingInInterceptor());

        ArrayOfString arrayOfString= weatherWSSoap.getWeather("福州", null);
        List<String> list=arrayOfString.getString();
         for (String s:list){
         System.out.println("--------------------------------------------------------");
         System.out.println(s);
     }
    }

}
