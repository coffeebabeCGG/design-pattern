package structuretype.proxy.dynamicproxy.newversion.example;

import java.sql.Connection;

public class CGPoolTest {
    public static void main(String[] args) throws Exception{
        CGPool cgPool = new CGPool();
        cgPool.setDriveName("com.mysql.cj.jdbc.Driver");
        cgPool.setDbUrl("jdbc:mysql://127.0.0.1:3306/kiam?zeroDateTimeBehavior=CONVERT_TO_NULL&useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai");
        cgPool.setUserName("root");
        cgPool.setPassWord("654321");
        cgPool.setMaxCount(3);
        cgPool.setActiveCount(2);

        Connection connection1 = CGPool.getConnection();
        Connection connection2 = CGPool.getConnection();
        Connection connection3 = CGPool.getConnection();
        System.out.println(connection1.getClass() + " 1====" +connection1.toString());
        System.out.println(connection2.getClass() + " 2====" +connection2.toString());
        System.out.println(connection3.getClass() + " 3====" +connection3.toString());
        connection1.close();
        connection2.close();
        connection3.close();
        System.out.println("------------------------");
        Connection connection4 = CGPool.getConnection();
        Connection connection5 = CGPool.getConnection();
        Connection connection6 = CGPool.getConnection();
        System.out.println(connection4.getClass() + " 4====" +connection4.toString());
        System.out.println(connection5.getClass() + " 5====" +connection5.toString());
        System.out.println(connection6.getClass() + " 6====" +connection6.toString());
        connection4.close();
        connection5.close();
        connection6.close();
        System.out.println("------------------------");
        Connection connection7 = CGPool.getConnection();
        Connection connection8 = CGPool.getConnection();
        Connection connection9 = CGPool.getConnection();
        System.out.println(connection7.getClass() + " 7====" +connection7.toString());
        System.out.println(connection8.getClass() + " 8====" +connection8.toString());
        System.out.println(connection9.getClass() + " 9====" +connection9.toString());
        connection7.close();
        connection8.close();
        connection9.close();
        System.out.println("------------------------");
        Connection connection10 = CGPool.getConnection();
        Connection connection11 = CGPool.getConnection();
        Connection connection12 = CGPool.getConnection();
        System.out.println(connection10.getClass() + " 10====" +connection10.toString());
        System.out.println(connection11.getClass() + " 11====" +connection11.toString());
        System.out.println(connection12.getClass() + " 12====" +connection12.toString());
    }
}
