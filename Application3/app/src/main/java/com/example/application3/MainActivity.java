package com.example.application3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText edText;
    Button button1, button2;
    RadioGroup radioGroup;
    RadioButton radioButton1, radioButton2;
    ImageView imageView;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("좀 그럴 듯한 앱");

        edText = (EditText) findViewById(R.id.editTextTextPersonName);
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioButton1 = (RadioButton) findViewById(R.id.radioButton5);
        radioButton2 = (RadioButton) findViewById(R.id.radioButton7);
        imageView = (ImageView) findViewById(R.id.imageView);

        button1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0){
                Toast.makeText(getApplicationContext(), edText.getText().toString(), Toast.LENGTH_LONG).show();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                intent = new Intent(Intent.ACTION_VIEW, Uri.parse(edText.getText().toString()));
                startActivity(intent);
            }
        });

        radioButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.cat1);
            }
        });

        radioButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                imageView.setImageResource(R.drawable.cat2);
            }
        });
    }
}