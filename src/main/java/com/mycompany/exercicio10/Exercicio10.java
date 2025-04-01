package com.mycompany.exercicio10;
import javax.swing.JOptionPane;

public class Exercicio10 {

    public static void main(String[] args) {
        int numero1, numero2, adicao;
        numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
        
        adicao = numero1 + numero2;
        
        if(adicao > 10){
            JOptionPane.showMessageDialog(null,"A soma é: " + adicao);
        }  
    }
}
