package structuretype.proxy.staticproxy.newversion.example;

/**
 * @author cgg
 */
public class Test {


    public static void main(String[] args) {

        HttpClient httpClient = new HttpClient();

        HttpClientProxy httpClientProxy = new HttpClientProxy(httpClient);

        httpClientProxy.sendHttp("data");

        httpClientProxy.onSuccess();
    }

}
