package com.mamadtaheri.user;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "tbl_user")
@Data
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="user_id")
    private Integer userId;

    @Column(name="user_name")
    private String userName;

    @Column(name = "email_id")
    private String emailId;

    private Integer age;
}
