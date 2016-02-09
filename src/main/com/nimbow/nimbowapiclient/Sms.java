package com.nimbow.nimbowapiclient;

/**
 * Created by Nimbow on 08/12/2015.
 */
public abstract class Sms implements ISms {

    protected String text;
    protected SmsType type;
    private String from;
    private String to;
    private String clientRef;
    private boolean flash = false;
    private boolean test = false;
    private boolean getMessageId = true;
    private boolean getMessageParts = true;
    private boolean getFrom = true;
    private boolean getTo = true;
    private boolean getNetCost = true;
    private boolean getDeliveryReport = true;

    @Override
    public String getFrom() {

        return from;

    }

    @Override
    public void setFrom(String from) {

        this.from = from;

    }

    @Override
    public String getTo() {

        return to;

    }

    @Override
    public void setTo(String to) {

        this.to = to;

    }

    @Override
    public String getClientRef() {

        return clientRef;

    }

    @Override
    public void setClientRef(String clientRef) {

        this.clientRef = clientRef;

    }

    @Override
    public boolean getFlash() {

        return flash;

    }

    @Override
    public void setFlash(boolean flash) {

        this.flash = flash;

    }

    @Override
    public boolean isTest() {

        return test;

    }

    @Override
    public void setIsTest(boolean test) {

        this.test = test;

    }

    @Override
    public boolean getGetMessageId() {

        return getMessageId;

    }

    @Override
    public void setGetMessageId(boolean getMessageId) {

        this.getMessageId = getMessageId;

    }

    @Override
    public boolean getGetMessageParts() {

        return getMessageParts;
    }

    @Override
    public void setGetMessageParts(boolean getMessageParts) {

        this.getMessageParts = getMessageParts;

    }

    @Override
    public boolean getGetFrom() {

        return getFrom;

    }

    @Override
    public void setGetFrom(boolean getFrom) {

        this.getFrom = getFrom;

    }

    @Override
    public boolean getGetTo() {

        return getTo;

    }

    @Override
    public void setGetTo(boolean getTo) {

        this.getTo = getTo;

    }

    @Override
    public boolean getGetNetCost() {

        return getNetCost;

    }

    @Override
    public void setGetNetCost(boolean getNetCost) {

        this.getNetCost = getNetCost;

    }

    @Override
    public boolean getGetDeliveryReport() {

        return getDeliveryReport;

    }

    @Override
    public void setGetDeliveryReport(boolean getDeliveryReport) {

        this.getDeliveryReport = getDeliveryReport;
    }

    @Override
    public IRequest toRequest() {

        return new SmsRequest.Builder(this.to, this.from, this.text, this.type).clientRef(clientRef).getDeliveryReport(getDeliveryReport).getFrom(getFrom).getMessageId(getMessageId).getMessageParts(getMessageParts).getNetCost(getNetCost).getTo(getTo).isFlash(flash).isTest(test).build();

    }

}
