package com.example.demo.model;

import lombok.Data;

import java.io.Serializable;

/**
 * 操作id
 * 操作影响的属性
 * 操作影响的属性值
 * 操作来源
 * 操作对象
 *（之所以设计这两条，有时技能是给自己加buff的）
 */

@Data
public class Operation implements Serializable {

    public static final long serialVersionUID=213213213L;

    private char effectAttr;
    private int dValue;
    private String fromID;
    private String toID;

}
