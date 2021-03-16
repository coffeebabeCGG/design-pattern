package structuretype.proxy.dynamicproxy.newversion;

import structuretype.proxy.staticproxy.newversion.example.HttpClient;
import structuretype.proxy.staticproxy.newversion.example.IHttp;

/**
 * @author cgg
 * @version 1.0
 * @date 2021/3/16
 */
public class Test {

    public static void main(String[] args) {
        HttpClient httpClient = new HttpClient();

        //生成httpClient 的代理类
        IHttp proxy = new HttpProxy().getInstance(httpClient);
        proxy.sendHttp("hhahaha");

        proxy.onSuccess();
    }
}
