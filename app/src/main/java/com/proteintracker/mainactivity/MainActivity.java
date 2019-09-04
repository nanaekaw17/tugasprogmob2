package com.proteintracker.mainactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import static com.proteintracker.mainactivity.R.id.mainActivityTextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView textView = (TextView) findViewById(mainActivityTextView);
        textView.setText(R.string.test_untuk_update_view);

        Button myBtn = (Button) findViewById(R.id.button);
        myBtn.setOnClickListener(new View.OnClickListener() {
                                     @Override
                                     public void onClick(View view) {
                                         EditText myEditText = (EditText) findViewById(R.id.editText);
                                         Log.d("Proteintracker", myEditText.getText().toString());
                                     }
                                 }
        );
        myBtn.setOnClickListener(myBtnClickListener);

        Button helpBtn = (Button)findViewById(R.id.button2);
        helpBtn.setOnClickListener(helpButtonListener);

        Button LayoutBtn = (Button)findViewById(R.id.button3);
        LayoutBtn.setOnClickListener(LayoutButtonListener);

        if(savedInstanceState != null){
            Log.d("ProteinTracker",savedInstanceState.getString("abc"));
        }



    }
    private View.OnClickListener myBtnClickListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            EditText myEditText = (EditText)findViewById(R.id.editText);
            Log.d("Proteintracker",myEditText.getText().toString());
        }
    };

    /*private View.OnClickListener helpButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);
            startActivity(intent);
        }
    };*/

    private View.OnClickListener helpButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,HelpActivity.class);

            Bundle b = new Bundle();
            EditText myEditText = (EditText)findViewById(R.id.editText);
            b.putString("helpString",myEditText.getText().toString());
            intent.putExtras(b);
            startActivity(intent);
        }
    };

    private View.OnClickListener LayoutButtonListener = new View.OnClickListener()
    {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,Main2Activity.class);
            startActivity(intent);
        }
    };


    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);

        outState.putString("abc", "test");
        super.onSaveInstanceState(outState);
    }
    }

