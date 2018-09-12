package com.example.network_transmission.sticky_dismantling_bag.solution.case3.model.server;

import com.example.network_transmission.sticky_dismantling_bag.solution.case3.model.Message;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class NewServerHandler extends SimpleChannelInboundHandler<Object> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, Object o) throws Exception {
        if(o instanceof Message) {
            Message msg = (Message)o;
            System.out.println("Client->Server:"+channelHandlerContext.channel().remoteAddress()+" send "+msg.getMsgBody());
        }
    }
}

/*
在handler中我们用来接收已经被NewDecoder解码过后的客户端发送过来的消息*/
