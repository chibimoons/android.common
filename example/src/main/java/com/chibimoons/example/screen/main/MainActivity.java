package com.chibimoons.example.screen.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;

import com.chibimoons.common.base.BaseActivity;
import com.chibimoons.common.base.IPresenterView;
import com.chibimoons.example.R;

public class MainActivity extends BaseActivity implements IPresenterView {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
