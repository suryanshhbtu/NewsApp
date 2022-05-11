
package com.example.newsapp;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.appcompat.widget.Toolbar;

        import android.content.Intent;
        import android.os.Bundle;
        import android.webkit.WebView;
        import android.webkit.WebViewClient;

class webView extends AppCompatActivity {
    //    ye web view mera banaya hua hai
    Toolbar toolbar;
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        toolbar = findViewById(R.id.toolbar);
        webView = (WebView) findViewById(R.id.webview);
        setSupportActionBar(toolbar);

        Intent intent = getIntent();
        String url = intent.getStringExtra("url"); // same variabled in adapter
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url);
    }
}