package com.facebook.vanquy.facebook;

import android.graphics.Paint;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tvUnderline;
    TextView tvforget;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvUnderline = (TextView) findViewById(R.id.tv_sign_up);
        tvUnderline.setPaintFlags(tvUnderline.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);
        tvforget = (TextView) findViewById(R.id.tv_forget);
        tvforget.setPaintFlags(tvforget.getPaintFlags() | Paint.UNDERLINE_TEXT_FLAG);

    }
}
