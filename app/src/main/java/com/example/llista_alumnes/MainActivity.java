package com.example.llista_alumnes;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toolbar;

import java.util.ArrayList;
import java.util.Arrays;



public class MainActivity extends Activity {

    public final static int REQUEST_CODE_B = 1;
    public final static int REQUEST_CODE_C = 2;

    private TextView tv1;
    private ListView lv1;
    private Spinner spinner ;
    private Toolbar toolbar;
    private Custom_listview_adapter adapter;


    private ArrayList noms =new ArrayList <String> (Arrays.asList("Samuel", "Valentina", "Santiago", "Alejandro", "Valeria", "Benjamin",
            "Gerardo", "Carlos", "David"));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        inicialitza();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the main; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){
        switch (item.getItemId()){
            case R.id.add_estudiants:
                addEstudiant();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void inicialitza() {
        tv1 = findViewById(R.id.tv1);
        lv1 = findViewById(R.id.lv1);
        toolbar = findViewById(R.id.toolbar);
        setActionBar(toolbar);
        adapter = new Custom_listview_adapter(this,R.layout.adapter_list_view, R.id.lv1, noms);
        lv1.setAdapter(adapter);

    }

    void addEstudiant(){
        Intent intent = new Intent(getBaseContext(), second_activity.class );
        startActivityForResult(intent, REQUEST_CODE_B);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
            case REQUEST_CODE_B:
                noms.add(data.getStringExtra("name"));
                adapter.notifyDataSetChanged();
                break;

        }
    }
}
