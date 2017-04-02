package com.example.vitaliy.taskandbackstart;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

public class SecondActivity extends AppCompatActivity {

    private final String TAG_LOG = "ACTIVITY_2";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_activity);
    }

    @Override
    protected void onStart() {
        Log.wtf(TAG_LOG, "onStart");
        super.onStart();
    }

    @Override
    protected void onStop() {
        Log.wtf(TAG_LOG, "onStop");
        super.onStop();
    }

    @Override
    protected void onDestroy() {
        Log.wtf(TAG_LOG, "onDestroy");
        super.onDestroy();
    }

    @Override
    protected void onPause() {
        Log.wtf(TAG_LOG, "onPause");
        super.onPause();
    }

    @Override
    protected void onResume() {
        Log.wtf(TAG_LOG, "onResume");
        super.onResume();
    }

}
