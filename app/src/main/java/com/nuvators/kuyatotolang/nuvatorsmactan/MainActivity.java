package com.nuvators.kuyatotolang.nuvatorsmactan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{


    Button hardware_mode;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hardware_mode = (Button) findViewById(R.id.btnHardwareMode);
        hardware_mode.setOnClickListener(this);
    }

    private void btnHardwareModeClick()
    {
        startActivity(new Intent("android.intent.action.activityHardwareMode"));
    }

    public void onClick (View v){
        switch (v.getId())
        {
            case R.id.btnHardwareMode:
                btnHardwareModeClick();
                break;

        }
    }
}


