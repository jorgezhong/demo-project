package com.example.network_transmission.编解码和序列化.jdk;

import com.example.network_transmission.编解码和序列化.model.Person;
import io.netty.buffer.Unpooled;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Administrator
 */
public class ClientHandler extends ChannelInboundHandlerAdapter {


    private final List<Person> message;

    public ClientHandler(int messageSize) {
        if (messageSize <= 0) {
            throw new IllegalArgumentException("firstMessageSize: "
                    + messageSize);
        }
        message = new ArrayList<>(messageSize);
        for (int i = 0; i < messageSize; i++) {
            Person person = new Person();
            person.setId(i);
            person.setName("jorge - " + i);
            message.add(person);

        }
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        // Send the message to Server
        super.channelActive(ctx);
        ctx.writeAndFlush(message);

    }

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) {
        // you can use the Object from Server here
        System.out.println(msg);
        ctx.close();
    }

    @Override
    public void channelReadComplete(ChannelHandlerContext ctx) {
        ctx.channel().flush();
        ctx.writeAndFlush(Unpooled.EMPTY_BUFFER).addListener(ChannelFutureListener.CLOSE);
    }

    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) {
        cause.printStackTrace();
        ctx.close();
    }
}