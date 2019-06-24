package com.example.demo;

import org.apache.zookeeper.CreateMode;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooDefs;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;

/**
 * Project <demo1-project>
 * Created by jorgezhong on 2018/8/24 13:38.
 */
public class DistributedServer {

    private static final String connectionString = "192.168.0.247:2181,192.168.0.247:2182,192.168.0.247:2183";
    private static final int sessionTimeout = 2000;
    private static final String parentNode = "/servers";

    private ZooKeeper zk = null;


    public void getConnect() throws IOException {

        zk = new ZooKeeper(connectionString, sessionTimeout, event -> {

            System.out.println(event.getType() + "---" + event.getPath());

            try {
                zk.getChildren("/", true);
            } catch (KeeperException | InterruptedException e) {
                e.printStackTrace();
            }

        });

    }

    /**
     * 向zk集群注册服务器
     * @param hostname
     * @throws KeeperException
     * @throws InterruptedException
     */
    public void registerServer(String hostname) throws KeeperException, InterruptedException {
        String create = zk.create(parentNode + "/server", hostname.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println(hostname + " is online.. " + create);
    }

    /**
     * 业务功能
     */
    public void handleBusiness(String hostname) throws InterruptedException {
        System.out.println(hostname + " start working...");
        Thread.sleep(Long.MAX_VALUE);
    }

    public static void main(String[] args) throws IOException, KeeperException, InterruptedException {


        //获取zk连接
        DistributedServer distributedServer = new DistributedServer();
        distributedServer.getConnect();

        //利用zk注册服务器信息
        distributedServer.registerServer(args[0]);

        //启动业务功能
        distributedServer.handleBusiness(args[0]);

    }


}
