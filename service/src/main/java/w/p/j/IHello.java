package w.p.j;

import javax.jws.WebMethod;
import javax.jws.WebService;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/17.21:10
 * ****************************************************
 *  SEI
 */
@WebService
public interface IHello {
    @WebMethod
    public String sayHello(String name);
    @WebMethod
    public int sayAge(String name);
}
