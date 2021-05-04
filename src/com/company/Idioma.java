package com.company;

public class Idioma {
    public Idioma(){}

    public String Lectura(){

        String datos;
        datos = Main.scan.nextLine();
        return datos;
    }

    public void Esp_Alb(){
        String data;
        Idioma idioma = new Idioma();
        System.out.println("Ingresa una frase: ");
        data =  idioma.Lectura();
        for (int i = 0, j = 0; i< data.length(); i++, j++){
            if (data.substring(j,i+1).equals("a")){
                System.out.print("y");
            }else if (data.substring(j,i+1).equals("b")){
                System.out.print("p");
            }else if (data.substring(j,i+1).equals("c")){
                System.out.print("l");
            }else if (data.substring(j,i+1).equals("d")){
                System.out.print("t");
            }else if (data.substring(j,i+1).equals("e")){
                System.out.print("a");
            }else if (data.substring(j,i+1).equals("f")){
                System.out.print("v");
            }else if (data.substring(j,i+1).equals("g")){
                System.out.print("k");
            }else if (data.substring(j,i+1).equals("h")){
                System.out.print("r");
            }else if (data.substring(j,i+1).equals("i")){
                System.out.print("e");
            }else if (data.substring(j,i+1).equals("j")){
                System.out.print("z");
            }else if (data.substring(j,i+1).equals("k")){
                System.out.print("g");
            }else if (data.substring(j,i+1).equals("l")){
                System.out.print("m");
            }else if (data.substring(j,i+1).equals("m")){
                System.out.print("s");
            }else if (data.substring(j,i+1).equals("n")){
                System.out.print("h");
            }else if (data.substring(j,i+1).equals("ñ")){
                System.out.print("h");
            }else if (data.substring(j,i+1).equals("o")){
                System.out.print("u");
            }else if (data.substring(j,i+1).equals("p")){
                System.out.print("b");
            }else if (data.substring(j,i+1).equals("q")){
                System.out.print("x");
            }else if (data.substring(j,i+1).equals("r")){
                System.out.print("n");
            }else if (data.substring(j,i+1).equals("s")){
                System.out.print("c");
            }else if (data.substring(j,i+1).equals("t")){
                System.out.print("d");
            }else if (data.substring(j,i+1).equals("u")){
                System.out.print("i");
            }else if (data.substring(j,i+1).equals("v")){
                System.out.print("j");
            }else if (data.substring(j,i+1).equals("w")){
                System.out.print("f");
            }else if (data.substring(j,i+1).equals("x")){
                System.out.print("q");
            }else if (data.substring(j,i+1).equals("y")){
                System.out.print("o");
            }else if (data.substring(j,i+1).equals("z")){
                System.out.print("w");
            }else if (data.substring(j,i+1).equals(" ")){
                System.out.print(" ");
            }else{
                System.out.print(data.substring(j,i+1));
            }
        }
        System.out.println();
        System.out.println();
    }
    public void Alb_Esp(){
        String data;
        Idioma Funciones = new Idioma();
        System.out.println("Ingresa una frase: ");
        data =  Funciones.Lectura();
        for (int i = 0, j = 0; i< data.length(); i++, j++){
            if (data.substring(j,i+1).equals("y")){
                System.out.print("a");
            }else if (data.substring(j,i+1).equals("p")){
                System.out.print("b");
            }else if (data.substring(j,i+1).equals("l")){
                System.out.print("c");
            }else if (data.substring(j,i+1).equals("t")){
                System.out.print("d");
            }else if (data.substring(j,i+1).equals("a")){
                System.out.print("e");
            }else if (data.substring(j,i+1).equals("v")){
                System.out.print("f");
            }else if (data.substring(j,i+1).equals("k")){
                System.out.print("g");
            }else if (data.substring(j,i+1).equals("r")){
                System.out.print("h");
            }else if (data.substring(j,i+1).equals("e")){
                System.out.print("i");
            }else if (data.substring(j,i+1).equals("z")){
                System.out.print("j");
            }else if (data.substring(j,i+1).equals("g")){
                System.out.print("k");
            }else if (data.substring(j,i+1).equals("m")){
                System.out.print("l");
            }else if (data.substring(j,i+1).equals("s")){
                System.out.print("m");
            }else if (data.substring(j,i+1).equals("h")){
                System.out.print("n");
            }else if (data.substring(j,i+1).equals("u")){
                System.out.print("o");
            }else if (data.substring(j,i+1).equals("b")){
                System.out.print("p");
            }else if (data.substring(j,i+1).equals("x")){
                System.out.print("q");
            }else if (data.substring(j,i+1).equals("n")){
                System.out.print("r");
            }else if (data.substring(j,i+1).equals("c")){
                System.out.print("s");
            }else if (data.substring(j,i+1).equals("d")){
                System.out.print("t");
            }else if (data.substring(j,i+1).equals("i")){
                System.out.print("u");
            }else if (data.substring(j,i+1).equals("j")){
                System.out.print("v");
            }else if (data.substring(j,i+1).equals("f")){
                System.out.print("w");
            }else if (data.substring(j,i+1).equals("q")){
                System.out.print("x");
            }else if (data.substring(j,i+1).equals("o")){
                System.out.print("y");
            }else if (data.substring(j,i+1).equals("w")){
                System.out.print("z");
            }else if (data.substring(j,i+1).equals(" ")){
                System.out.print(" ");
            }else{
                System.out.print(data.substring(j,i+1));
            }
        }
        System.out.println();
        System.out.println();
    }
}