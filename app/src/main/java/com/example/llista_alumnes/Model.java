package com.example.llista_alumnes;

import android.content.Context;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Model {
    private List<String> dades = new ArrayList<String>();

    Model(Context context){
        carregaDades(context);
    }

    private void carregaDades(Context context){
        String [] dadesEstatiques = context.getResources().getStringArray(R.array.DadesEstatiques);
        Collections.addAll(dades,dadesEstatiques);
    }
}
