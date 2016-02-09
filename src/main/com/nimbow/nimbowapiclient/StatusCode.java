package com.nimbow.nimbowapiclient;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Nimbow on 08/12/2015.
 */
public enum StatusCode {

    Success(0),
    InternalError(1),
    UnknownError(2),
    InsufficientCredit(3),
    InvalidApiCall(4),
    InvalidApiKey(5),
    ReceiverMissing(101),
    MessageTextMissing(102),
    InvalidNumericSenderLength(200),
    MessageTextContainsNonGSMCharacters(203),
    InvalidAlphaNumericSenderLength(204),
    InvalidNumericReceiverLength(205),
    ClientReferenceContainsNonValidCharacters(208),
    InvalidType(209),
    InvalidUdh(210),
    MessageTextIsNotHexEncoded(211);

    private static final Map<Integer, StatusCode> lookup = new HashMap<>();

    static {

        for (StatusCode d : StatusCode.values()) {

            lookup.put(d.getStatusCode(), d);

        }

    }

    private int statusCode;

    StatusCode(int value) {

        statusCode = value;

    }

    public static StatusCode get(int statusCode) {

        return lookup.get(statusCode);

    }

    public int getStatusCode() {

        return statusCode;

    }
}
