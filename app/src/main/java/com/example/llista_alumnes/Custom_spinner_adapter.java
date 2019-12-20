package com.example.llista_alumnes;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;


// aquest custom adapter es pel list_view no pel spinner
// aqui pots interectuar amb spinner usant al funcio del getview

public class Custom_spinner_adapter extends ArrayAdapter implements SpinnerAdapter {
    Context context;
    String[] nombres;
    private String [] spinner_array = {"Ha vingut", "Ha arribat tard"};

    public Custom_spinner_adapter(Context context, String[] names){

    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        View view = View.inflate(context, R.layout.adapter_list_view);
        Spinner spinner = view.findViewById(R.id.spinner);
        ArrayAdapter<String> adapter_spinner = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, R.id.spinner);
        spinner.setAdapter(adapter_spinner);
        return spinner;
    }

}
