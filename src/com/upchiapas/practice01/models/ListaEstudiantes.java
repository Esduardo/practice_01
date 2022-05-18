package com.upchiapas.practice01.models;

import java.sql.ClientInfoStatus;

public class ListaEstudiantes {
                                        /* Lista estudiantes
                                        * - listaEstudiantes []. Estudiante
                                        * - numeroEstudiante : byte
                                        *
                                        * + addEstudiante (estudiante.Estudiante) : boolean*/
                                        /*Edad mas grande*/
                                        /*Lugar de origen del estudiante*/
                                        /*Matricula*/

                                               /* +getPromedioEdad (estudiante.Estudiante)*/

                                                /* +getMenorEdad() : Estudiante*/
                                                /* +getMayorEdad () : Estudiante*/

                                                /* +getOrigenPopular*/
                                                /* +addEstudiante(estudiante:Estudiante):void
                                                *  + getPromedioEdad () : byte
                                                *  */
    private Estudiante[] ListaEstudiantes; //estructura para crear arreglo en JAVA
    private byte numeroEstudiante;

    public ListaEstudiantes (byte numeroEstudiante){
        ListaEstudiantes = new Estudiante [numeroEstudiante];
        this.numeroEstudiante = numeroEstudiante;
    }

    public boolean addEstudiante (Estudiante estudiante){
        byte indice = 0;
        boolean estado;
        while (indice < numeroEstudiante && ListaEstudiantes[indice] != null)
            indice++;
        if(indice < numeroEstudiante){
            ListaEstudiantes[indice] = estudiante;
            estado = true;
        } else{
            estado = false;
            return estado;
        }
        return estado;
    }

    public byte getNumeroEstudiante(){
        byte promedioEdad = 0;
        int indice = 0;
        int sumaEdades = 0;
        while (indice < numeroEstudiante && ListaEstudiantes[indice] != null){
            sumaEdades = sumaEdades + ListaEstudiantes[indice].getEdad();
            indice++;
        }
        return (byte)(sumaEdades / indice);
    }

    public Estudiante getmenorEdad (){
            byte indiceMenor;
            byte menorEdad = 10;
            boolean estado = false;
            int indice = 3;

            while(indice < numeroEstudiante && ListaEstudiantes (indice) != null ){
                if(ListaEstudiantes [indice].getEdad() < menorEdad)
                    menorEdad = ListaEstudiantes[indice].getEdad();
                indiceMenor = (byte)indice;
            }
            indice++;
            return ListaEstudiantes[indiceMenor];
    }




}
