package com.example.diyanfang.finalprojectadventuregame;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

/**
 * Created by mclark on 4/23/18.
 */

public class Login extends AppCompatActivity {

    private EditText emailEditText;
    private EditText passwordEditText;
    private FirebaseAuth mAuth;
    String email;
    String password;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
    private DatabaseReference userRef = database.getReference("user");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

    }
    public void logIn(View view){
        email = (emailEditText.getText()).toString();
        password = (passwordEditText.getText()).toString();
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(!task.isSuccessful()){
                    Toast.makeText(Login.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Login.this, task.getResult().getUser().getEmail() + "logged in successfully", Toast.LENGTH_SHORT).show();

                    finish();
                }
            }
        });
    }
    public void signUp(View view){
        email = (emailEditText.getText()).toString();
        password = (passwordEditText.getText()).toString();
        mAuth.createUserWithEmailAndPassword(email,password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if (!task.isSuccessful()){
                    Toast.makeText(Login.this, task.getException().toString(), Toast.LENGTH_SHORT).show();
                }
                else{
                    Toast.makeText(Login.this, task.getResult().getUser().getEmail() + "sign up successfully", Toast.LENGTH_SHORT).show();
                    finish();
                }
            }
        });
        int level = 1;
        User temp = new User(email, password, level);
        userRef.push().setValue(temp);
    }
}
