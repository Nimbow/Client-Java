package com.nimbow.nimbowapiclient;


import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nimbow on 08/12/2015.
 */
class SmsRequest implements IRequest {

    private String from;
    private String to;
    private String text;
    private String clientRef;
    private SmsType type;
    private boolean flash = false;
    private boolean test = false;
    private boolean getMessageId = true;
    private boolean getMessageParts = true;
    private boolean getFrom = true;
    private boolean getTo = true;
    private boolean getNetCost = true;
    private boolean getDeliveryReport = true;

    private SmsRequest(Builder builder) {

        setTo(builder.to);
        setFrom(builder.from);
        setText(builder.text);
        setType(builder.type);
        setGetDeliveryReport(builder.getDeliveryReport);
        setClientRef(builder.clientRef);
        setIsFlash(builder.flash);
        setGetFrom(builder.getFrom);
        setGetMessageId(builder.getMessageId);
        setGetTo(builder.getTo);
        setGetMessageParts(builder.getMessageParts);
        setGetNetCost(builder.getNetCost);
        setTest(builder.test);

    }

    @Override
    public Map<String, String> getParameters() {

        Map<String, String> params = new HashMap<>();
        if (type != SmsType.Gsm) {
            params.put("Type", type.toString());
        }
        if (from != null && !from.isEmpty()) {
            params.put("From", from);
        }
        if (to != null && !to.isEmpty()) {
            params.put("To", to);
        }
        params.put("Text", text);
        if (clientRef != null && !clientRef.isEmpty()) {
            params.put("ClientRef", clientRef);
        }
        if (test) {
            params.put("Test", "1");
        }
        if (flash) {
            params.put("Test", "1");
        }
        if (getMessageId) {
            params.put("GetMessageId", "1");
        }
        if (getMessageParts) {
            params.put("GetMessageParts", "1");
        }
        if (getFrom) {
            params.put("GetFrom", "1");
        }
        if (getTo) {
            params.put("GetTo", "1");
        }
        if (!getDeliveryReport) {
            params.put("GetDeliveryReport", "0");
        }
        if (getNetCost) {
            params.put("GetNetCost", "1");
        }

        return params;

    }

    public String getFrom() {

        return from;
    }

    public void setFrom(String from) {

        this.from = from;
    }

    public String getTo() {

        return to;
    }

    public void setTo(String to) {

        this.to = to;
    }

    public String getText() {

        return text;
    }

    public void setText(String text) {

        this.text = text;
    }

    public String getClientRef() {

        return clientRef;
    }

    public void setClientRef(String clientRef) {

        this.clientRef = clientRef;
    }

    public SmsType getType() {

        return type;
    }

    public void setType(SmsType type) {

        this.type = type;
    }

    public boolean getIsFlash() {

        return flash;
    }

    public void setIsFlash(boolean flash) {

        this.flash = flash;
    }

    public boolean getTest() {

        return test;
    }

    public void setTest(boolean test) {

        this.test = test;
    }

    public boolean getGetMessageId() {

        return getMessageId;
    }

    public void setGetMessageId(boolean getMessageId) {

        this.getMessageId = getMessageId;
    }

    public boolean getGetMessageParts() {

        return getMessageParts;
    }

    public void setGetMessageParts(boolean getMessageParts) {

        this.getMessageParts = getMessageParts;
    }

    public boolean getGetFrom() {

        return getFrom;
    }

    public void setGetFrom(boolean getFrom) {

        this.getFrom = getFrom;
    }

    public boolean getGetTo() {

        return getTo;
    }

    public void setGetTo(boolean getTo) {

        this.getTo = getTo;
    }

    public boolean getGetNetCost() {

        return getNetCost;
    }

    public void setGetNetCost(boolean getNetCost) {

        this.getNetCost = getNetCost;
    }

    public boolean getGetDeliveryReport() {

        return getDeliveryReport;
    }

    public void setGetDeliveryReport(boolean getDeliveryReport) {

        this.getDeliveryReport = getDeliveryReport;
    }

    public static class Builder {

        private String from;

        private String to;

        private String text;

        private String clientRef;

        private SmsType type;

        private boolean flash = false;

        private boolean test = false;

        private boolean getMessageId = true;

        private boolean getMessageParts = true;

        private boolean getFrom = true;

        private boolean getTo = true;

        private boolean getNetCost = true;

        private boolean getDeliveryReport = true;

        Builder(String to, String from, String text, SmsType type) {

            this.to = to;
            this.from = from;
            this.text = text;
            this.type = type;
        }

        public Builder clientRef(String clientRef) {

            this.clientRef = clientRef;
            return this;
        }

        public Builder isFlash(boolean flash) {

            this.flash = flash;
            return this;
        }

        public Builder isTest(boolean test) {

            this.test = test;
            return this;
        }

        public Builder getMessageId(boolean getMessageId) {

            this.getMessageId = getMessageId;
            return this;
        }

        public Builder getMessageParts(boolean getMessageParts) {

            this.getMessageParts = getMessageParts;
            return this;
        }

        public Builder getFrom(boolean getFrom) {

            this.getFrom = getFrom;
            return this;
        }

        public Builder getTo(boolean getTo) {

            this.getTo = getTo;
            return this;
        }

        public Builder getNetCost(boolean getNetCost) {

            this.getNetCost = getNetCost;
            return this;
        }

        public Builder getDeliveryReport(boolean getDeliveryReport) {

            this.getDeliveryReport = getDeliveryReport;
            return this;
        }

        public SmsRequest build() {

            return new SmsRequest(this);
        }

    }

}
