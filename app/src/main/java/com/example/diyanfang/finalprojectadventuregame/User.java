package com.example.diyanfang.finalprojectadventuregame;

import android.support.v7.app.AppCompatActivity;

/**
 * Created by mclark on 4/23/18.
 */

public class User {
    public String email;
    public String password;
    public int level;

    public User(String email, String password, int level) {
        this.email = email;
        this.password = password;
        this.level = level;
    }

}
