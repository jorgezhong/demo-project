package com.example.iterator.demo1;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2019/6/11 9:50.
 */
public class IteratorTest {


    public static void main(String[] args) {
        ConcreteMyAggregate cma = new ConcreteMyAggregate();

        cma.addObject("a");
        cma.addObject("b");
        cma.addObject("c");

        //获取迭代器
        MyIterator iterator = cma.createIterator();


        while (iterator.hasNext()){
            //备注：jdk集合对象只是将获取当前对象和游标下移合二为一了
            Object currentObj = iterator.getCurrentObj();
            System.out.println("currentObj = " + currentObj);
            //游标下移
            iterator.next();
        }

    }

}
