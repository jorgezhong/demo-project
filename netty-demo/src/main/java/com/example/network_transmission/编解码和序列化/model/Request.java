package com.example.network_transmission.编解码和序列化.model;

import io.netty.buffer.ByteBuf;
import io.netty.buffer.Unpooled;

import java.io.Serializable;

/**
 * javabean
 *
 * @author jorge
 */
public class Request implements Serializable {  // 标记Serializable接口

    private String id;
    private String name;
    private String requestMessage;
    private byte[] attachment;

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

    public String getRequestMessage() {
        return requestMessage;
    }

    public void setRequestMessage(String requestMessage) {
        this.requestMessage = requestMessage;
    }

    public byte[] getAttachment() {
        return attachment;
    }

    public void setAttachment(byte[] attachment) {
        this.attachment = attachment;
    }


    public byte[] toByteArray() {
        ByteBuf buf = Unpooled.buffer(32);
        buf.writeBytes(this.getAttachment());
        buf.writeBytes(this.getId().getBytes());
        buf.writeBytes(this.getName().getBytes());
        buf.writeBytes(this.getRequestMessage().getBytes());
        return buf.array();
    }

}