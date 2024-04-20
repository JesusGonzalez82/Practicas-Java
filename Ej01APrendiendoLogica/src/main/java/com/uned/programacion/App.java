package com.uned.programacion;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);

		System.out.println("Revistas disponibles:");

		for (int i = 0; i < Compra.revistas.size(); i++) {
			System.out.println((i + 1) + ". " + Compra.revistas.get(i).toString());
		}
		System.out.println("-----------------------------");
		System.out.println("Que revista desea?? Introduzca un numero para elegirla");
		int rev = t.nextInt();

		if (rev < 1 || rev > Compra.revistas.size()) {
			System.out.println("Numero erroneo, introduzca un numero correcto");
			return;
		}

		Revista revistaElegida = Compra.revistas.get(rev - 1);

		if (revistaElegida.getCantDisp() > 0) {
			System.out.println("Ha elegida la revista " + revistaElegida.getNombre());
			System.out.println("que tiene un precio de " + revistaElegida.getPrecio() + "€");
			System.out.println("Desea comprar otra revista? (s/n)");
			char respuesta = t.next().toLowerCase().charAt(0);

			if (respuesta == 's') {
				revistaElegida.getCantDisp();
				System.out.println("Compra realizada con exito");
			} else {
				System.out.println("Compra cancelada");
			}

		} else {
			System.out.println("Lo sentimos, la revista seleccionada no está disponible");
		}
		t.close();
		System.out.println("-------------------");
		System.out.println("Programa finalizado");
	}
}
