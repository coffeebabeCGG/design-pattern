package structuretype.proxy.dynamicproxy.newversion.example;

/**
 * @author cgg
 *
 * 静态代理，不做侵入原有的HttplClient类，遵守单一职责，HttpClientProxy扩展功能，打印日志
 *
 * 和装饰器 模式较为相似，但装饰器模式是加强功能，而代理模式是做控制
 */
public class HttpClientProxy implements IHttp {
    private HttpClient httpClient;


    public HttpClientProxy(HttpClient httpClient) {
        this.httpClient = httpClient;
    }

    public void sendHttp(String data) {
        System.out.println("log record " + data);
        httpClient.sendHttp(data);
    }

    public void onSuccess() {
        System.out.println("log record");
        httpClient.onSuccess();
    }
}
