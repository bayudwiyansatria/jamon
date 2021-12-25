package com.bayudwiyansatria.common.api;

import java.io.Serializable;

/**
 * Common Response
 *
 * @param <T> Response Type
 * @author Bayu Dwiyan Satria
 * @version 1.0.0
 */
public class Response<T> implements Serializable {

    private final String code;
    private final String messages;
    private final T data;

    public Response(String code, String messages, T data) {
        this.code = code;
        this.messages = messages;
        this.data = data;
    }

    public String getCode() {
        return code;
    }

    public String getMessages() {
        return messages;
    }

    public T getData() {
        return data;
    }
}
