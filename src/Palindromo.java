import java.util.*;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner ent = new Scanner(System.in);
        
        
        System.out.println("Escriba una palabra");
        String palabra = ent.nextLine();

        
        String stAux = palabra.replaceAll("\\s+", "");

        String stReverse = new StringBuilder(stAux).reverse().toString();
        String stReverseAux = new StringBuilder(palabra).reverse().toString();

        System.out.println("Original: " + palabra);
        System.out.println("Invertido: " + stReverseAux);

        if (stAux.equals(stReverse))
            System.out.println("Es palíndromo :) ");
        else
            System.out.println("No es palíndromo :(");
        ent.close(); 
        
	}

}
