package com.example.network_transmission.编解码和序列化.model;

import java.io.Serializable;

/**
 * 自定义一个对象
 */
public class Msg implements Serializable {
    private byte header;
    private String body;
    private long length;
    private byte type;

    public byte getHeader() {
        return header;
    }

    public void setHeader(byte header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public byte getType() {
        return type;
    }

    public void setType(byte type) {
        this.type = type;
    }
}