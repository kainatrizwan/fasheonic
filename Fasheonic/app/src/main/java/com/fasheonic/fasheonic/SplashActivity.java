package com.fasheonic.fasheonic;
import android.content.Intent;
import android.os.SystemClock;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
SystemClock.sleep(3000);
Intent loginAct = new Intent(SplashActivity.this,LoginActivity.class);
startActivity(loginAct);
finish();
    }
}
