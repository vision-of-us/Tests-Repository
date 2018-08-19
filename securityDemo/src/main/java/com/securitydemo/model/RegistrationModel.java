package com.securitydemo.model;

import com.securitydemo.annotations.IsPasswordsMatching;

import javax.validation.constraints.Size;

@IsPasswordsMatching
public class RegistrationModel {

    @Size(min = 5, message = "Username too short")
    private String username;

    @Size(min = 10, message = "Email too short")
    private String email;

    @Size(min = 5, message = "Password too short")
    private String password;

    private String confirmPassword;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }
}
