package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SchemaTest {

    @Test
    public void should_return_Boolean_when_given_l(){
        Schema schema = new Schema("l:bool");
        Assert.assertEquals(schema.getValue("l","true"),Boolean.TRUE);
        Assert.assertEquals(schema.getValue("l","false"),Boolean.FALSE);
        Assert.assertEquals(schema.getValue("l",null),Boolean.FALSE);
    }

    @Test
    public void should_return_int_1_when_given_l_int_1() {
        Schema schema = new Schema("l:int");
        Assert.assertEquals(schema.getValue("l","1"),new Integer("1"));
    }

    @Test
    public void should_return_int_1_when_given_l_String_hello() {
        Schema schema = new Schema("l:string");
        Assert.assertEquals(schema.getValue("l","hello"),"hello");
    }

}
