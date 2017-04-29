package com.huan.android_xuexi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;


public class MainActivity extends Activity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void buttonActivity(View view){
        Intent intent=new Intent(MainActivity.this,_Activity.class);
        startActivity(intent);
    }
    protected void buttonText(View view){
        Intent intent=new Intent(MainActivity.this,_text.class);
        startActivity(intent);
    }
}
