/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;

/**
 *
 * @author Frank
 */
public class AtividadeDois {
    int auxiliar = 1;
	int agora = 1;
	int trolha;
	void Executa_Atividadedois(){
for  (int i = 0; i <= 34; i++){
	if (i==0){
		System.out.println("Posição " + i + ": 0");
		//System.out.print(" - ");
	}else if (i < 2){
		System.out.println("Posição " + i +": 1");
		//System.out.print(" - ");
	}else {
		trolha = agora + auxiliar;
		auxiliar = agora;
		agora = trolha;
		System.out.println("Posição " + i + ": " + trolha);
		//System.out.print(" - ");
	}
}
}
}
