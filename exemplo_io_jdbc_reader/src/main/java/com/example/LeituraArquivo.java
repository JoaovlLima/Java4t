package main.java.com.example;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LeituraArquivo {
    public static void main(String[] args) {
   
    // public void teste() {
        String src_file = "C:\\Users\\DevTarde\\Documents\\joaoLima\\Java4t/dados.txt";
        try (BufferedReader br = new BufferedReader(new FileReader(src_file))) {
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    // }
}
}
