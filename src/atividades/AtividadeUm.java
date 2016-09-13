/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;


import javax.swing.JOptionPane;

/**
 *
 * @author Frank
 */
public class AtividadeUm {
  

    void Executa_Atividadeum() {

       int idade = Integer.parseInt(JOptionPane.showInputDialog("Insira a sua idade"));
       
        if (idade < 16) {
            JOptionPane.showMessageDialog(null,"Você não tem idade para votar","Reposta",2);
        }
        if (idade == 16 || idade == 17 || idade >= 65) {
            JOptionPane.showMessageDialog(null,"Voto Facultativo","Reposta",2);
        }
        if (idade >= 18 && idade < 65) {
            JOptionPane.showMessageDialog(null,"Você Obrigatorio","Reposta",1);
        }
    }
}
