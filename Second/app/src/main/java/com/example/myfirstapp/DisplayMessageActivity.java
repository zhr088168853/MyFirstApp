package com.example.myfirstapp;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {
   // private WebView myWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);
        Intent intent = getIntent();
        String message = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        WebView myWebView = (WebView)findViewById(R.id.webview);
        myWebView.getSettings().setJavaScriptEnabled(true);         //使应用可以加载JS网页
        myWebView.loadUrl(message);
        myWebView.setWebViewClient(new WebViewClient());        // 阻止网址在浏览器打开
//        myWebView.setWebViewClient(new WebViewClient(){
//            public boolean shouldOverrideUrlLoading(final WebView view, String url){
//                return super.shouldOverrideUrlLoading(view,url);
//            }
//        });        // 阻止网址在浏览器打开
//        TextView textView = findViewById(R.id.textView);
//        textView.setText(message);
    }
}