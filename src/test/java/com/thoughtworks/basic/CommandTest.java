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

    @Test
    public void should_return_right_command_when_given_command_with_no_value() {
        Command command = new Command("-l -d /use/log");
        Assert.assertNull(command.getValue("l"));
        Assert.assertEquals(command.getValue("d"),"/use/log");
    }

    @Test
    public void should_return_right_command_when_given_command_negative(){
        Command command = new Command("-l -p -9 -d /use/log");
        Assert.assertNull(command.getValue("l"));
        Assert.assertEquals(command.getValue("p"),"-9");
        Assert.assertNotNull(command.getValue("d"),"/use/log");
    }
}