package com.example.demo;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.apache.zookeeper.ZooDefs.*;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/8/24 11:09.
 */
public class SimpleZkClient {


    private static final String connectionString = "192.168.0.247:2181,192.168.0.247:2182,192.168.0.247:2183";
    private static final int sessionTimeout = 2000;

    ZooKeeper zkClient = null;

    @Before
    public void init() throws Exception{

        zkClient = new ZooKeeper(connectionString, sessionTimeout, event -> {

            System.out.println(event.getType() + "---"+event.getPath());

            try {
                zkClient.getChildren("/",true);
            } catch (KeeperException | InterruptedException e) {
                e.printStackTrace();
            }

        });

    }


    @Test
    public void testCreate() throws KeeperException, InterruptedException {
        /**
         * 参数1：节点路径
         * 参数2：节点数据
         * 参数3：节点acl安全策略：在不需要进行任何权限控制时，只需传入Ids.OPEN_ACL_UNSAFE即可
         * 参数4：createMode 创建模式
         *          PERSISTENT 持久
         *          PERSISTENT_SEQUENTIAL 持久顺序
         *          EPHEMERAL 临时
         *          EPHEMERAL_SEQUENTIAL 临时顺序
         */
        zkClient.create("/eclipse", "hello zk".getBytes(), Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

    }

    /**
     * 判断zk是否存在
     * @throws KeeperException
     * @throws InterruptedException
     */
    @Test
    public void testExist() throws KeeperException, InterruptedException {
        Stat stat = zkClient.exists("/eclipse", false);
        System.out.println(stat == null ? "not exist" : "exist");
    }


    /**
     * 获取子节点
     * @throws KeeperException
     * @throws InterruptedException
     */
    @Test
    public void getChildren() throws KeeperException, InterruptedException {
        List<String> children = zkClient.getChildren("/", true);

        children.forEach(System.out::println);

        Thread.sleep(Long.MAX_VALUE);

    }


    /**
     * 获取节点数据
     * @throws KeeperException
     * @throws InterruptedException
     */
    @Test
    public void getData() throws KeeperException, InterruptedException {

        byte[] data = zkClient.getData("/eclipse", false, null);
        System.out.println( new String(data));

    }


    /**
     * 删除节点
     * @throws KeeperException
     * @throws InterruptedException
     */
    @Test
    public void deleteZnode() throws KeeperException, InterruptedException {

        /**
         * 参数1：节点路径
         * 参数2：版本，-1表示所有的版本
         */
        zkClient.delete("/eclipse",-1);

    }


    /**
     * 修改节点数据
     * @throws KeeperException
     * @throws InterruptedException
     */
    @Test
    public void setData() throws KeeperException, InterruptedException {

        /**
         * 参数1：节点路径
         * 参数2：版本，-1表示所有的版本
         */
        zkClient.setData("/app1", "jorgezhong".getBytes(), -1);

        byte[] data = zkClient.getData("/app1", false, null);


        System.out.println( new String(data));
    }





}
