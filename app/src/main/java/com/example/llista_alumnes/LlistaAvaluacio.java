package com.example.llistaalumnesv1;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class LlistaAvaluacio {
    private static LlistaAvaluacio sLlistaAvaluacio;
    private List<Avaluacio> avaluacioList;

    public static LlistaAvaluacio get(Context context){
        if(sLlistaAvaluacio == null){
            sLlistaAvaluacio = new LlistaAvaluacio(context);
        }
        return sLlistaAvaluacio;
    }

    private LlistaAvaluacio(Context context){
        avaluacioList = new ArrayList<>();

        avaluacioList.add(new Avaluacio("1011", 1, new Alumne("Sergio","Junqueres",46121234)));
        avaluacioList.add(new Avaluacio("1011", 1, new Alumne("Carla","Mate",46121284)));
        avaluacioList.add(new Avaluacio("1011", 4, new Alumne("Pol","Sanchez",46128234)));
        avaluacioList.add(new Avaluacio("1011", 1, new Alumne("Raul","Cobijo",46129234)));
        avaluacioList.add(new Avaluacio("1011", 2, new Alumne("Robert","Junqueres",46121234)));
        avaluacioList.add(new Avaluacio("1011", 1, new Alumne("Laia","Notes",46161234)));
        avaluacioList.add(new Avaluacio("1011", 3, new Alumne("Mans","Inquietes",46321234)));
        avaluacioList.add(new Avaluacio("1011", 1, new Alumne("Tros","De Lluc",46125234)));
        avaluacioList.add(new Avaluacio("1011", 1, new Alumne("Quim","Tocatecles",46125987)));
    }
    public List<Avaluacio> getAvaluacioList() {
        return avaluacioList;
    }
}
