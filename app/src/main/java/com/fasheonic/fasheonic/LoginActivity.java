package com.fasheonic.fasheonic;

import android.content.Intent;
import android.graphics.drawable.Icon;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {

    private TextView Signup;
    private TextView pass;
    private Button loginbtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_login);
        Signup = (TextView) findViewById(R.id.SignUpTxt);
        pass=(TextView)findViewById(R.id.forgotpass);
        loginbtn=(Button)findViewById(R.id.LoginBtn);

        loginbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent homeintent = new Intent(LoginActivity.this,HomeActivity.class);
                startActivity(homeintent);
            }
        });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pass = new Intent(LoginActivity.this,ForgetPass.class);
                startActivity(pass);
            }
        });

        Signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignupAct = new Intent(LoginActivity.this,SignUpActivity.class);
                startActivity(SignupAct);


            }
        });
    }
}
