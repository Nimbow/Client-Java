package com.nimbow.nimbowapiclient;

/**
 * Created by Nimbow on 08/12/2015.
 */
class ByteArrayHelper {

    static String toHexString(byte[] data) {

        StringBuilder sb = new StringBuilder();

        for (byte b : data) {

            sb.append(String.format("%04X", b));

        }

        return sb.toString();

    }

}
