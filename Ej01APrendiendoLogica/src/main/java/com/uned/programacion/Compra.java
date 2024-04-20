package com.uned.programacion;

import java.util.ArrayList;
import java.util.List;

public class Compra {

	public static List<Revista> revistas = new ArrayList<>();
	
	static {
		revistas.add(new Revista("Hola", 15.0, 10));
		revistas.add(new Revista("Semana", 10.0, 5));
		revistas.add(new Revista("SuperPop", 8.5, 0));
	}
	
	
}
