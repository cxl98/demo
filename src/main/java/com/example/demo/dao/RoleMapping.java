package com.example.demo.dao;

import com.example.demo.model.Attribute;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleMapping {
    Attribute Attr(Attribute attr);
}
