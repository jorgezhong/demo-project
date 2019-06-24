package com.example.iterator.demo1;

import java.util.ArrayList;
import java.util.List;

/**
 * 自定义聚合类
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/11 9:35.
 */
public class ConcreteMyAggregate {

    /**
     * 定义容器
     */
    private List<Object> list = new ArrayList<>();


    public void addObject(Object obj) {
        this.list.add(obj);
    }


    public void removeObject(Object obj) {
        this.list.remove(obj);
    }


    public List<Object> getList() {
        return list;
    }

    public ConcreteMyAggregate setList(List<Object> list) {
        this.list = list;
        return this;
    }


    /**
     * 外部类定义获得迭代器的方法
     * @return
     */
    public MyIterator createIterator() {
        return new ConcreteIterator();
    }

    /**
     * 使用内部类定义迭代器
     */
    private class ConcreteIterator implements MyIterator {

        /**
         * 定义游标，用于记录遍历时的位置，默认0
         */
        private int cursor;

        @Override
        public void first() {
            cursor = 0;
        }

        @Override
        public void next() {
            if (list.size() > cursor) {
                cursor++;
            }
        }

        @Override
        public boolean hasNext() {
            return list.size()  > cursor;
        }

        @Override
        public boolean isFirst() {
            return cursor == 0;
        }

        @Override
        public boolean isLast() {
            return cursor == list.size() - 1;
        }

        @Override
        public Object getCurrentObj() {
            return list.get(cursor);
        }
    }

}
