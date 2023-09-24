package com.cydeo.entity;

import com.cydeo.enums.Gender;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


// lombok can not create all arg constructor for super fields when u extend another class
@NoArgsConstructor
@Data
public class User extends BaseEntity{
    private String firstName;
    private String lastName;
    private String userName;
    private String password;
    private boolean enabled;
    private Role role;
    private Gender gender;

    public User(Long id, LocalDateTime insertLocalDateTime, Long insertUserId, LocalDateTime lastUpdatedLocalDateTime, Long lastUpdatedUserId, String firstName, String lastName, String userName, String password, boolean enabled, Role role, Gender gender) {
        super(id, insertLocalDateTime, insertUserId, lastUpdatedLocalDateTime, lastUpdatedUserId);
        this.firstName = firstName;
        this.lastName = lastName;
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.role = role;
        this.gender = gender;
    }
}
