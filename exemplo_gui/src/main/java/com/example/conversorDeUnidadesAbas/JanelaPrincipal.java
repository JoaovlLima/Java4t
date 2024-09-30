package com.example.conversorDeUnidadesAbas;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JanelaPrincipal extends JFrame {
    private JTabbedPane jTPane;

    public JanelaPrincipal() {
        super();

        jTPane = new JTabbedPane();
        add(jTPane);
        // criandos as tabs
        // tab1 carros
        Distancia tab1 = new Distancia();
        jTPane.add("Distância", tab1);
        Peso tab2 = new Peso();
        jTPane.add("Venda", tab2);
        Temperatura tab3 = new Temperatura();
        jTPane.add("Clientes", tab3);
        setBounds(100, 100, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
       
    }

    // métodos para tornar a janela visível
    public void run() {
        this.setVisible(true);
    }

}
