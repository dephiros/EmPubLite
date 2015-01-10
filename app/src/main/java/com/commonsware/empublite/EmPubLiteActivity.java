package com.commonsware.empublite;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class EmPubLiteActivity extends Activity {
    WebView browser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        browser = (WebView)findViewById(R.id.webView);
        browser.setWebViewClient(new WebViewClient());
        browser.loadUrl("http://www.dephiros.com");
    }
}
