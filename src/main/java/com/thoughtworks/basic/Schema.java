package com.thoughtworks.basic;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Schema {
    Map<String, String> schemas;

    public Schema(String schemaConf) {
        schemas = new HashMap<>();
        Arrays.asList(schemaConf.split(","))
                .stream()
                .forEach(flag->{
                    String[] nameValue = flag.split(":");
                    schemas.put(nameValue[0], nameValue[1]);
                });
    }

    public Object getValue(String name, String strValue) {
        String type = schemas.get(name);
        switch (type){
            case "bool":
                return "true".equalsIgnoreCase(strValue);
            case "int":
                return Integer.parseInt(strValue);
            case "string":
                return strValue;
            default:
                return  true;
        }
    }
}
