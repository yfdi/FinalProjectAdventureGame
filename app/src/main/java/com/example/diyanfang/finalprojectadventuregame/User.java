package com.example.diyanfang.finalprojectadventuregame;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by mclark on 4/23/18.
 */

public class User {
    public String email;
    public String password;
    public int level;

    public User() {
    }

    public User(String email, String password, int level) {
        this.email = email;
        this.password = password;
        this.level = level;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
