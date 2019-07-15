package com.fasheonic.fasheonic;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SignUpActivity extends AppCompatActivity {

    private Button ContinueBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        ContinueBtn = (Button) findViewById(R.id.SignUpCont);

        ContinueBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent SignupAct = new Intent(SignUpActivity.this,LoginActivity.class);
                startActivity(SignupAct);
                finish();

            }
        });

    }
}
