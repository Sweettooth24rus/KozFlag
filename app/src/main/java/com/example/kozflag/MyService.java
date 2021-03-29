package com.example.kozflag;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;
import android.util.Log;
import android.widget.Toast;
public class MyService extends Service {
    MediaPlayer player;

    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }

    @Override
    public void onCreate() {
        int i= (int)(Math.random() * 3);
        switch (i) {
            case 0:player = MediaPlayer.create(this, R.raw.gr1);break;
            case 1:player = MediaPlayer.create(this, R.raw.gr2);break;
            case 2:player = MediaPlayer.create(this, R.raw.gr3);break;
        }
        player.setLooping(true); // зацикливаем
    }

    @Override
    public void onDestroy() {
        player.stop();
    }

    @Override
    public void onStart(Intent intent, int startid) {
        player.start();
    }
}