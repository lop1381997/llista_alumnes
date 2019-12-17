package com.example.llista_alumnes;


import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;


public class MainActivity extends Activity {

    private TextView tv1;
    private ListView lv1;
    private Spinner spinner;


    private String[] nombres = {"Samuel", "Valentina", "Santiago", "Alejandro", "Valeria", "Benjamin",
            "Gerardo", "Carlos", "David", "Sofía"};
    private String [] spinner_array = {"Ha vingut", "Ha arribat tard"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicialitza();
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.activity_main, R.id.adapter_name, nombres);
        lv1.setAdapter(adapter);

        lv1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                tv1.setText("La edad de " + lv1.getItemAtPosition(i) );
            }
        });

        ArrayAdapter<String> adapter_spinner = new ArrayAdapter<>(this, R.layout.activity_main, R.id.spinner, spinner_array);
        spinner.setAdapter(adapter_spinner);
    }


    private void inicialitza() {
        tv1 = findViewById(R.id.tv1);
        lv1 = findViewById(R.id.lv1);
        spinner = findViewById(R.id.spinner);
    }
}
