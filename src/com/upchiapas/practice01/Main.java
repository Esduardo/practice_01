package com.upchiapas.practice01;

import com.upchiapas.practice01.models.Estudiante;
import com.upchiapas.practice01.models.ListaEstudiantes;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args){
        ListaEstudiantes estudiantes = new ListaEstudiantes((byte)3);
        Estudiante veronica = new Estudiante (221214,
                "Veronica",
                'F',
                "Tuxtla Gutierrez",
                LocalDate.of(2003, 12,4));

        Estudiante esduardo = new Estudiante(221214,
                "Esduardo",
                'M',
                "Tapachula, Chiapas",
        LocalDate.of(2004, 1, 8));

        byte edad;
        edad = veronica.getEdad();
        System.out.println(veronica.getNombre() +" tiene " + veronica.getEdad() + " años y vive en " + veronica.getLugarOrigen() + " y su sexo es " + veronica.getSexo() + "y su matricula es" + veronica.getMatricula());
        System.out.println(veronica);

        if (estudiantes.addEstudiante(veronica));
        System.out.println("El objeto fue creado con exito");

        System.out.printf(""); estudiantes.getmenorEdad();

    }
}
