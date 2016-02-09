package com.nimbow.nimbowapiclient;

/**
 * Created by Nimbow on 08/12/2015.
 */
public interface ISmsResponse {

    StatusCode getStatusCode();

    String getMessageId();

    Integer getMessageParts();

    String getFrom();

    String getTo();

    Float getNetCost();

}
