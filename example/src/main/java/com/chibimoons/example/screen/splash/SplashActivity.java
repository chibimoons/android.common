package com.chibimoons.example.screen.splash;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.chibimoons.common.base.BaseActivity;
import com.chibimoons.example.R;
import com.chibimoons.example.screen.main.MainActivity;

import java.util.concurrent.TimeUnit;

import io.reactivex.Flowable;

public class SplashActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_activity);
        Log.i("chibimoons","onCreate");
        Flowable.timer(3000, TimeUnit.MILLISECONDS)
                .subscribe(aLong -> {
                    Log.i("chibimoons","start MainActivity");
                    Intent intent = new Intent(this, MainActivity.class);
                    startActivity(intent);
                    finish();
                });

    }
}
