package com.mychelantonacio.cqdb.controllers;

import com.mychelantonacio.cqdb.AbstractTest;
import com.mychelantonacio.cqdb.models.Question;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

public class QuestionControllerTest extends AbstractTest {

    private final String ROOT_URI = "http://localhost:5000";

    @Override
    @Before
    public void setUp() {
        super.setUp();
    }

    @Test
    public void getQuestion_200Okay() throws Exception {
        String uri = "/questions/sample";

        MvcResult mvcResult = mvc.perform(MockMvcRequestBuilders.get(uri)
                .accept(MediaType.APPLICATION_JSON_VALUE)).andReturn();

        int status = mvcResult.getResponse().getStatus();
        Assert.assertEquals(200, status);
    }
}
