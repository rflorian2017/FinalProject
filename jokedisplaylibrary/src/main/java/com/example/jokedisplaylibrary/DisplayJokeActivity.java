package com.example.jokedisplaylibrary;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayJokeActivity extends AppCompatActivity {

    private TextView jokeTv;
    public static String EXTRA_JOKE_KEY = "joke_key";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_joke);
        jokeTv = findViewById(R.id.joke_text_tv);

        if(getIntent().hasExtra(EXTRA_JOKE_KEY)) {
            jokeTv.setText(getIntent().getStringExtra(EXTRA_JOKE_KEY));
        }
    }
}
