package structuretype.decorator.newfunction.many;

import structuretype.decorator.newfunction.one.HookHouseDecorator;
import structuretype.decorator.newfunction.one.House;
import structuretype.decorator.newfunction.one.IHouse;

import java.io.*;
import java.util.zip.CRC32;
import java.util.zip.CheckedInputStream;

/**
 * @author cgg
 * @version 1.0
 * @date 2021/3/15
 */
public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        IHouse house = new House();
        house.live();

        IMirrorHouse mirrorHouse = new MirrorHouseDecorator(new HookHouseDecorator(house));
        mirrorHouse.live();
        mirrorHouse.lookMirror();
        /**
         * 尝试进行多次装饰失败，因为装饰器之间不能存在依赖关系，新增功能 即半透明装饰器模式 的装饰，不能进行多次装饰
         */
//        mirrorHouse.hangThings();

        //java io 是典型的装饰器模式
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("test.xml"));
        new DataInputStream(new CheckedInputStream(new BufferedInputStream(new FileInputStream("xx")), new CRC32()));
        //DataInputStream、 BufferedOutputStream 、CheckedInputStream 都是装饰器类
        //FilterInputStream是装饰器的父类，内部有 目标类InputStream。装饰器类通过继承FilterInputStream
        //就具有了目标类InputStream属性， 从而可以进行装饰增强。
        //源码解读：BufferedOutputStream并没有增加 InputStream 没有的方法，所以使用的是全透明模式
        //而DataInputStream 增加了readLong等方法，属于半透明模式
    }
}
