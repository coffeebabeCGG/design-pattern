package structuretype.proxy.staticproxy.newversion.example;

/**
 * @author cgg
 */
public class HttpClient implements IHttp {
    @Override
    public void sendHttp(String data) {
        System.out.println("send http message");
    }
    @Override
    public void onSuccess() {
        System.out.println("send http message success");
    }
}
