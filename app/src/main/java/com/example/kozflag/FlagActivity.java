package com.example.kozflag;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.io.File;

public class FlagActivity extends AppCompatActivity {

    private static final String TAG = "FlagActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new RusFlag(this));
        startService(new Intent(this, MyService.class));
    }

    @Override
    protected void onPause() {
        super.onPause();
            Log.d(TAG, "Активность остановлена");
            stopService(new Intent(this, MyService.class));
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "Активность восстановлена");
        startService(new Intent(this, MyService.class));
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "Активность удалена");
    }
}
