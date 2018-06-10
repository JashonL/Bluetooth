package com.test.BTClient;

/**
 * Created by Administrator on 2018/6/1.
 */

public class BluetoothBean {
    //帧头1
    private byte frame;
    //帧头2
    private byte frame2;
    //协议类型
    private byte Protocol;
    //加密类型
    private byte Encryption;
    //消息类型
    private byte Cmd;
    //数据长度
    private byte DataLen;
    //有效数据（加密）
    private byte[] Payload;
    //数据校验
    private byte sum;
    //结束符
    private byte end;

    public byte getFrame() {
        return frame;
    }

    public void setFrame(byte frame) {
        this.frame = frame;
    }

    public byte getFrame2() {
        return frame2;
    }

    public void setFrame2(byte frame2) {
        this.frame2 = frame2;
    }

    public byte getProtocol() {
        return Protocol;
    }

    public void setProtocol(byte protocol) {
        Protocol = protocol;
    }

    public byte getEncryption() {
        return Encryption;
    }

    public void setEncryption(byte encryption) {
        Encryption = encryption;
    }

    public byte getCmd() {
        return Cmd;
    }

    public void setCmd(byte cmd) {
        Cmd = cmd;
    }

    public byte getDataLen() {
        return DataLen;
    }

    public void setDataLen(byte dataLen) {
        DataLen = dataLen;
    }

    public byte[] getPayload() {
        return Payload;
    }

    public void setPayload(byte[] payload) {
        Payload = payload;
    }

    public byte getSum() {
        return sum;
    }

    public void setSum(byte sum) {
        this.sum = sum;
    }

    public byte getEnd() {
        return end;
    }

    public void setEnd(byte end) {
        this.end = end;
    }
}
