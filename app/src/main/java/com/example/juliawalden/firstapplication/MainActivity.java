package com.example.juliawalden.firstapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView text;
    EditText edit;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        text = findViewById(R.id.textView);
        edit = findViewById(R.id.editText);


        edit.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
            SpannableString spannableString = new SpannableString(s);
            spannableString.setSpan(s, start, start + count, Spannable.SPAN_EXCLUSIVE_EXCLUSIVE);
            text.setText(spannableString);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    public void buttonFunction(View v) {
        //System.out.println("Hello World!");
        //text.setText("Hello World!");
        text.setText(edit.getText());

    }

}
