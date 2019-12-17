package com.example.llistaalumnesv1;

public class Avaluacio{
    String data;
    int asistencia;
    int nota;
    Alumne alumne;

    public Avaluacio(String data, int asistencia, Alumne alumne) {
        this.alumne= alumne;
        this.data = data;
        this.asistencia = asistencia;
    }

    public Avaluacio(String data, int asistencia, int nota, Alumne alumne) {
        this.alumne= alumne;
        this.data = data;
        this.asistencia = asistencia;
        this.nota = nota;
    }
}
