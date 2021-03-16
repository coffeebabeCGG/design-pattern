package structuretype.proxy.dynamicproxy.newversion.example;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.sql.Connection;

public class MyHandler implements InvocationHandler {

    private Connection connection;

    void init(Connection connection) {
        this.connection = connection;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //如果是关闭连接的方法，进行业务增强
        if (method.getName().equals("close")) {
            //如果当前活跃连接数小于核心连接数量，则不关闭此连接，将连接放入池子中,活跃连接数-1
            if (CGPool.dyCount < CGPool.activeCount) {
                CGPool.setPool.add((Connection) proxy);
            }else if(CGPool.dyCount == CGPool.activeCount) {
            } else {
                //否则关闭此链接。活跃连接数大于或者等于核心连接数，活跃连接数-1,池子中移除此链接
                if (connection != null) {
                    CGPool.setPool.remove(proxy);
                    method.invoke(connection,args);
                }
            }
            CGPool.dyCount--;
            return null;
        }else {
            return method.invoke(connection,args);
        }
    }
}
