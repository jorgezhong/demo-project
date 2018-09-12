package com.example.network_transmission.编解码和序列化.model;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.Serializable;

public class Response implements Serializable { // 标记Serializable接口

    private String id;
    private String name;
    private String responseMessage;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getResponseMessage() {
        return responseMessage;
    }

    public void setResponseMessage(String responseMessage) {
        this.responseMessage = responseMessage;
    }


    public byte[] toByteArray() {
        ByteBuf buf = Unpooled.buffer(32);
        buf.writeBytes(this.getId().getBytes());
        buf.writeBytes(this.getName().getBytes());
        buf.writeBytes(this.getResponseMessage().getBytes());
        return buf.array();
    }

}