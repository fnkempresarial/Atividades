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
public class AtividadeQuatro {
    	double insere;
	int numero;
	double soma;

	void ValidaNumero() {
		Scanner scan = new Scanner(System.in);
		do {

			System.out.println("Insira um numero Abaixo");
			insere = scan.nextDouble();
			if (insere >= 0) {
				soma = soma + insere;
				numero++;
			}
		} while (insere >= 0);
		scan.close();
		System.out.println("A média foi de " + (soma / numero) + " \nForam inseridos " + numero + " números");
	}

}
