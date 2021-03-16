package structuretype.proxy.staticproxy.newversion;

import structuretype.proxy.staticproxy.oldversion.Person;

/**
 * @author cgg
 */
public class TestProxy {
    public static void main(String[] args) {
        Person person = new Person();
        IPersonProxy personProxy = new IPersonProxy();
        //通过代理类来进行目标方法的调用，方法名一致是因为代理类实现了目标类的接口
        personProxy.eat();
        personProxy.sleep();

    }
}
