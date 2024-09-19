package br.com.joaovl;


public class ExemploConteudoBasico {

public void operacao(){
    int a = 20, b= 30;
    double c = 7.8;
    char letra = 'D';
    boolean teste = false;

    teste = (a>b) && (c<8);

    System.out.println("Resultado de a+b = "+ a+b);

    System.out.println("Resultado de a+b = "+ (a+b));

    System.out.println("Resultado para Teste: "+ teste);

}

public void controleFluxo(){
    // If-Else
int idade = 18;
if (idade >= 18) {
    System.out.println("Maior de idade");
} else {
    System.out.println("Menor de idade");
}

// Switch
int dia = 2;
switch(dia) {
    case 1:
        System.out.println("Segunda-feira");
        break;
    case 2:
        System.out.println("Terça-feira");
        break;
    default:
        System.out.println("Outro dia");
}

// For Loop
for (int i = 0; i < 10; i++) {
    System.out.println("Contagem: " + i);
}
int i = 10;
while (i>0) {
    System.out.println(i);
    i--;
    
}
}
}
