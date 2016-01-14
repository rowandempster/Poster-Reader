package com.example.rowandempster.ocr;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;

public class getInfo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_get_info);


        Intent intent = getIntent();
        String originalText = intent.getStringExtra("text");

        EditText textDisplay = (EditText) findViewById(R.id.displayText);

        textDisplay.setText(originalText);



            }
    }


