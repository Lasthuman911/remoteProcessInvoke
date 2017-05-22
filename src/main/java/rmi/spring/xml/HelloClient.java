package rmi.spring.xml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import rmi.spring.ISpringHello;

import java.rmi.RemoteException;

/**
 * Name: admin
 * Date: 2017/5/22
 * Time: 14:56
 */
public class HelloClient {


    public static void main(String[] args) throws RemoteException {
        ApplicationContext ctx = new ClassPathXmlApplicationContext(
                "spring/rmi_client_context.xml");
        ISpringHello hs = (ISpringHello) ctx.getBean("helloWorld");
        System.out.println(hs.helloWorld());
        System.out.println(hs.sayHelloToSomeBody("Lavasoft"));
    }

}
