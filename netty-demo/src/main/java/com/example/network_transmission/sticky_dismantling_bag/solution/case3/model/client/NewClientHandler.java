package com.example.network_transmission.sticky_dismantling_bag.solution.case3.model.client;

import com.example.network_transmission.sticky_dismantling_bag.solution.case3.model.Message;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

public class NewClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        String m = "你好啊,Netty。昂昂";
        Message msg = new Message((byte)0xCA, m.length(), m);
        ctx.writeAndFlush(msg);
    }
}

/*
注意到在handler中我们发送了一个Message对象。然后会由NewEncoder编码发送出去，服务端对消息解码获得消息头和消息体。分别启动服务端和客户端，打印结果为*/
