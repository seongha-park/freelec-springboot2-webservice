package com.smartandhuman.springboot.config.auth.dto;

import com.smartandhuman.springboot.domain.user.User;
import lombok.Getter;

import java.io.Serializable;

@Getter
public class SessionUser implements Serializable {
    private String name;
    private String email;
    private String pirture;

    public SessionUser(User user){
        this.name = user.getName();
        this.email = user.getEmail();
        this.pirture = user.getPicture();
    }
}
