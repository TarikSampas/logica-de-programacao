package br.newtonpaiva;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.*;

public class LotofacilGUI extends JFrame{
    // Atributos
    private JPanel painel = new JPanel();
    private JLabel jLabelMensagem = new JLabel("Escolha um tipo de aposta para começar");
    private JButton jButtonAposta1 = new JButton("Aposta de 0 a 100");
    private JButton jButtonAposta2 = new JButton("Aposta de A á Z");
    private JButton jButtonAposta3 = new JButton("Aposta em par ou ímpar");
    // Construtor
    public LotofacilGUI(){
        this.setTitle("Loto Fácil - Interface Gráfica");
        this.setSize(400,200);
        painel.setLayout(new FlowLayout(FlowLayout.CENTER, 100, 20));
        painel.setBackground(new Color(255,255,255));
        painel.add(jButtonAposta1); painel.add(jButtonAposta2); painel.add(jButtonAposta3);
        this.getContentPane().add(painel);
        this.setLocationRelativeTo(null); // Centralizar janela
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setVisible(true); // Exibir janela

        // Aposta 1
        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Scanner in = new Scanner (System.in)
                String aposta = JOptionPane.showInputDialog(null,
                        "Digite um número de 0 a 100");
                int numeroApostado = Integer.parseInt(aposta);
                // System.out.println();
//                JOptionPane.showMessageDialog(null, numeroApostado);
                Random rnd = new Random();
                int sorteio = rnd.nextInt(101);
                if(numeroApostado == sorteio){
//                    System.out.println("Você ganhou milzão.");
                    JOptionPane.showMessageDialog(null, "Você ganhou R$ 1.000,00");
                }else {
//                    System.out.println("Você perdeu!, o número sorteado foi: " + sorteio);
                    JOptionPane.showMessageDialog(null, "Que pena, você perdeu! O número sorteado foi: " + sorteio);
                }
            }
        });

//    // Aposta 2
//        jButtonAposta2.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent e) {
//
//            String aposta = JOptionPane.showInputDialog(null,
//                    "Digite uma letra de A á Z");
//            int letraApostada = Integer.parseInt(aposta);
//
//            char sorteio = 'J';
//            if(Character.isLetter(letraApostada)){
//                char letraApostadaMaiusculo = (char) Character.toUpperCase(letraApostada);
//                if(letraApostada == sorteio) {
//                JOptionPane.showMessageDialog(null, "Você ganhou R$ 500,00");
//            }else {
//                JOptionPane.showMessageDialog(null, "Que pena, você perdeu! A letra sorteada foi " + sorteio);
//            }
//        }
//    });

//    // Aposta 3
//        jButtonAposta3.addActionListener(new ActionListener() {
//        @Override
//        public void actionPerformed(ActionEvent g) {
//
//            String aposta = JOptionPane.showInputDialog(null, "Digite um número;");
//            int numeroApostado = Integer.parseInt(aposta);
//
//            if(numeroApostado % 2 == 0){
//                JOptionPane.showMessageDialog(null, "Você ganhou R$ 100,00");
//            }else {
//                JOptionPane.showMessageDialog(null, "Que pena, você perdeu! O número sorteado foi: " + sorteio);
//            }
//        }
//    });

}
    public static void main(String[] args) {new LotofacilGUI();}
}
