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
public class AtividadeTres {
    double nota[] = new double[10];
	double media;
	int maior, menor, x;
	Scanner scan = new Scanner(System.in);

	void Executa_Atividadetres() {
		for (int i = 0; i < nota.length; i++) {
			x++;
			System.out.println("Insira a "+x+"ª nota");
			nota[i] = scan.nextDouble();
			media = (media + nota[i]);
		}
		
		System.out.println("A média total é: " + media / 10);
		
	   for ( int i = 0; i < nota.length; i ++){
		   if (nota[i] > (media / 10))
			   maior++;
		   else
			   menor++;
	   }
	   System.out.println("A quantidade de notas maior é: " + maior);
	   System.out.println("A quantidade de notas menor é: " + menor);
	}
}
