package com.example;

public class Main {
    public static void main(String[] args) {
        ListExemplo list = new ListExemplo();
        list.addList("Maria");
        list.addList("João");
        list.addList("Pedro");

        list.modificarNome("Maria", "Julia");

        list.removerNomes("Pedro");

        list.listarNomes();

        
    }
}