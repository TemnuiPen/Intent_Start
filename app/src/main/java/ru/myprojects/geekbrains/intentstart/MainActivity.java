package ru.myprojects.geekbrains.intentstart;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        Intent intent = getIntent();
        String action = intent.getAction();
        String str = intent.getDataString();

        if (Intent.ACTION_SEND.equals(action)) {
            textView.setText(intent.getStringExtra(Intent.EXTRA_TEXT));
        }
    }
}