package com.example;

import java.util.Scanner;

public class LeituraTeclado {
    public void teste(){
        Scanner sc = new Scanner(System.in);


        //Leitura do Nome 

        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();

       //Leitura da Idade

       System.out.println("Digite sua Idade: ");
       int idade = sc.nextInt();

       sc.close();

       System.out.println("Olá, "+nome+" sua idade é "+idade);
    }
}
