/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;

import javax.swing.JOptionPane;

/**
 *
 * @author OI305989
 */
public class Atividades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Atividades roda = new Atividades();
        
        roda.Execucao();
       
    }

    public void Execucao() {
        try{
        int opcao = Integer.parseInt(
                JOptionPane.showInputDialog("Favor escolhar umas das atividades \n" 
                        + "Para Atividade Um -> 1 \n"
                        + "Para Atividade Dois -> 2 \n"
                        + "Para Atividade Tres -> 3 \n"
                        + "Para Atividade Quatro -> 4 \n"
                        + " Para Sair Digite -> 0"));
        
        switch (opcao) {
            case 0:
                System.out.printf("Programa ENCERRADO");
                break;
            case 1:
                AtividadeUm exec1 = new AtividadeUm();
                exec1.Executa_Atividadeum();
                break;
            case 2:
                AtividadeDois exec2 = new AtividadeDois();
                exec2.Executa_Atividadedois();
                break;
            case 3:
                AtividadeTres exec3 = new AtividadeTres();
                exec3.Executa_Atividadetres();
                break;
            case 4:
                AtividadeQuatro exec4 = new AtividadeQuatro();
                exec4.ValidaNumero();
                break;
            default:
                JOptionPane.showMessageDialog(null, "002 - Número Invalido", "Inserção Equivocada", 1);
                Execucao();
        }
        }catch(NumberFormatException e){
                 JOptionPane.showMessageDialog(null, "001 - Digito Não Numerico", "Invalida", 1);
                 Execucao();
                }
    }
}
