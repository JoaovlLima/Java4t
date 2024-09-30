package com.example.conversorDeUnidadesAbas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversoresApp extends JFrame {

    public ConversoresApp() {
        // Criação do JTabbedPane
        JTabbedPane tabbedPane = new JTabbedPane();

        // Abas do conversor de temperatura, distância e peso
        tabbedPane.addTab("Conversor de Temperatura", criarPainelConversorTemperatura());
        tabbedPane.addTab("Conversor de Distância", criarPainelConversorDistancia());
        tabbedPane.addTab("Conversor de Peso", criarPainelConversorPeso());

        // Adiciona o JTabbedPane ao JFrame
        add(tabbedPane);

        // Configurações da janela
        setTitle("Aplicativo de Conversores");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    private JPanel criarPainelConversorTemperatura() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        JLabel labelCelsius = new JLabel("Celsius:");
        JTextField campoCelsius = new JTextField();
        JButton botaoConverter = new JButton("Converter para Fahrenheit");
        JLabel resultado = new JLabel("Resultado: ");

        botaoConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double celsius = Double.parseDouble(campoCelsius.getText());
                double fahrenheit = celsius * 9/5 + 32;
                resultado.setText("Resultado: " + fahrenheit + " °F");
            }
        });

        panel.add(labelCelsius);
        panel.add(campoCelsius);
        panel.add(botaoConverter);
        panel.add(resultado);

        return panel;
    }

    private JPanel criarPainelConversorDistancia() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        JLabel labelKm = new JLabel("Quilômetros:");
        JTextField campoKm = new JTextField();
        JButton botaoConverter = new JButton("Converter para Milhas");
        JLabel resultado = new JLabel("Resultado: ");

        botaoConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double km = Double.parseDouble(campoKm.getText());
                double milhas = km * 0.621371;
                resultado.setText("Resultado: " + milhas + " milhas");
            }
        });

        panel.add(labelKm);
        panel.add(campoKm);
        panel.add(botaoConverter);
        panel.add(resultado);

        return panel;
    }

    private JPanel criarPainelConversorPeso() {
        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));

        JLabel labelKg = new JLabel("Quilogramas:");
        JTextField campoKg = new JTextField();
        JButton botaoConverter = new JButton("Converter para Libras");
        JLabel resultado = new JLabel("Resultado: ");

        botaoConverter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double kg = Double.parseDouble(campoKg.getText());
                double libras = kg * 2.20462;
                resultado.setText("Resultado: " + libras + " lbs");
            }
        });

        panel.add(labelKg);
        panel.add(campoKg);
        panel.add(botaoConverter);
        panel.add(resultado);

        return panel;
    }

    public static void main(String[] args) {
        // Executa a aplicação
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ConversoresApp().setVisible(true);
            }
        });
    }
}
