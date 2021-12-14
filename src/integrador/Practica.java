package integrador;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class Practica {


//    La función recibirá un numero x y deberá determinar si es capicúa o no.
//    Este deberá devolver verdadero(true) si es capicúa y falso(false) si no lo es.
//    Además deberemos contemplar los siguientes escenarios:
//    Contemplar que el numero que llega puede ser negativo.
//    Contemplar que el numero que llega puede ser de un digito, si es así debe devolver true.
//    Contemplar que el numero que llega puede ser null, si es así debe devolver false.
//    @param num
//    @return esPalindromo -> Hay que retornar esto

    
   public Boolean numeroCapicua(Integer num) { // No hay que tocar esto, se copia lo de adentro al formulario. Devuelve un boolean
       int resto;
       boolean esPalindromo = false;
       if(num == null){
           return esPalindromo;
       }
       num = Math.abs(num);
       int num2 = num;
       String invertido = "";
       if(num > 9){
           int longitud = num.toString().length();
           for(int i = 0; i < longitud; i++){
               resto = num2 % 10;
               num2 = num2/10;
               invertido = invertido + resto;
           }
           if(invertido.equals(num.toString())){
               esPalindromo = true;
           }
           else{
               esPalindromo = false;
           }
       }
       else if (num < 9){
           esPalindromo = true;
       }
       return esPalindromo;
    }


//    Estamos en caramelolandia, donde estan los peores ladrones de dulces.
//    Una vez al mes, se sienta una n cantidad de presos en ronda, contemplando
//    al preso que inicia la ronda, como el preso 0.
//    A los presos se les da una m cantidad de caramelos, estos caramelos se repartirán de uno en uno a cada preso,
//    contemplando que se comenzaran a repartir los caramelos desde el primer preso (inicio).
//    Se repartirán los caramelos hasta que no queden más y el ultimo caramelo en repartirse estará podrido,
//    determinar a que preso, según su posición en la ronda le tocara el caramelo podrido.
//     @param inicio
//     @param cantidadCaramelos
//     @param cantidadLadrones
//     @return ladronQueLeTocoElCarameloPodrido

    public int prisioneroDulce(int inicio, int cantidadCaramelos, int cantidadLadrones) {
        int posicion = inicio;
        cantidadCaramelos = cantidadCaramelos - 1;
        while(cantidadCaramelos > 0){
            if(posicion < cantidadLadrones - 1){
            posicion = posicion + 1;
            }
            else{
                posicion = 0;
            }
                        cantidadCaramelos = cantidadCaramelos - 1;
        }
        int ladronQueLeTocoElCarameloPodrido = posicion;
        return ladronQueLeTocoElCarameloPodrido;
    }

//    En un universo paralelo, donde los habitantes son medias, existe un crucero de medias donde se sube una lista de medias.
//    Esta lista de tripulantes del crucero es una Collection de letras.
//    Lo que se deberá hacer, es filtrar la lista de medias que se suben al crucero y
//    retornar una lista que contenga los grupos de medias que si tenían pares.
//    Esta lista final de medias pares se mostraran ordenadas de menor a mayor.
//    A continuación un ejemplo:
//    List de medias que llegan : A,B,A,B,C,A,F,Z,C,H. A,B y C tiene pares, mientras que F,Z y H no.
//    Entonces la List que se debería retornar sería: A,B,C.
//   @param pasajeros
//   @return mediasAmigas

    public List<String> mediasAmigas(List<String> pasajeros) {
        Map<String, Integer> hashAux = new HashMap<>();
        for (String aux : pasajeros) {
            Integer n = Collections.frequency(pasajeros, aux) / 2;
            hashAux.put(aux, n);
        }
        List<String> mediasAmigas = new ArrayList<>();
        List<String> arrayAux = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : hashAux.entrySet()) {
            arrayAux = Collections.nCopies(entry.getValue(), entry.getKey());
            for (String aux : arrayAux) {
                mediasAmigas.add(aux);
            }

        }
        Collections.sort(mediasAmigas);
        return mediasAmigas;



        /*Set<String> setDuplicados = new TreeSet<>();
        Set<String> setAux = new TreeSet<>();
        for (String aux : pasajeros){
            if(!setAux.add(aux)){
                setDuplicados.add(aux);
            }
        }
                    List<String> mediasAmigas = new ArrayList<>();
                    for (String aux : setDuplicados){
                        mediasAmigas.add(aux);
                    }
        Collections.sort(mediasAmigas);
        return mediasAmigas;
    }*/
    }
}
