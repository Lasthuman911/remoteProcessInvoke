package rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * 定义一个远程接口，必须继承Remote接口，其中需要远程调用的方法必须抛出RemoteException异常
 * Remote 接口是一个标识接口，用于标识所包含的方法可以从非本地虚拟机上调用的接口，Remote接口本身不包含任何方法
 */
public interface IHello extends Remote {

    /**
     * 简单的返回“Hello World！"字样
     * @return 返回“Hello World！"字样
     * @throws java.rmi.RemoteException 由于远程方法调用的本质依然是网络通信，
     * 只不过隐藏了底层实现，网络通信是经常会出现异常的，所以接口的所有方法都必须抛出RemoteException以说明该方法是有风险的
     */
    public String helloWorld() throws RemoteException;

    /**
     * 一个简单的业务方法，根据传入的人名返回相应的问候语
     * @param someBodyName  人名
     * @return 返回相应的问候语
     * @throws java.rmi.RemoteException
     */
    public String sayHelloToSomeBody(String someBodyName) throws RemoteException;
}