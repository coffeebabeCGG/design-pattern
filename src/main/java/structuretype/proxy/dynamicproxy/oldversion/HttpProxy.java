package structuretype.proxy.dynamicproxy.oldversion;

import structuretype.proxy.staticproxy.newversion.example.HttpClient;

import java.util.Objects;

/**
 * @author cgg
 * @version 1.0
 * @date 2021/3/15
 */
public class HttpProxy {

    private HttpClient httpClient;

    public HttpProxy(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    //调用 httpClient的任意方法，都要通过这个方法间接调用
    //如何实现调用目标类的任意方法，都通过这个方法间接调用，jdk使用了接口约束，实现InvocationHandler，那么
    //代理类 实现接口后，通过重写invoke 方法，调用目标类的所有方法时候，都会通过代理类的实现invoke 来调用
    public void visit(String methodName, Object[] args) {
        if (methodName.equals("sendHttp")) {
            System.out.println(" send data is " + args[0]);
            httpClient.sendHttp(args[0].toString());
        }else if (methodName.equals("onSuccess")) {
            System.out.println("send data is success");
            httpClient.onSuccess();
        }
    }
}
