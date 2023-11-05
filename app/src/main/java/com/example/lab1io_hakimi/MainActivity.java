package com.example.lab1io_hakimi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView tvMessage;
    Button submitButton;
    EditText etName;

    Button resetButton;

    int counter=0;

    String text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvMessage = (TextView) findViewById(R.id.textView);
        submitButton = (Button) findViewById(R.id.button);
        etName = (EditText) findViewById(R.id.editText);
        resetButton = (Button) findViewById(R.id.button);
    }

    public void displayText(View view){

        //String text = etName.getText().toString();
        text = etName.getText().toString();

        //tvMessage.setText("Welcome!"+counter++);
        tvMessage.setText("Welcome! "+text);

        Toast toast = Toast.makeText(this, "WELCOME "+text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void resetText(View view){

        etName.getText().clear();

        //tvMessage.setText("Welcome!"+counter++);
        tvMessage.setText("Welcome");

        Toast toast = Toast.makeText(this, "Name have been reset", Toast.LENGTH_SHORT);
        toast.show();
    }
}