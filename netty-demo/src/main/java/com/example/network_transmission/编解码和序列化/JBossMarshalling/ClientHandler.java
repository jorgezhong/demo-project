package com.example.network_transmission.编解码和序列化.JBossMarshalling;

import com.example.network_transmission.编解码和序列化.model.Msg;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class ClientHandler extends ChannelInboundHandlerAdapter {
    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        if(msg instanceof String){
            System.out.println(msg);
        }else{
            Msg m = (Msg)msg;
            System.out.println("client: "+m.getBody());
        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        Msg msg = new Msg();
        msg.setHeader((byte)0xa);
        msg.setLength(34);
        msg.setBody("放纵自己，你好兄弟");

        ctx.writeAndFlush(msg);
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("Client is close");
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {

        cause.printStackTrace();
        ctx.close();
    }
}