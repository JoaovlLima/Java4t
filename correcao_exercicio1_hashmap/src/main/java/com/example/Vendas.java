package com.example;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Vendas {
    private Map<String, List<Produto>> vendasCpf;

    public Vendas() {
        vendasCpf = new HashMap<>();
    }

    public void cadastroVenda(String cpf, Produto p) {
        for (String cpfUsuario : vendasCpf.keySet()) {

            if (cpfUsuario.equals(cpf)) {

                List<Produto> produtosCpf = vendasCpf.get(cpf);
                produtosCpf.add(p);
                vendasCpf.put(cpf, produtosCpf);
                return;

            }

        }

        List<Produto> produtoCpfVazio = new ArrayList<>();
        produtoCpfVazio.add(p);
        vendasCpf.put(cpf, produtoCpfVazio);

    }

    public List<Produto> listarProdutosCpf(String cpf) {

        List<Produto> listaCpf = vendasCpf.getOrDefault(cpf, Collections.emptyList());

        return listaCpf;

    }

    public List<Produto> listarProdutosFiltro(String cpf, double valorMinimo) {

        List<Produto> listaCpfFiltro = vendasCpf.getOrDefault(cpf, Collections.emptyList());
        try {
            if (listaCpfFiltro.isEmpty()) {

                throw new Exception("CPF Não encontrado");

            } else {
                List<Produto> resultado = listaCpfFiltro.stream()
                        .filter(p -> p.getPreco() >= valorMinimo)
                        .collect(Collectors.toList());

                return resultado;
            }

        } catch (Exception e) {

        }

        return listaCpfFiltro;

    }
}
