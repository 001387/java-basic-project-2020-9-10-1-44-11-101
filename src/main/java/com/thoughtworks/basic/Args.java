package com.thoughtworks.basic;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Args {

    private String argsText;

    public Args(String argsText) {
        this.argsText = argsText;
    }

    public List<String> scan() {
        List<String> keyValues = Arrays.asList(argsText.split("-"))
                .stream()
                .map(String::trim)
                .collect(Collectors.toList());
        return keyValues.subList(1, keyValues.size());
    }

}
