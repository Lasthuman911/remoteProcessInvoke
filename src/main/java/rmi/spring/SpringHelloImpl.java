package rmi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

/**
 * Name: admin
 * Date: 2017/5/22
 * Time: 11:47
 */
@Component
public class SpringHelloImpl implements ISpringHello {
    public String helloWorld() {
        return "Hello World!";
    }

    public String sayHelloToSomeBody(String someBodyName) {
        return "你好，" + someBodyName + "!";
    }
}
