package structuretype.proxy.dynamicproxy.newversion;

import structuretype.proxy.staticproxy.newversion.example.HttpClient;
import structuretype.proxy.staticproxy.newversion.example.IHttp;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author cgg
 * @version 1.0
 * @date 2021/3/15
 *
 */
public class HttpProxy implements InvocationHandler {

    private HttpClient httpClient;

    public IHttp getInstance(HttpClient httpClient) {
        this.httpClient = httpClient;
        return (IHttp) Proxy.newProxyInstance(httpClient.getClass().getClassLoader(), httpClient.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (method.getName().equals("sendHttp")) {
            System.out.println("send message by proxy " + args[0]);
            return method.invoke(httpClient, args);
        }else if(method.getName().equals("onSuccess")) {
            System.out.println("receive message success by proxy");
            return method.invoke(httpClient);
        }
        return null;
    }
}
