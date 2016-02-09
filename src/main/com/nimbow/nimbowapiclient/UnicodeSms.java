package com.nimbow.nimbowapiclient;

import com.google.common.base.Charsets;

/**
 * Created by Nimbow on 02/02/2016.
 */
public class UnicodeSms extends Sms {

    public UnicodeSms(String to, String from, String text) {

        setTo(to);
        setFrom(from);
        setText(text);
        this.type = SmsType.Unicode;

    }

    public void setText(String text) {

        this.text = ByteArrayHelper.toHexString(text.getBytes(Charsets.UTF_8));
        this.text = text;

    }

}
