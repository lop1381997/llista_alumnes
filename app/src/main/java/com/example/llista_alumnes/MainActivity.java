package com.example.llista_alumnes;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.CalendarView;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;

import androidx.annotation.NonNull;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendari);

        CalendarView calendarView = findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView calendarView, int i, int i1, int i2) {
                String date = i + "/" + (i1+1) + "/" + i2;

                Intent intent = new Intent(MainActivity.this, LlistaActivity.class);
                intent.putExtra("date", date);

                startActivity(intent);
            }
        });
    }
}
