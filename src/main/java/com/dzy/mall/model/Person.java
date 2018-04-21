package com.dzy.mall.model;

import lombok.Data;

import javax.persistence.Id;
import javax.persistence.Table;

@Data
@Table(name="person")
public class Person {
    @Id
    private Integer id;
    private String name;
    private Integer age;
}