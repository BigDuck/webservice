package w.p.j.main;

import w.p.j.IHello;
import w.p.j.impl.HelloServiceImplService;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.8:27
 * ****************************************************
 */
public class Test {
    public static void main(String[] args) {
        HelloServiceImplService factioy = new HelloServiceImplService();
        IHello helloServiceImplPort = factioy.getHelloServiceImplPort();
        String res = helloServiceImplPort.sayHello("吴培基");
        System.out.println(res + "----");
        System.out.println(helloServiceImplPort.sayAge("name"));
    }
}
