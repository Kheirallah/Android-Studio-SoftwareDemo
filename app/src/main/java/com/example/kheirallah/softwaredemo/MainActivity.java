package com.example.kheirallah.softwaredemo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Log.d("SAMPLE: ", "Here is your example tag that displays when the application starts");
        Button B = (Button) findViewById(R.id.buttonMain);
        B.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                goToSecondActivity();
            }

        });

        B.
        }

    private void goToSecondActivity() {

        Intent intent = new Intent(this, SecondActivity.class);

        startActivity(intent);

    }

}
