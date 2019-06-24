package com.example.iterator.demo1;

/**
 * 自定义迭代器接口
 *     - 提供聚合对象的遍历方法
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/11 9:31.
 */
public interface MyIterator {

    /**
     * 将游标指向第一个
     */
    void first();

    /**
     * 将游标指向下一个
     */
    void next();

    /**
     * 判断是否存在下一个对象
     * @return
     */
    boolean hasNext();

    /**
     * 判断是否指向第一个对象
     * @return
     */
    boolean isFirst();

    /**
     * 判断是否指向最后一个对象
     * @return
     */
    boolean isLast();

    /**
     * 获取当前游标指向的对象
     * @return
     */
    Object getCurrentObj();
}
