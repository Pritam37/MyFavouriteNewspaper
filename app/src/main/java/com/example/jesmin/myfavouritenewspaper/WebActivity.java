package com.example.jesmin.myfavouritenewspaper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class WebActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);
        webView=findViewById(R.id.webview);

        String getUrl=getIntent().getExtras().getString("url");
        webView.setWebViewClient(new WebViewClient());
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBuiltInZoomControls(true);
        if (getUrl.equals("প্রথম আলো"))
        {
            webView.loadUrl("http://www.prothomalo.com");
        }
        else if (getUrl.equals("কালের কন্ঠ"))
        {
            webView.loadUrl("https://www.ekalerkantho.com");
        }
        else if (getUrl.equals("ইত্তেফাক"))
        {
            webView.loadUrl("https://epaper.ittefaq.com.bd");
        }
        else if (getUrl.equals("বাংলাদেশ প্রতিদিন"))
        {
            webView.loadUrl("https://www.ebdpratidin.com");
        }
        else if (getUrl.equals("যুগান্তর"))
        {
            webView.loadUrl("http://epaper.jugantor.com");
        }
        else if (getUrl.equals("নয়া দিগন্ত"))
        {
            webView.loadUrl("http://www.enayadiganta.com");
        }
        else if (getUrl.equals("সমকাল"))
        {
            webView.loadUrl("http://epaper.samakal.com");
        }
        else if (getUrl.equals("ইনকিলাব"))
        {
            webView.loadUrl("https://www.dailyinqilab.com/epaper");
        }
        else if (getUrl.equals("ভোরের কাগজ"))
        {
            webView.loadUrl("http://www.bhorerkagoj.com/epaper");
        }
        else if (getUrl.equals("যায় যায় দিন"))
        {
            webView.loadUrl("http://www.ejjdin.com/index.php");
        }
        else if (getUrl.equals("জনকন্ঠ"))
        {
            webView.loadUrl("http://edailyjanakantha.com");
        }
        else if (getUrl.equals("মানবজমিন"))
        {
            webView.loadUrl("http://www.mzamin.com");
        }
        else if (getUrl.equals("সুপ্রভাত বাংলাদেশ"))
        {
            webView.loadUrl("https://esuprobhat.com/index.php");
        }
        else if (getUrl.equals("Daily Star"))
        {
            webView.loadUrl("http://epaper.thedailystar.net/index.php");
        }
        else if (getUrl.equals("Independent"))
        {
            webView.loadUrl("http://www.eindependentbd.com");
        }
        else if (getUrl.equals("Observer"))
        {
            webView.loadUrl("http://www.observerbd.com/eobserver");
        }
        else if (getUrl.equals("Bangladesh Today"))
        {
            webView.loadUrl("http://thebangladeshtoday.com");
        }
        else if (getUrl.equals("New Age"))
        {
            webView.loadUrl("http://epaper.newagebd.net");
        }
        else if (getUrl.equals("Daily Sun"))
        {
            webView.loadUrl("https://www.edailysun.com");//,
        }
        else if (getUrl.equals("পূর্বকোণ"))
        {
            webView.loadUrl("http://www.edainikpurbokone.net/index.php");
        }
        else if (getUrl.equals("আজাদী"))
        {
            webView.loadUrl("https://www.edainikazadi.net/index.php");
        }
    }
    //for back press
    public boolean onKeyDown (int keyCode, KeyEvent event)
    {
        if (keyCode==KeyEvent.KEYCODE_BACK && webView.canGoBack())
        {
            webView.goBack();
            return true;
        }
        return  super.onKeyDown(keyCode,event);
    }
}
