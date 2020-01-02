package com.example.llista_alumnes;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home_screen extends Activity {

    public final static int REQUEST_CODE_B = 1;
    public final static int REQUEST_CODE_C = 2;

    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        inicialitza();
    }

    private void inicialitza() {
        button = findViewById(R.id.go);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(), MainActivity.class);
                startActivityForResult(intent, REQUEST_CODE_B);
                finish();
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch(requestCode) {
            case REQUEST_CODE_B:
                Intent intent = new Intent();
                String date = intent.getStringExtra("date");

                break;

        }
    }
}
