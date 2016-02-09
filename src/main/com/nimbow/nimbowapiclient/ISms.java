package com.nimbow.nimbowapiclient;

/**
 * Created by Nimbow on 08/12/2015.
 */
public interface ISms {

    String getFrom();

    void setFrom(String from);

    String getTo();

    void setTo(String to);

    String getClientRef();

    void setClientRef(String clientRef);

    boolean getFlash();

    void setFlash(boolean flash);

    boolean isTest();

    void setIsTest(boolean test);

    boolean getGetMessageId();

    void setGetMessageId(boolean getMessageId);

    boolean getGetMessageParts();

    void setGetMessageParts(boolean getMessageParts);

    boolean getGetFrom();

    void setGetFrom(boolean getFrom);

    boolean getGetTo();

    void setGetTo(boolean getTo);

    boolean getGetNetCost();

    void setGetNetCost(boolean getNetCost);

    boolean getGetDeliveryReport();

    void setGetDeliveryReport(boolean getDeliveryReport);

    IRequest toRequest();

}
