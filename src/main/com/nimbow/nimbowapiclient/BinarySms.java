package com.nimbow.nimbowapiclient;

/**
 * Created by Nimbow on 08/12/2015.
 */
public class BinarySms extends Sms {

    private byte[] data;

    public BinarySms(String to, String from, byte[] data) {

        setTo(to);
        setFrom(from);
        setData(data);
        type = SmsType.Binary;

    }

    public byte[] getData() {

        return data;

    }

    public void setData(byte[] data) {

        this.data = data;
        this.text = ByteArrayHelper.toHexString(data);
    }


}
