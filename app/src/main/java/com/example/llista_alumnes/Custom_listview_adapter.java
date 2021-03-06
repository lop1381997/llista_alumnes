package com.example.llista_alumnes;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;



// aquest custom adapter es pel list_view no pel spinner
// aqui pots interectuar amb spinner usant al funcio del getview

public class Custom_listview_adapter extends ArrayAdapter {
    Context context;
    private String []  spinner_array = new String [] {"Ha vingut","Ha faltat", "S'ha retrasat", "Falta justificada", "Retard justificat"};
    private String [] notas_array = new String [] {"0","1","2","3","4","5","6","7","8","9","10"};
    private int textResourceId;
    private int resource;
    private ArrayList<String> data;


    public Custom_listview_adapter(Context context, int resource, int textViewResourceId, ArrayList data){
        super(context,resource,textViewResourceId,data);
        this.context = context;
        this.textResourceId = textViewResourceId;
        this.resource = resource;
        this.data = data;

    }

    @Override
    public int getCount(){
        return this.data.size();
    }

    @Override
    public Object getItem(int position){
        return this.data.get(position);
    }

    @Override
    public long getItemId( int position){
        return position;
    }



    @Override
    public View getView(int position, View convertView, ViewGroup parent){

        View view = convertView;
        if (view == null){
            view = ((Activity) context).getLayoutInflater().inflate( R.layout.adapter_list_view, null);
        }

        TextView textView = (TextView) view.findViewById(R.id.name);
        Spinner spinner = (Spinner) view.findViewById(R.id.spinner);
        Spinner notas = (Spinner) view.findViewById(R.id.notas);

        textView.setText(data.get(position));
        Custom_spinner_adapter adapter_notas = new Custom_spinner_adapter(context, R.layout.adapter_spinner,R.id.notas, this.notas_array);
        notas.setAdapter(adapter_notas);
        Custom_spinner_adapter adapter = new Custom_spinner_adapter(context, R.layout.adapter_spinner,R.id.spinner, this.spinner_array);
        spinner.setAdapter(adapter);

        return view;

    }


}
