package com.example.administrator.activitytest;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnJump;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    Log.v("Activity生命周期", "onCreate()");

    btnJump=(Button)this.findViewById(R.id.btnJump);
    btnJump.setOnClickListener(new View.OnClickListener(){

        @Override
        public void onClick(View arg0) {
            Intent i=new Intent(MainActivity.this,SecondActivity.class);
            startActivity(i);
        }});
}

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("Activity生命周期", "onDestroy()");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("Activity生命周期", "onPause()");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("Activity生命周期", "onRestart()");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("Activity生命周期", "onResume()");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("Activity生命周期", "onStart()");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.v("Activity生命周期", "onStop()");
    }
}
