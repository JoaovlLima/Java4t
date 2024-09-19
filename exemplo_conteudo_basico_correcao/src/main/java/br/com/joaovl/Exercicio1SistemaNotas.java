package br.com.joaovl;

import java.util.Scanner;

public class Exercicio1SistemaNotas {
      Scanner scanner = new Scanner(System.in);   
double[] notas = new double[4];
double mediaNotas = 0;
boolean bonus = true;



public void calcularNotas(){
    for (int i = 0; i < notas.length; i++) {
        System.out.print("Digite a nota da disciplina " + (i + 1) + ": ");
        notas[i] = scanner.nextDouble();
        mediaNotas += notas[i];

        if (notas[i] <= 9) {
            bonus = false;
        }
    }


    double media = mediaNotas / notas.length;
    String mensagemAcimaNove = "";
   
    if (bonus) {
        media *= 1.10; 
        mensagemAcimaNove = "Adicionado 10% a sua nota";
    }

    if (media > 10){
        media = 10;
    }

   
    String status;
    if (media >= 7) {
        status = "Aprovado";
    } else if (media >= 5 && media < 7) {
        status = "Recuperação";
    } else {
        status = "Reprovado";
    }

    // Exibe a média e o status do aluno
    System.out.printf("\nMédia final: %.2f\n", media);
    System.out.println("Status do aluno: " + status);
    System.out.println(mensagemAcimaNove);

    scanner.close();
    
}
}
