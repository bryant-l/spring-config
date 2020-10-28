package com.works.bryant.service;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Data
@Component
public class User {
    private String name;
    private int age;
}
