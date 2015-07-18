package w.p.j.main;

import w.p.j.impl.CXFTypeImpl;

import javax.xml.ws.Endpoint;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.9:18
 * ****************************************************
 */
public class MainApp {
    public static void main(String []args){
        String address="http://127.0.0.1:9999/ws/cxf";
        Endpoint.publish(address,new CXFTypeImpl());
        System.out.println("发布成功了");
    }
}
