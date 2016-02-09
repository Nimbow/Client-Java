package com.nimbow.nimbowapiclient;

/**
 * Created by Nimbow on 08/12/2015.
 */
public class TextSms extends Sms {

    public TextSms(String to, String from, String text) {

        setTo(to);
        setFrom(from);
        setText(text);
        this.type = SmsType.Gsm;

    }

    public void setText(String text) {

        this.text = text;

    }

}
