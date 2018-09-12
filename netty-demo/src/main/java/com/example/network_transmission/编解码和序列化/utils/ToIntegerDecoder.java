package com.example.network_transmission.编解码和序列化.utils;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.handler.codec.ByteToMessageDecoder;

import java.util.List;

/**
 * 每次从入站 ByteBuf 中读取 4 字节，将其解码为一个 int，然后将它添加到一个 List 中。
 * 当没有更多的元素可以被添加到该 List 中时，它的内容将会被发送给下一个 ChannelInboundHandler。
 */
public class ToIntegerDecoder extends ByteToMessageDecoder {
    @Override
    public void decode(ChannelHandlerContext ctx, ByteBuf in,
                       List<Object> out) {
        if (in.readableBytes() >= 4) {
            out.add(in.readInt());
        }
    }
}