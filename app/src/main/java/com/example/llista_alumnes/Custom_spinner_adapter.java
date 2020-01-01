package com.example.llista_alumnes;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


// aquest custom adapter es pel list_view no pel spinner
// aqui pots interectuar amb spinner usant al funcio del getview

public class Custom_spinner_adapter extends ArrayAdapter implements SpinnerAdapter {
    Context context;
    private int textResourceId;
    private int resource;
    private String [] data;

    public Custom_spinner_adapter(Context context, int resource,  int textViewResourceId, String [] data) {
        super(context, resource, textViewResourceId, data);
        this.context = context;
        this.textResourceId = textViewResourceId;
        this.resource = resource;
        this.data = data;
    }

    @Override
    public int getCount(){
        return this.data.length;
    }

    @Override
    public Object getItem(int position){
        return this.data[];
    }

    @Override
    public long getItemId( int position){
        return position;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        return init_view(position,convertView,parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
         return init_view(position,convertView,parent);
    }

    public View init_view(int position, View convertView, ViewGroup parent){
        View view = convertView;
        if (view == null){
            view = ((Activity) context).getLayoutInflater().inflate( R.layout.adapter_spinner, null);
        }

        TextView spinner = view.findViewById(R.id.tv_spinner);
        spinner.setText(data[position]);

        return view;
    }
}
