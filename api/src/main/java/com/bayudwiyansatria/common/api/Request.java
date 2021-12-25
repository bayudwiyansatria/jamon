package com.bayudwiyansatria.common.api;

import java.io.Serializable;

/**
 * Common Request
 *
 * @param <T>
 * @author Bayu Dwiyan Satria
 * @version 1.0.0
 */
public class Request<T> implements Serializable {

    private final T request;

    /**
     * Request Constructor
     *
     * @param t Request Type
     * @since 1.0.0
     */
    public Request(T t) {
        this.request = t;
    }

    /**
     * Get Request
     *
     * @return Request
     * @since 1.0.0
     */
    public T getRequest() {
        return request;
    }
}
