package com.example.gui_string;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class SaveActivity extends AppCompatActivity {

    String savedText;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        Intent intent = getIntent();
        savedText = intent.getStringExtra(MainActivity.messageKey);
        result = findViewById(R.id.result);
        result.setText(savedText);

        Button changeBackground = findViewById(R.id.backgroundButton);
        changeBackground.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                View saveActivity = findViewById(R.id.saveActivity);
                Random rnd = new Random();
                int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
                saveActivity.setBackgroundColor(color);
            }
        });
    }


}
