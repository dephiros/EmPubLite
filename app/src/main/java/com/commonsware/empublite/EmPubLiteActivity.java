package com.commonsware.empublite;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
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

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.options, menu);
        return (super.onCreateOptionsMenu(menu));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                return (true);
            case R.id.about:
                return (true);
            case R.id.help:
                return (true);
        }
        return (super.onOptionsItemSelected(item));
    }
}
