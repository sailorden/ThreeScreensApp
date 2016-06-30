package com.example.tagg8.threescreensapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;


public class ConfirmationActivity extends AppCompatActivity {
    private String phoneText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmation);
        Intent intent = getIntent();
        phoneText = (String) intent.getSerializableExtra("phoneText");
        Log.v("Phone Text:", phoneText);

    }
}
