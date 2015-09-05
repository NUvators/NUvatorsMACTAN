package com.nuvators.kuyatotolang.nuvatorsmactan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class activityHardwareMode extends AppCompatActivity implements View.OnClickListener {

    Button AcceLDR;
    Button GasDetector;
    Button TempSensor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_hardware_mode);
        AcceLDR = (Button) findViewById(R.id.btnAcceLDR);
        AcceLDR.setOnClickListener(this);
        GasDetector = (Button) findViewById(R.id.btnGasSensor);
        GasDetector.setOnClickListener(this);
        TempSensor = (Button) findViewById(R.id.btnTempSensor);
        TempSensor.setOnClickListener(this);
    }

    private void btnAcceLDR()
    {
        startActivity(new Intent("android.intent.action.acceLDR"));
    }
    private void btnGasDetector()
    {
        startActivity(new Intent("android.intent.action.gasDetector"));
    }
    private void btnTempSensor()
    {
        startActivity(new Intent("android.intent.action.TempSensor"));
    }

    public void onClick (View v){
        switch (v.getId())
        {
            case R.id.btnAcceLDR:
                btnAcceLDR();
                break;
            case R.id.btnGasSensor:
                btnGasDetector();
                break;
            case R.id.btnTempSensor:
                btnTempSensor();
                break;
        }
    }
}

