package com.eat.chapter11;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.eat.R;
import com.eat.chapter10.FileDownloadActivity;

public class Chapter11Activity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chapter11);
    }

    public void onBluetoothActivity(View v) {
        startActivity(new Intent(this, BluetoothActivity.class));
    }
}
