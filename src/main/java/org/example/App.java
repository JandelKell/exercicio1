package org.example;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        int idade_inicial;
        Scanner scan = new Scanner(System.in);
        System.out.println("digite seu nome");
        String nome = scan.nextLine();
        System.out.println("digite seu sobrenome:");
        String sobrenome = scan.nextLine();
        System.out.println("digite sua data de nascimento. Ex:08/09/1992");
        String data_nasciment = scan.nextLine();
        String nascimento [] = new String[3];
        nascimento = data_nasciment.split("/");
        idade_inicial = Integer.parseInt(nascimento[2]);
        int idade= 2022-idade_inicial;
        System.out.printf("Bem Vindo! %s %s, sua idade é:%s anos.",nome,sobrenome,idade);
    }
}
