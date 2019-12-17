package com.example.llistaalumnesv1;

import java.util.List;

public class Data {
    List<LlistaAvaluacio> dia;
    String fecha;

    public Data(List<LlistaAvaluacio> dia, String fecha) {
        this.dia = dia;
        this.fecha = fecha;
    }

    public List<LlistaAvaluacio> getDia() {
        return dia;
    }

    public String getFecha() {
        return fecha;
    }
}
