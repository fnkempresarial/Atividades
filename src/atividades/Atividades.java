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
       	int opcao = Integer.parseInt(
				JOptionPane.showInputDialog("Favor escolhar umas das atividades \n" + "Para Atividade Um -> 1 \n"
						+ "Para Atividade Um -> 2 \n" + "Para Atividade Um -> 3 \n" + "Para Atividade Um -> 4 \n"));
		switch (opcao) {
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
		default:
			JOptionPane.showMessageDialog(null, "Número Invalido", "Número Invalido", 1 ); 
		}

    }
    
}
