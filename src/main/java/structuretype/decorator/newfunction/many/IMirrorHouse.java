package structuretype.decorator.newfunction.many;

/**
 * @author cgg
 * @version 1.0
 * @date 2021/3/15
 */

import structuretype.decorator.newfunction.one.IHouse;

/**
 *  IMirrorHouse 可以继承自 IHookHouse
 *  这样做会使得两个装饰类之间存在依赖关系，装饰器之间不能有依赖关系，应该在原本的类上装饰
 *  这表示 半透明模式中（即新增功能模式中），无法进行多次装饰。
 */
public interface IMirrorHouse extends IHouse {

    public void lookMirror();
}
