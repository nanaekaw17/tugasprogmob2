package com.proteintracker.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);

        TextView myTextView = findViewById(R.id.textView);
//        myTextView.setText("Some Help Text");
//        setContentView(myTextView);

        Bundle b = getIntent().getExtras();
        String helpText = b.getString("helpString");
//        TextView textView =findViewById(R.id.textView);
//        textView.setText(helpText);

        myTextView.setText(helpText);
//        setContentView(myTextView);
    }
}
