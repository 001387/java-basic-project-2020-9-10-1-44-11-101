package com.thoughtworks.basic;

import org.junit.Assert;
import org.junit.Test;

/**
 * @program: seckill
 * @description:
 * @author: zgl
 * @create: 2019-08-31 14:30
 **/
public class CommandTest {
    @Test
    public void should_return_right_command_when_given_command_has_value() {
        Command command = new Command("-l true -d /use/log");
        Assert.assertEquals(command.getValue("l"), "true");
        Assert.assertEquals(command.getValue("d"), "/use/log");
    }

   
}