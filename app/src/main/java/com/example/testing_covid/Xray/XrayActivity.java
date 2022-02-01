package com.example.testing_covid.Xray;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.testing_covid.MainActivity;
import com.example.testing_covid.R;

public class XrayActivity extends AppCompatActivity {

    ImageView back;

    WebView web;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_xray);


        back=findViewById(R.id.back);

        web=findViewById(R.id.web);

        web.setWebViewClient(new WebViewClient());
        web.loadUrl("http://192.168.0.7:5000/");

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(XrayActivity.this, MainActivity.class));
            }
        });
    }
}