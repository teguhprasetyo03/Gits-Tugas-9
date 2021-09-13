package com.kelascoding.tugas9.webview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

import com.kelascoding.tugas9.R;

public class GramediaWebView extends AppCompatActivity {

    WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gramedia_web_view);

        webView = findViewById(R.id.webView1);

        webView.setWebViewClient(new WebViewClient());

        webView.loadUrl("https://www.gramedia.com/products/milea-suara-dari-dilan");

    }

    @Override
    public void onBackPressed() {
        if (webView.canGoBack()){
            webView.goBack();
            Toast.makeText(this,"Going back inside a webview", Toast.LENGTH_SHORT).show();
        } else
            Toast.makeText(this,"Going back inside a webview", Toast.LENGTH_SHORT).show();
            super.onBackPressed();
    }
}