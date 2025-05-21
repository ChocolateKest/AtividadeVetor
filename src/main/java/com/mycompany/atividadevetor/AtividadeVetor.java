/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atividadevetor;

/**
 *
 * @author gusta
 */
import javax.swing.JOptionPane;
public class AtividadeVetor {

    public static void main(String[] args) {
        int qntd = 3;
        int vet[ ] = new int[20];
        for(int i=0; i<3; i++){
            vet[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 3 numeros"));
        }
        int soma = 0;
                for(int i = 0; i<3; i++){
                 soma+= vet[i];   
                }
                double media = soma/qntd;
              System.out.println("a soma: " + soma);
              System.out.println("a soma: " + media);
    }
}