package rmi.spring;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.rmi.RmiServiceExporter;

/**
 * Name: admin
 * Date: 2017/5/22
 * Time: 14:04
 */
@Configuration
@ComponentScan
public class ServiceConfig {

    /**
     * 使用RmiServiceExporter将SpringHelloImpl发布为RMI服务的最简单方式是在
     Spring中使用如下的@Bean方法进行配置
     * @param iSpringHello
     * @return
     */
/*    @Autowired
    ISpringHello iSpringHello;*/

    @Bean
    public RmiServiceExporter rmiServiceExporter(ISpringHello iSpringHello){
        RmiServiceExporter rmiServiceExporter = new RmiServiceExporter();
        rmiServiceExporter.setService(iSpringHello);
        rmiServiceExporter.setServiceName("hello");//serviceName属性命名了RMI服务
        rmiServiceExporter.setServiceInterface(ISpringHello.class);//serviceInterface属性指定了此服务所实现的接口
        rmiServiceExporter.setRegistryHost("localhost");
        rmiServiceExporter.setRegistryPort(8088);
        return rmiServiceExporter;
    }

/*    public void afterPropertiesSet() throws Exception {
        rmiServiceExporter(iSpringHello);
    }*/
}
