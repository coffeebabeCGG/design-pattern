package structuretype.proxy.staticproxy.newversion;

import structuretype.proxy.staticproxy.oldversion.IPerson;
import structuretype.proxy.staticproxy.oldversion.Person;

/**
 * @author cgg
 * 实现目标类的接口，才知道目标类的代理方法
 */
public class IPersonProxy implements IPerson {

    private Person person;

    public void IPersonProxy(Person person) {
        System.out.println("开始代理");
        this.person = person;
    }

    public void eat() {
        System.out.println("开始代理");
        this.person.eat();
    }

    public void sleep() {
        this.person.sleep();
    }



}
