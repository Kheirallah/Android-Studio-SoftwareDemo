package com.example.kheirallah.softwaredemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView name;

    private TextView DOB;
    private TextView email;

    private EditText getName;
    private EditText getDOB;
    private EditText getEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        name = (TextView) findViewById(R.id.showName);
        DOB = (TextView) findViewById(R.id.showDOB);
        email = (TextView) findViewById(R.id.showEmail);

        getName = (EditText) findViewById(R.id.enterName);
        getDOB = (EditText) findViewById(R.id.birthdayInput);
        getEmail = (EditText) findViewById(R.id.emailInput);

        Button B = (Button) findViewById(R.id.buttonNext);
        B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                setFields();
            }

        });

        Button BTwo = (Button) findViewById(R.id.backOne);
        BTwo.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goBackMain();
            }

        });
    }


    public void setFields() {

        name.setText(getName.getText());
        DOB.setText(getDOB.getText());
        email.setText(getEmail.getText());

    }

    private void goBackMain(){
        Intent intent = new Intent(this, MainActivity.class);

        startActivity(intent);
    }
}
