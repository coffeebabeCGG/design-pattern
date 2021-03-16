package structuretype.proxy.dynamicproxy.newversion.example;


import java.lang.reflect.Proxy;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CGPool {

    private static String driveName;
    private static String dbUrl;
    private static String userName;
    private static String passWord;
    public static int maxCount; //最大连接数 池子的大小。
    public static int activeCount; //核心连接数，超过核心连接数则关闭连接，未超过核心连接数则保存链接到池子。
    public static int dyCount; //当前活跃连接数。

    public static Set<Connection> setPool = new HashSet<>(maxCount);



    public static Connection getConnection() throws Exception{
        //当前活跃连接数是小于等于最大连接数，如果大于最大数量，则活跃数量太多，超时等待
        if (dyCount <= maxCount){
            //如果池子不为空，且当前池子中的连接数量大于活跃连接数，则返回池子中的链接，无需创建新的连接，表示又可以使用的连接
            if (!setPool.isEmpty() && setPool.size() > dyCount) {
                List<Connection> lst = new ArrayList<Connection>(setPool);
                Connection connection = lst.get(dyCount);
//                CGPool.setPool.remove(connection);
                dyCount++;
                return connection;
            }
            //否则，新创建一个连接并放入池子中，活跃数量加1，核心连接数量+1
            Class.forName(driveName);
            Connection connection = DriverManager.getConnection(dbUrl, userName ,passWord);
            MyHandler handler = new MyHandler();
            handler.init(connection);
            Connection proxyConnection = (Connection) Proxy.newProxyInstance(connection.getClass().getClassLoader(),
                connection.getClass().getInterfaces(), handler);
            setPool.add(proxyConnection);
            dyCount++;
            return proxyConnection;
        }
        //连接池没有空闲连接，设置超时等待
        return null;
    }

    public String getDriveName() {
        return driveName;
    }

    public void setDriveName(String driveName) {
        this.driveName = driveName;
    }

    public String getDbUrl() {
        return dbUrl;
    }

    public void setDbUrl(String dbUrl) {
        this.dbUrl = dbUrl;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public int getMaxCount() {
        return maxCount;
    }

    public void setMaxCount(int maxCount) {
        this.maxCount = maxCount;
    }

    public int getActiveCount() {
        return activeCount;
    }

    public void setActiveCount(int activeCount) {
        this.activeCount = activeCount;
    }
}
