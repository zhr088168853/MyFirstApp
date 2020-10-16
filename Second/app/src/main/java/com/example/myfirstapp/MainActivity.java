package com.example.myfirstapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    /** Called when the user taps the Send button */
    public void sendMessage(View view) {        //显示调用另一个Activity
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText = (EditText) findViewById(R.id.editTextTextPersonName);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.v("zhr1", "MainActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("zhr2", "MainActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("zhr3", "MainActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("zhr4", "MainActivity onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.v("zhr5", "MainActivity onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("zhr6", "MainActivity onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("zhr7", "MainActivity onDestroy");
    }
}
