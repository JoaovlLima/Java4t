package com.example.Exercicios;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import org.json.JSONArray;
import org.json.JSONObject;

public class Exercicio2 {

    public static void main(String[] args) {
        String apiUrl = "http://localhost:3000/usuarios";
        try {
            // Conectando à API
            URL url = new URL(apiUrl);
            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");
            conn.setRequestProperty("Accept", "application/json");

            // Verificando se a conexão foi bem-sucedida
            if (conn.getResponseCode() != 200) {
                throw new RuntimeException("Erro: HTTP " + conn.getResponseCode());
            }

            // Lendo os dados da API
            BufferedReader br = new BufferedReader(new InputStreamReader((conn.getInputStream())));
            StringBuilder response = new StringBuilder();
            String linha;
            while ((linha = br.readLine()) != null) {
                response.append(linha);
            }
            conn.disconnect();

            // Processando os dados JSON
            JSONArray usuarios = new JSONArray(response.toString());

            int totalUsuarios = usuarios.length();
            int somaIdades = 0;

            System.out.println("Lista de usuários:");
            for (int i = 0; i < usuarios.length(); i++) {
                JSONObject usuario = usuarios.getJSONObject(i);
                String nome = usuario.getString("nome");
                int idade = usuario.getInt("idade");
                String cidade = usuario.getString("cidade");
                somaIdades += idade;

                System.out.println("Nome: " + nome + ", Idade: " + idade + ", Cidade: " + cidade);
            }

            // Calculando a média de idade
            double mediaIdade = (double) somaIdades / totalUsuarios;

            // Exibindo informações finais
            System.out.println("\nNúmero total de usuários: " + totalUsuarios);
            System.out.println("Média de idade dos usuários: " + mediaIdade);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

