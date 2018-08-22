package com.example.protobuf.server;

import com.example.protobuf.proto.SubscribeReqProto;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;
import io.netty.handler.codec.protobuf.ProtobufDecoder;
import io.netty.handler.codec.protobuf.ProtobufEncoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32FrameDecoder;
import io.netty.handler.codec.protobuf.ProtobufVarint32LengthFieldPrepender;

public class ServerChannelInitializer extends ChannelInitializer<SocketChannel> {
    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        //这是针对protobuf协议的ProtobufVarint32LengthFieldPrepender()所加的长度属性的解码器
        pipeline.addLast(new ProtobufVarint32FrameDecoder());
        //protobuf解码
        pipeline.addLast(new ProtobufDecoder(SubscribeReqProto.SubscribeReq.getDefaultInstance()));

        //对protobuf协议的的消息头上加上一个长度为32的整形字段，用于标志这个消息的长度。
        pipeline.addLast(new ProtobufVarint32LengthFieldPrepender());
        //protobuf编码
        pipeline.addLast(new ProtobufEncoder());
        pipeline.addLast(new ProtoBufServerHandler());
    }
}