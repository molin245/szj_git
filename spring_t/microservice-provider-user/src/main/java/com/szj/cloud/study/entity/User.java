package com.szj.cloud.study.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity //说明此java类是实体类
public class User {
    @Id //说明是主键（@Id此注解不能省略，不然Hibernate在调用po进行ORM操作的时候，
    // 会出现错误，千万不要认为主键不是自增，就不用指定主键了
    @GeneratedValue(strategy =  GenerationType.AUTO)
    private Long id;
    @Column //数据库字段和类属性对应关系,具体可以了解javax.persistence的注解说明
    private String username;
    @Column
    private String name;
    @Column
    private Integer age;
    @Column
    private BigDecimal balance;

    // getters and setters
    public Long getId() {
        return this.id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return this.age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
