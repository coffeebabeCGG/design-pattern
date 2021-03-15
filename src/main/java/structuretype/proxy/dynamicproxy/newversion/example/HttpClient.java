package structuretype.proxy.dynamicproxy.newversion.example;

public class HttpClient implements IHttp {
    public void sendHttp(String data) {
        System.out.println("send http message");
    }

    public void onSuccess() {
        System.out.println("send http message success");
    }
}
