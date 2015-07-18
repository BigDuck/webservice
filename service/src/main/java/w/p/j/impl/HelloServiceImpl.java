package w.p.j.impl;

import w.p.j.IHello;

import javax.jws.WebService;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/18.8:13
 * ****************************************************
 */
@WebService
public class HelloServiceImpl implements IHello {
    public String sayHello(String name) {
        System.out.println("接收到："+name);
        return "['name':"+name+" ]";
    }
    public int sayAge(String name) {
        return 18;
    }
}
