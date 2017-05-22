package rmi.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiProxyFactoryBean;

/**
 * Name: admin
 * Date: 2017/5/22
 * Time: 14:18
 */
@Configuration
@ComponentScan
public class SpringHelloClientConfig {

    @Bean
    public RmiProxyFactoryBean pringHello(){
        RmiProxyFactoryBean rmiProxy = new RmiProxyFactoryBean();
        rmiProxy.setServiceUrl("rmi://localhost:8088/hello");
        rmiProxy.setServiceInterface(ISpringHello.class);
        return rmiProxy;
    }
}
