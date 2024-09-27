package com.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MinhaJanela extends JFrame{
   
    public MinhaJanela(){
        
        // Cria o JFrame (janela)
        JFrame frame = new JFrame("Exemplo Swing");
        frame.setSize(400, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cria um JPanel (painel)
        JPanel panel = new JPanel();
        frame.add(panel);
        
        // Adiciona um JButton (botão)
        JButton button = new JButton("Clique aqui");
        panel.add(button);
        
        // Adiciona um ActionListener ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null, "Botão foi clicado!");
            }
        });
        
        // Torna a janela visível
        frame.setVisible(true);
    }
}

