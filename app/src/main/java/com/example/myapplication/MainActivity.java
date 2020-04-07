package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MyActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.e(TAG, "염주희 onCreate() called!");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "염주희 onResume() called!");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "염주희 onStart() called!");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e(TAG, "Song Yejun onRestart() called!");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "염주희 onStop() called!");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "염주희 onPause() called!");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "염주희 onDestory() called!");
    }
}
