package com.example.demo.utils;

import com.example.demo.exception.NetException;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.io.Serializable;

public class Serialize implements Serializable {
    private static final ObjectMapper OBJECT_MAPPER=new ObjectMapper();

    /**
     * bean、array、List、Map --> json
     */
    public <T> byte[] serialize(T obj){
        try {
            return OBJECT_MAPPER.writeValueAsBytes(obj);
        } catch (JsonProcessingException e) {
            throw new NetException(e);
        }
    }

    /**
     * string --> bean、Map、List(array)
     */
    public <T> Object deserialize(byte[] bytes,Class<T> clazz){
        try {
            return OBJECT_MAPPER.readValue(bytes,clazz);
        } catch (IOException e) {
            throw new NetException(e);
        }
    }
}
