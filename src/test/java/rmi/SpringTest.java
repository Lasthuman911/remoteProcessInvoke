package rmi;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import rmi.spring.ISpringHello;
import rmi.spring.ServiceConfig;
import rmi.spring.SpringHelloClientConfig;
import rmi.spring.SpringHelloImpl;

import static org.junit.Assert.assertEquals;

/**
 * Name: admin
 * Date: 2017/5/22
 * Time: 14:30
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringHelloClientConfig.class,ServiceConfig.class})
public class SpringTest {

    @Autowired
    private ISpringHello springHello;


    @Test
    public void testHello(){
       assertEquals("Hello World!", springHello.helloWorld());
    }
}
