/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividades;

import java.util.Scanner;

/**
 *
 * @author Frank
 */
public class AtividadeUm {
    	Scanner	scan = new Scanner(System.in);
	void Executa_Atividadeum (){
	
	System.out.println("Insira a sua idade");
	int idade = scan.nextInt();
	if (idade < 16)
		System.out.println("Você não tem idade para votar");
	if (idade == 16 || idade == 17 || idade >= 65)
		System.out.println("Voto Facultativo");
	if (idade >=18 && idade < 65)
		System.out.println("Você Obrigatorio");
}
}
