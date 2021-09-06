package com.example.practicespringboot.login;

import javax.persistence.*;


@Entity
@Table(name = "login")
public class Login {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 150, name = "username")
    private String username;

    @Column(nullable = false, length = 150, name = "password")
    private String password;


    //TODO:Empty Constructor
    public Login() {}

    //TODO:No ID Constructor
    public Login(String username, String password) {
        this.username = username;
        this.password = password;
    }

    //TODO:All Constructor
    public Login(Integer id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    //TODO:To String

    @Override
    public String toString() {
        return "Login{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
