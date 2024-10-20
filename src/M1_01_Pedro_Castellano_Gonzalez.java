import java.util.Scanner;

public class M1_01_Pedro_Castellano_Gonzalez {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Pongo el porcentaje de la luna como una variable global ya que no se vera modificada como un double ya que para sacar el
		 * 17% de algo hay que multiplicarlo por 0,17, creo mas variables de tipo double para el peso de la tierra que lo pedire por
		 * teclado y para el resultado de la operacion final, ya simplemente es realizar la operacion e imprimir el resultado por
		 * pantalla.
		 * */
		
		Scanner teclado=new Scanner(System.in);
		
		double pesoTierra;
		final double PORCENTAJELUNA=0.17;
		double equivalenciaLuna;
		
		System.out.println("Inserte el peso a convertir: ");
		
		pesoTierra=teclado.nextDouble();
		 
		teclado.close();
		
		equivalenciaLuna=PORCENTAJELUNA*pesoTierra;
		
		System.out.println("Un peso de "+pesoTierra+" kilos en la Tierra equivalen a "+equivalenciaLuna+" kilos en la Luna");

	}

}
