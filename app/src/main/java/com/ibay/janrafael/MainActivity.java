package com.ibay.janrafael;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("IBAY","onCreate() has been executed");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("IBAY","onStart() has been executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("IBAY","onResume() has been executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("IBAY","onPause() has been executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("IBAY","onStop() has been executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("IBAY","onDestroy() has been executed");
    }

    public void showToast(View v){
        Toast.makeText(this,"You clicked Back!hehe", Toast.LENGTH_LONG).show();
    }

    public void showSnackbar(View v){
        Snackbar.make(v, "You clicked Next!hehe", Snackbar.LENGTH_LONG).show();
    }
}