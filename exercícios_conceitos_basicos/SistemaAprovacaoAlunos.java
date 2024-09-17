import java.util.Scanner;

public class SistemaAprovacaoAlunos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] notas = new double[4]; 
        double soma = 0;
        boolean todasNotasAcimaDeNove = true;

        
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota da disciplina " + (i + 1) + ": ");
            notas[i] = scanner.nextDouble();
            soma += notas[i];

            if (notas[i] <= 9) {
                todasNotasAcimaDeNove = false;
            }
        }

    
        double media = soma / notas.length;
        String mensagemAcimaNove = "";
       
        if (todasNotasAcimaDeNove) {
            media *= 1.10; 
            mensagemAcimaNove = "Adicionado 10% a sua nota";
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
