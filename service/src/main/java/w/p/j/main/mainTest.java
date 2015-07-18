package w.p.j.main;

import w.p.j.impl.HelloServiceImpl;

import javax.xml.ws.Endpoint;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.8:15
 * ****************************************************
 */
public class mainTest {
    public static void main(String[] args){
        String address="http://127.0.0.1:8080/ws/cxf";
        Endpoint.publish(address,new HelloServiceImpl());
        System.out.println("发布成功了");

    }
}
