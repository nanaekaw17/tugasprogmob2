package com.proteintracker.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class HelpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_help);
        TextView myTextView = new TextView(this);
        myTextView.setText("Some Help Text");
        setContentView(myTextView);

        Bundle b = getIntent().getExtras();
        String helpText = b.getString("helpString");
        myTextView.setText(helpText);
        setContentView(myTextView);
    }
}
