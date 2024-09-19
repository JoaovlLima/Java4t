package br.com.joaovl;

import java.util.Scanner;

public class ExercicioFatorial {
    int num;
    Scanner scanner = new Scanner(System.in); 
    double resultado;

    public void fatorial() throws Exception{
        System.out.println("Digite o numero a ser fatoriado");
        num = scanner.nextInt();
       
      if (num<0){
        throw new Exception("o N° deve ser positivo");
      }
     try {
        System.out.println(calculo(num));
     } catch (Exception e) {

        System.out.println(e);
     }
        
    }

    public long calculo(int n){

       if (n ==0 || n==1){
        return 1;
       }else {
        return n*calculo(n-1);
       }
       }
}
