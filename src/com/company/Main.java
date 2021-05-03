package com.company;

import java.util.*;

public class Main {
    static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) {

        Cadena operacion = new Cadena();
        boolean seguirpidiendo = true;

        while(seguirpidiendo){
            Menu menu = new Menu();

            System.out.println("¿De que idioma a que idioma lo traduces?");
            String[] opciones = {"Español-Albhed", "Albhed-Español", "Salir"};
            String opcion = menu.elegirOpcion(opciones);


            if ("1".equals(opcion)){
                operacion.Esp_Alb();
            }else if ("2".equals(opcion)){
                operacion.Alb_Esp();
            }else if ("3".equals(opcion)){
               seguirpidiendo = false;
            }else{
                System.out.println("Esa opcion no existe");
            }
        }
    }
}
