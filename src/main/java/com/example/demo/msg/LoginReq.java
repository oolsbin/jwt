package com.example.demo.msg;

import lombok.Data;

@Data
public class LoginReq {
    private String name;
    private String password;
}