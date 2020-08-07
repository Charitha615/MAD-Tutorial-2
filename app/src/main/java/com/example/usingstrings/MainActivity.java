package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMsg2 = findViewById(R.id.TvMsg2);

        txtVMsg2.setText(R.string.Msg2);


        Log.i("LifeCycle","onCreate() invoked");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.i("LifeCycle","onStart() invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("LifeCycle","onRestart() invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","onPause() invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("LifeCycle","onResume() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle","onStop() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","onDestroy() invoked");
    }
}