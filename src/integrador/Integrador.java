package integrador;

import java.util.ArrayList;
import java.util.Arrays;

public class Integrador {

    public static void main(String[] args) {
        
        Practica practica = new Practica();
        
        //System.out.println( (int) Math.log10(1000)+1); // Esto se puede borrar
        
        //Generar las variables necesarias para probar
        ArrayList<String> medias = new ArrayList(Arrays.asList(new String[]{"X","X","A","A","X","A","A","A","A","A","X","X","A","B","C","F","C","H"}));

        System.out.println(practica.mediasAmigas(medias));
        //System.out.println(practica.numeroCapicua(null)); // Se llamaba numeroPalindromo (Error)
        //System.out.println(practica.prisioneroDulce(1,1,2));
    }
}
