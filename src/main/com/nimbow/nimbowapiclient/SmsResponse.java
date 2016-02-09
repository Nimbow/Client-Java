package com.nimbow.nimbowapiclient;

import com.google.api.client.util.Key;

/**
 * Created by Nimbow on 09/12/2015.
 */
public class SmsResponse implements ISmsResponse {
    @Key("StatusCode")
    private Integer statusCode;
    @Key("MessageId")
    private String messageId;
    @Key("MessageParts")
    private Integer messageParts;
    @Key("From")
    private String from;
    @Key("To")
    private String to;
    @Key("NetCost")
    private Float netCost;

    public StatusCode getStatusCode() {

        return StatusCode.get(statusCode);
    }

    public String getMessageId() {

        return this.messageId;
    }

    public Integer getMessageParts() {

        return this.messageParts;
    }

    public String getFrom() {

        return this.from;
    }

    public String getTo() {

        return this.to;
    }

    public Float getNetCost() {

        return this.netCost;
    }
}