package wpj.cxf.spring.dao;

import wpj.cxf.spring.daomain.Order;

import javax.jws.WebMethod;
import javax.jws.WebService;

/******************************************************
 * ****** Created by 吴培基 on 2015/7/19.9:10
 * ****************************************************
 */
@WebService
public interface OrderWs {
    @WebMethod
    public Order getOrderById(int id);
}
