package com.example.basiccalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void handleAddButton(View view){
        EditText editText1 = (EditText) findViewById(R.id.editText1);
        int int1 = Integer.parseInt(editText1.getText().toString());
        EditText editText2 = (EditText) findViewById(R.id.editText2);
        int int2 = Integer.parseInt(editText2.getText().toString());

        int ans = int1 + int2;
    }

    public void showAnswer(int ans) {
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("message", ans);
        startActivity(intent);
    }
}