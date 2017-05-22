package rmi.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Name: admin
 * Date: 2017/5/22
 * Time: 14:54
 */
public class HelloHost {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring/rmi_server_context.xml");
        System.out.println("RMI服务伴随Spring的启动而启动了.....");
    }
}
