package com.bayudwiyansatria.common.api;

import org.junit.Assert;
import org.junit.Test;

public class APITest {

    @Test
    public void RequestResponseTest(){
        String newName = "Common API";
        Data data = new Data(newName);
        Request<Data> request = new Request<>(data);
        Response<Data> response = new Response<>("200", "ok", request.getRequest());
        Assert.assertEquals(request.getRequest().value, response.getData().value);
        Assert.assertEquals("200", response.getCode());
        Assert.assertEquals("ok", response.getMessages());
    }
}

class Data {
    String key = "name";
    String value = "bayu";

    public Data(String value) {
        this.value = value;
    }
}
