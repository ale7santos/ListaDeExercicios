package br.com.voeairlines.treinamentopoo19;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		  Float lado, area, perimetro, diagonal;  
		  
	        lado = Float.parseFloat(JOptionPane.showInputDialog("Digite o valor do lado do quadrado: ")); 
	  
	        area = (float) Math.pow(lado,2);  
	        perimetro = (2 * lado) + (2 * lado);  
	        diagonal = (float) ((float) lado * Math.sqrt(2));
	  
	        System.out.println("Lado: " + lado);  
	        System.out.println("Área: " + area);  
	        System.out.println("Perímetro:" + perimetro);  
	        System.out.println("Diagonal: " + diagonal );

	}

}
