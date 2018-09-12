package com.example.network_transmission.编解码和序列化.jdk;

import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.codec.serialization.ClassResolvers;
import io.netty.handler.codec.serialization.ObjectDecoder;
import io.netty.handler.codec.serialization.ObjectEncoder;

public class Client {
    public static void main(String[] args) throws Exception {


        EventLoopGroup group = new NioEventLoopGroup();
        Bootstrap b = new Bootstrap();
        b.group(group)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<SocketChannel>() {
                    @Override
                    protected void initChannel(SocketChannel sc) {
                        sc.pipeline().addLast(new ObjectEncoder());
                        sc.pipeline().addLast(new ObjectDecoder(Integer.MAX_VALUE,ClassResolvers.cacheDisabled(null)));
                        sc.pipeline().addLast(new ClientHandler(20));
                    }
                });

        ChannelFuture cf = b.connect("127.0.0.1", 8765).sync();

        cf.channel().closeFuture().sync();
        group.shutdownGracefully();
    }
}