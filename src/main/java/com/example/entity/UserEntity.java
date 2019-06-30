package com.example.entity;

import javax.persistence.*;

@Entity
@Table(name = "user")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private   Long id;

    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String pass;
    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surname;
    @Column(name = "patronimic")
    private String patronimic;
    @Column(name = "email")
    private String email;

    public UserEntity() {
    }

    public UserEntity(String login, String pass, String name, String surname, String patronimic) {
        this.login = login;
        this.pass = pass;
        this.name = name;
        this.surname = surname;
        this.patronimic = patronimic;
    }

    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public String getPass() {
        return pass;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronimic() {
        return patronimic;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setPatronimic(String patronimic) {
        this.patronimic = patronimic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
