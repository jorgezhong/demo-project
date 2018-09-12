package com.example.demo;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Project <demo-project>
 * Created by jorgezhong on 2018/8/24 13:56.
 */
public class DistributedClient {
    private static final String connectionString = "192.168.0.247:2181,192.168.0.247:2182,192.168.0.247:2183";
    private static final int sessionTimeout = 2000;
    private static final String parentNode = "/servers";

    /**
     * 注意：加volitile的意义何在？
     * 多线程环境下全局变量会拷贝一份到各自线程的工作空间，修改的是各自线程的变量，计算完再写入主存中
     * 这个过程发生再主存和高速缓存中。
     * 当一个共享变量被volatile修饰时，它会保证修改的值会立即被更新到主存，当有其他线程需要读取时，它会去内存中读取新值
     * <p>
     * <p>
     * volatile是多线程使用同一个变量空间，大家修改的是一样的
     */
    private volatile List<String> serverList;
    private ZooKeeper zk = null;


    public void getConnect() throws IOException {

        zk = new ZooKeeper(connectionString, sessionTimeout, event -> {
            //收到事件通知后的回调函数（自定义事件处理逻辑）
            try {

                //监听到事件之后更新列表，并注册监听
                getServerList();
            } catch (Exception e) {
                e.printStackTrace();
            }

        });

    }


    /**
     * 获取服务器信息列表
     *
     * @throws Exception
     */
    public void getServerList() throws Exception {
        //获取父节点的所有子节点并对父节点进行监听
        List<String> children = zk.getChildren(parentNode, true);

        ArrayList<String> servers = new ArrayList<>();

        for (String child : children) {
            //child是子节点的节点名
            byte[] data = zk.getData(parentNode + "/" + child, false, null);
            servers.add(new String(data));

        }

        //赋值写入，比较快速。提供给各个业务线程使用
        serverList = servers;

        System.out.println(serverList);


    }


    /**
     * 业务功能
     */
    public void handleBusiness() throws InterruptedException {
        System.out.println("client start working...");
        Thread.sleep(Long.MAX_VALUE);
    }


    public static void main(String[] args) throws Exception {

        //获取zk连接
        DistributedClient distributedClient = new DistributedClient();
        distributedClient.getConnect();

        //获取servers的子节点信息（并监听），从中获取服务器信息列表
        distributedClient.getServerList();
        //业务线程启动
        distributedClient.handleBusiness();
    }


}
