package com.ff.springboot;

public class Topic {

    private String header1;
    private String header2;

    public Topic(){}

    public Topic(String header1, String header2) {
        this.header1 = header1;
        this.header2 = header2;
    }

    //with getters no serilazion problem solved
    //com.fasterxml.jackson.databind.exc.InvalidDefinitionException:
    // No serializer found for class com.ff.springboot.Topic and no properties discovered to create BeanSerializer
    // (to avoid exception, disable SerializationFeature.FAIL_ON_EMPTY_BEANS) (through reference chain: java.util.Arrays$ArrayList[0])

    public String getHeader1() {
        return header1;
    }

    public String getHeader2() {
        return header2;
    }
}
