package com.example.demo.service.imp;

import com.example.demo.dao.RoleMapping;
import com.example.demo.model.Attribute;
import com.example.demo.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service(value = "RoleService")
public class RoleServiceImp implements RoleService {

    @Autowired
    RoleMapping role;

    @Override
    public Attribute Attr(Attribute attr) {
        return role.Attr(attr) ;
    }

}
