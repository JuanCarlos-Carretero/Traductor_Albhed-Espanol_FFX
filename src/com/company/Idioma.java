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
            }else if (data.substring(j,i+1).equals("A")){
                System.out.print("Y");
            }else if (data.substring(j,i+1).equals("b")){
                System.out.print("p");
            }else if (data.substring(j,i+1).equals("B")){
                System.out.print("P");
            }else if (data.substring(j,i+1).equals("c")){
                System.out.print("l");
            }else if (data.substring(j,i+1).equals("C")){
                System.out.print("L");
            }else if (data.substring(j,i+1).equals("d")){
                System.out.print("t");
            } else if (data.substring(j,i+1).equals("D")){
                System.out.print("T");
            }else if (data.substring(j,i+1).equals("e")){
                System.out.print("a");
            }else if (data.substring(j,i+1).equals("E")){
                System.out.print("A");
            }else if (data.substring(j,i+1).equals("f")){
                System.out.print("v");
            }else if (data.substring(j,i+1).equals("F")){
                System.out.print("V");
            }else if (data.substring(j,i+1).equals("g")){
                System.out.print("k");
            }else if (data.substring(j,i+1).equals("G")){
                System.out.print("K");
            }else if (data.substring(j,i+1).equals("h")){
                System.out.print("r");
            }else if (data.substring(j,i+1).equals("H")){
                System.out.print("R");
            }else if (data.substring(j,i+1).equals("i")){
                System.out.print("e");
            }else if (data.substring(j,i+1).equals("I")){
                System.out.print("E");
            }else if (data.substring(j,i+1).equals("j")){
                System.out.print("z");
            }else if (data.substring(j,i+1).equals("J")){
                System.out.print("Z");
            }else if (data.substring(j,i+1).equals("k")){
                System.out.print("g");
            }else if (data.substring(j,i+1).equals("K")){
                System.out.print("G");
            }else if (data.substring(j,i+1).equals("l")){
                System.out.print("m");
            }else if (data.substring(j,i+1).equals("L")){
                System.out.print("M");
            }else if (data.substring(j,i+1).equals("m")){
                System.out.print("s");
            }else if (data.substring(j,i+1).equals("M")){
                System.out.print("S");
            }else if (data.substring(j,i+1).equals("n")){
                System.out.print("h");
            }else if (data.substring(j,i+1).equals("N")){
                System.out.print("H");
            }else if (data.substring(j,i+1).equals("ñ")){
                System.out.print("h");
            }else if (data.substring(j,i+1).equals("Ñ")){
                System.out.print("H");
            }else if (data.substring(j,i+1).equals("o")){
                System.out.print("u");
            }else if (data.substring(j,i+1).equals("O")){
                System.out.print("U");
            }else if (data.substring(j,i+1).equals("p")){
                System.out.print("b");
            }else if (data.substring(j,i+1).equals("P")){
                System.out.print("B");
            }else if (data.substring(j,i+1).equals("q")){
                System.out.print("x");
            }else if (data.substring(j,i+1).equals("Q")){
                System.out.print("X");
            }else if (data.substring(j,i+1).equals("r")){
                System.out.print("n");
            }else if (data.substring(j,i+1).equals("R")){
                System.out.print("N");
            }else if (data.substring(j,i+1).equals("s")){
                System.out.print("c");
            }else if (data.substring(j,i+1).equals("S")){
                System.out.print("C");
            }else if (data.substring(j,i+1).equals("t")){
                System.out.print("d");
            }else if (data.substring(j,i+1).equals("T")){
                System.out.print("D");
            }else if (data.substring(j,i+1).equals("u")){
                System.out.print("i");
            }else if (data.substring(j,i+1).equals("U")){
                System.out.print("I");
            }else if (data.substring(j,i+1).equals("v")){
                System.out.print("j");
            }else if (data.substring(j,i+1).equals("V")){
                System.out.print("J");
            }else if (data.substring(j,i+1).equals("w")){
                System.out.print("f");
            }else if (data.substring(j,i+1).equals("W")){
                System.out.print("F");
            }else if (data.substring(j,i+1).equals("x")){
                System.out.print("q");
            }else if (data.substring(j,i+1).equals("X")){
                System.out.print("Q");
            }else if (data.substring(j,i+1).equals("y")){
                System.out.print("o");
            }else if (data.substring(j,i+1).equals("Y")){
                System.out.print("O");
            }else if (data.substring(j,i+1).equals("z")){
                System.out.print("w");
            }else if (data.substring(j,i+1).equals("Z")){
                System.out.print("W");
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
            }else if (data.substring(j,i+1).equals("Y")){
                System.out.print("A");
            }else if (data.substring(j,i+1).equals("p")){
                System.out.print("b");
            }else if (data.substring(j,i+1).equals("P")){
                System.out.print("B");
            }else if (data.substring(j,i+1).equals("l")){
                System.out.print("c");
            }else if (data.substring(j,i+1).equals("L")){
                System.out.print("C");
            }else if (data.substring(j,i+1).equals("t")){
                System.out.print("d");
            }else if (data.substring(j,i+1).equals("T")){
                System.out.print("D");
            }else if (data.substring(j,i+1).equals("a")){
                System.out.print("e");
            }else if (data.substring(j,i+1).equals("A")){
                System.out.print("E");
            }else if (data.substring(j,i+1).equals("v")){
                System.out.print("f");
            }else if (data.substring(j,i+1).equals("V")){
                System.out.print("F");
            }else if (data.substring(j,i+1).equals("k")){
                System.out.print("g");
            }else if (data.substring(j,i+1).equals("K")){
                System.out.print("G");
            }else if (data.substring(j,i+1).equals("r")){
                System.out.print("h");
            }else if (data.substring(j,i+1).equals("R")){
                System.out.print("H");
            }else if (data.substring(j,i+1).equals("e")){
                System.out.print("i");
            }else if (data.substring(j,i+1).equals("E")){
                System.out.print("I");
            }else if (data.substring(j,i+1).equals("z")){
                System.out.print("j");
            }else if (data.substring(j,i+1).equals("Z")){
                System.out.print("J");
            }else if (data.substring(j,i+1).equals("g")){
                System.out.print("k");
            }else if (data.substring(j,i+1).equals("G")){
                System.out.print("K");
            }else if (data.substring(j,i+1).equals("m")){
                System.out.print("l");
            }else if (data.substring(j,i+1).equals("M")){
                System.out.print("L");
            }else if (data.substring(j,i+1).equals("s")){
                System.out.print("m");
            }else if (data.substring(j,i+1).equals("S")){
                System.out.print("M");
            }else if (data.substring(j,i+1).equals("h")){
                System.out.print("n");
            }else if (data.substring(j,i+1).equals("H")){
                System.out.print("N");
            }else if (data.substring(j,i+1).equals("u")){
                System.out.print("o");
            }else if (data.substring(j,i+1).equals("U")){
                System.out.print("O");
            }else if (data.substring(j,i+1).equals("b")){
                System.out.print("p");
            }else if (data.substring(j,i+1).equals("B")){
                System.out.print("P");
            }else if (data.substring(j,i+1).equals("x")){
                System.out.print("q");
            }else if (data.substring(j,i+1).equals("X")){
                System.out.print("Q");
            }else if (data.substring(j,i+1).equals("n")){
                System.out.print("r");
            }else if (data.substring(j,i+1).equals("N")){
                System.out.print("R");
            }else if (data.substring(j,i+1).equals("c")){
                System.out.print("s");
            }else if (data.substring(j,i+1).equals("C")){
                System.out.print("S");
            }else if (data.substring(j,i+1).equals("d")){
                System.out.print("t");
            }else if (data.substring(j,i+1).equals("D")){
                System.out.print("T");
            }else if (data.substring(j,i+1).equals("i")){
                System.out.print("u");
            }else if (data.substring(j,i+1).equals("I")){
                System.out.print("U");
            }else if (data.substring(j,i+1).equals("j")){
                System.out.print("v");
            }else if (data.substring(j,i+1).equals("J")){
                System.out.print("V");
            }else if (data.substring(j,i+1).equals("f")){
                System.out.print("w");
            }else if (data.substring(j,i+1).equals("F")){
                System.out.print("W");
            }else if (data.substring(j,i+1).equals("q")){
                System.out.print("x");
            }else if (data.substring(j,i+1).equals("Q")){
                System.out.print("X");
            }else if (data.substring(j,i+1).equals("o")){
                System.out.print("y");
            }else if (data.substring(j,i+1).equals("O")){
                System.out.print("Y");
            }else if (data.substring(j,i+1).equals("w")){
                System.out.print("z");
            }else if (data.substring(j,i+1).equals("W")){
                System.out.print("Z");
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