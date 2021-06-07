package com.pranish.crimereportingsoftware;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class main_activity extends AppCompatActivity {
    private Button report,SOS,chat,station;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_menu);

        report = (Button) findViewById(R.id.report);
        SOS = (Button) findViewById(R.id.SOS);
        chat = (Button) findViewById(R.id.chat);
        station = (Button) findViewById(R.id.station);

        report.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(main_activity.this, ReportPage.class);
                startActivity(intent);
            }
        });
        SOS.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(main_activity.this, EmergencyContact.class);
                startActivity(intent);
            }
        });
        chat.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(main_activity.this, PublicChat.class);
                startActivity(intent);
            }
        });
        station.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(main_activity.this, LocateStation.class);
                startActivity(intent);
            }
        });

    }

}
