package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Pedimos la fecha en formato dia/mes/año por consola y asignamos cada uno a una variable.
        System.out.println("Introduzca el dia:\n");
        Scanner sc=new Scanner(System.in);
        int dia=sc.nextInt();
        System.out.println("Introduzca el mes:\n");
        int mes=sc.nextInt();
        System.out.println("Introduzca el año:\n");
        int año=sc.nextInt();
        //Boolean para imprimir la respuesta adecuada.
        boolean fecha=false;
        int diafinal=dia;
        int mesfinal=mes;
        int añofinal=año;
        //If para comprobar si los datos introducidos estan dentro del rango aceptado.
        if (dia>0 && dia<=30){
            if (mes>0 && mes<=12){
                if (año>0){
                    fecha=true;
                }
            }
        }
        //Comprobamos si la fecha es final de mes/año e incrementamos las variables apropiadas y reseteamos el dia/mes. En caso de que no sea final de mes/año, se aumenta en uno el dia.
        if(fecha){
            System.out.println("La fecha introducida es correcta.");
            if(mes!=12&&dia!=30){
                diafinal=dia+1;
            }else {
                if (mes == 12 && dia == 30) {
                    diafinal = 1;
                    mesfinal = 1;
                    añofinal ++;
                } else {
                    if (mes != 12 && dia == 30) {
                        diafinal = 1;
                        mesfinal ++;
                    } else {
                        diafinal = dia + 1;
                    }
                }

            }
            //Imprimimos en pantalla el resultado
            System.out.printf("El dia siguiente al introducido es: %d/%d/%d", diafinal, mesfinal, añofinal);
        }else{
            System.out.println("La fecha introducida es incorrecta.");
        }
        //Cerramos el scanner.
        sc.close();
    }
}
