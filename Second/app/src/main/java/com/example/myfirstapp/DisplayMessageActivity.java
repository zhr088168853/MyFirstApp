package com.example.myfirstapp;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.PersistableBundle;
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
        String url = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);

        //获得控件
        WebView myWebView = (WebView)findViewById(R.id.webview);
        //        //启用javascript
        myWebView.getSettings().setJavaScriptEnabled(true);
        myWebView.getSettings().setUseWideViewPort(true);
        myWebView.loadUrl(url);
        myWebView.setWebViewClient(new WebViewClient());
        //访问网页
        //系统默认会通过手机浏览器打开网页，为了能够直接通过WebView显示网页，则必须设置
        Log.v("wtt", String.format("url:%s,%s", "open~~", url));
        myWebView.loadUrl(url);

        myWebView.setWebViewClient(new WebViewClient() {
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                Log.v("wtt", String.format("url:%s,%s", "load~~", url));
                if (!url.startsWith("http")) {
                    Log.v("wtt", String.format("url:%s,%s", "fasle load~~", url));
                    return true;
                }
                //使用WebView加载显示url
                view.loadUrl(url);
                //返回true
                return true;
            }

            @Override
            public void onPageStarted(WebView view, String url, Bitmap favicon) {
                super.onPageStarted(view, url, favicon);
            }

            @Override
            public void onPageFinished(WebView view, String url) {
                super.onPageFinished(view, url);
            }
        });
    }
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState, @Nullable PersistableBundle persistentState) {
        super.onCreate(savedInstanceState, persistentState);
        Log.v("wtt1", "DisplayMessageActivity onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.v("wtt2", "DisplayMessageActivity onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.v("wtt3", "DisplayMessageActivity onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.v("wtt4", "DisplayMessageActivity onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.v("wtt5", "DisplayMessageActivity onStop");
    }


    @Override
    protected void onRestart() {
        super.onRestart();
        Log.v("wtt6", "DisplayMessageActivity onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.v("wtt7", "DisplayMessageActivity onDestroy");
    }
}