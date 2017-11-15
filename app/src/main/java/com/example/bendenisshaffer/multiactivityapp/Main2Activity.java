package com.example.bendenisshaffer.multiactivityapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Main2Activity extends Activity implements Button.OnClickListener{

    private Button button2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        button2 = (Button) findViewById(R.id.button2);

        button2.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        Intent intentGoBack = new Intent(this,MainActivity.class);
        this.startActivity(intentGoBack);

    }
}
