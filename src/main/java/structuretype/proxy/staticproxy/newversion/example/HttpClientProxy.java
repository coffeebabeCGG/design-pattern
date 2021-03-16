package structuretype.proxy.staticproxy.newversion.example;

/**
 * @author cgg
 *
 * 静态代理，不做侵入原有的HttplClient类，遵守单一职责，HttpClientProxy扩展功能，打印日志
 *
 * 和装饰器 模式较为相似，但装饰器模式是加强功能，而代理模式是做控制
 */
public class HttpClientProxy implements IHttp {

    /**
     * 装饰器模式这里必须是接口，
     * 因为可以多次装饰，代理模式只是一个需要增强控制的目标类即可，不一定非得接口
     */
    private IHttp httpClient;

    public HttpClientProxy(IHttp httpClient) {
        this.httpClient = httpClient;
    }


    @Override
    public void sendHttp(String data) {
        System.out.println("log record " + data);
        httpClient.sendHttp(data);
    }
    @Override
    public void onSuccess() {
        System.out.println("log record");
        httpClient.onSuccess();
    }
}
