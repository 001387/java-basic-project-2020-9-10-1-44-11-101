package com.thoughtworks.basic;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class ArgsTest {
    @Test
    public void should_return_string_list_when_scan_given_string() {
//        given
        String argsText = "-l true -p 8080 -d user/logs";
        Args args = new Args(argsText);

//        when
        List<String> keyValue = args.scan();

//        then
        assertEquals(3, keyValue.size());
        assertEquals(true, keyValue.contains("l true"));
        assertEquals(true, keyValue.contains("p 8080"));
        assertEquals(true, keyValue.contains("d user/logs"));
 
    }
}

