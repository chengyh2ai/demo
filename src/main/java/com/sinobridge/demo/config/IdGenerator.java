package com.sinobridge.demo.config;

public class IdGenerator {
    public String nextId() {
        return "ORDER-" + System.currentTimeMillis();
    }
}
