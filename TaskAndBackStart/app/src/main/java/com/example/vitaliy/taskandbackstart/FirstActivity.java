package com.example.vitaliy.taskandbackstart;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener{

    private final String TAG_LOG = "ACTIVITY_1";
private Button nextAct;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);

        nextAct = (Button) findViewById(R.id.next_activity_btn);

        nextAct.setOnClickListener(this);
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

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.next_activity_btn) {
            Intent secondActivity = new Intent(this, SecondActivity.class);
            v.getContext().startActivity(secondActivity);
        }
    }
}
