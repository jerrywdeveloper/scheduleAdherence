package com.example.scheduleadherence;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    //constants


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }

    public void getLoginActivity(View view) {
        Intent getLoginActivity = new Intent(this, LoginActivity.class);

        //getLoginActivity.putExtra("callingActivity", "MainActivity");

        startActivity(getLoginActivity);
    }

}
