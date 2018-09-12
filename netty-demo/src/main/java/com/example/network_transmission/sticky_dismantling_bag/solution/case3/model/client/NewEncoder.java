package com.example.network_transmission.sticky_dismantling_bag.solution.case3.model.client;

import com.example.network_transmission.sticky_dismantling_bag.solution.case3.model.Message;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.MessageToByteEncoder;

import java.nio.charset.Charset;

public class NewEncoder extends MessageToByteEncoder<Message> {

    @Override
    protected void encode(ChannelHandlerContext channelHandlerContext, Message message, ByteBuf byteBuf) throws Exception {
        if (message == null) {
            throw new Exception("未获得消息内容");
        }

        String msgBody = message.getMsgBody();
        byte[] b = msgBody.getBytes(Charset.forName("utf-8"));
        byteBuf.writeByte(message.getType());
        byteBuf.writeByte(b.length);
        byteBuf.writeBytes(b);

    }
}
/*

客户端中我们又定义了一个编码器NewEncoder，继承了MessageToByteEncoder，该类用于将文本信息转换为流：*/
