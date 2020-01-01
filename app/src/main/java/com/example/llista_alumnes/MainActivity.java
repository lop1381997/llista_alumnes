package com.example.llista_alumnes;


import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends Activity {

    private TextView tv1;
    private ListView lv1;
    private Spinner spinner ;


    private String[] noms = {"Samuel", "Valentina", "Santiago", "Alejandro", "Valeria", "Benjamin",
            "Gerardo", "Carlos", "David", "Sofía"};


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
             //   addEstudiant();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void inicialitza() {
        tv1 = findViewById(R.id.tv1);
        lv1 = findViewById(R.id.lv1);
        Custom_listview_adapter adapter = new Custom_listview_adapter(this,R.layout.adapter_list_view, R.id.lv1,noms);
        lv1.setAdapter(adapter);

    }
}
