package com.thoughtworks.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Command {
    Map<String, String> values = new HashMap<String, String>();
    private String commandLine;

    public Command(String commandLine) {

        this.commandLine = commandLine;
    }

//    private void parseCommandLine() {
//        List<String> commdList = Arrays.asList(commandLine.split(" "));
//        for (int i = 0; i < commdList.size(); i += 2) {
//            String Demoname = commdList.get(i);
//            String name = commdList.get(i).substring(Integer.parseInt(" "));
//            String value = commdList.get(i + 1);
//            if (Demoname.indexOf("-") == 0) {
//                if (isValue(value)) {
//                    values.put(name, value);
//                } else {
//                    values.put(name, "null");
//                    i--;
//                }
//            } else {
//                values.put(name, value);
//            }
//        }
//    }
}
