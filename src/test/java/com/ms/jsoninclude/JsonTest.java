package com.ms.jsoninclude;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.Test;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import lombok.Getter;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;

public class JsonTest {

    private ObjectMapper objectMapper;

    @Before
    public void setup() {
        this.objectMapper = new ObjectMapper();
    }

    @Test
    public void always() throws JsonProcessingException {
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.ALWAYS);
        String result = this.objectMapper.writeValueAsString(new Value());

        System.out.println(result);
    }

    @Test
    public void non_null() throws JsonProcessingException {
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_NULL);
        String result = this.objectMapper.writeValueAsString(new Value());

        System.out.println(result);
    }

    @Test
    public void non_absent() throws JsonProcessingException {
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_ABSENT);
        String result = this.objectMapper.writeValueAsString(new Value());

        System.out.println(result);
    }

    @Test
    public void non_empty() throws JsonProcessingException {
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_EMPTY);
        String result = this.objectMapper.writeValueAsString(new Value());

        System.out.println(result);
    }

    @Test
    public void non_default() throws JsonProcessingException {
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.NON_DEFAULT);
        String result = this.objectMapper.writeValueAsString(new Value());

        System.out.println(result);
    }

    @Test
    public void custom() throws JsonProcessingException {
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.CUSTOM);
        String result = this.objectMapper.writeValueAsString(new Value());
        System.out.println(result);
    }

    @Test
    public void use_defaults() throws JsonProcessingException {
        this.objectMapper.setSerializationInclusion(JsonInclude.Include.USE_DEFAULTS);
        String result = this.objectMapper.writeValueAsString(new Value());
        System.out.println(result);
    }

    @Getter
    //@JsonInclude(JsonInclude.Include.ALWAYS)
    public static class Value {
        private String string;
        private String emptyString;
        private Object nullValue;
        private int number;
        private int zero;
        private List<String> list;
        private List<String> emptyList;
        private Date date;
        private Date zeroDate;
        private Optional<String> optional;
        private Optional<String> emptyOptional;


        public Value() {
            this.string = "민수";
            this.emptyString = "";
            this.nullValue = null;
            this.number = 100;
            this.zero = 0;
            this.list = asList("민수", "원우");
            this.emptyList = emptyList();
            date = new Date();
            zeroDate = new Date(0L);
            this.optional = Optional.of("민수");
            this.emptyOptional = Optional.empty();
        }
    }
}
