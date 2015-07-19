package spring.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import spring.dao.Order;
import spring.dao.OrderWs;

/******************************************************
 * ****** Created by ����� on 2015/7/19.11:31
 * ****************************************************
 */
public class ClientTest {

    public static void main(String[] args) {
        /**
         * ���������ļ�
         */
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]  {"classpath:config/client_beans.xml"});
        OrderWs orderWS = (OrderWs) context.getBean("orderWS");
        Order order = orderWS.getOrderById(24);
        System.out.println(order);
    }
}
