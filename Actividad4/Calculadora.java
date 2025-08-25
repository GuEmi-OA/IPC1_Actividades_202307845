package calculadora;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class Calculadora {
 
    public static void main(String[] args) {
        
     while (true){  
        Scanner leer_texto = new Scanner(System.in);
        
        Map<String, Integer> mapa = new HashMap<>();
            mapa.put("uno", 1);
            mapa.put("dos", 2);
            mapa.put("tres", 3);
            mapa.put("cuatro", 4);
            mapa.put("cinco", 5);
            mapa.put("seis", 6);
            mapa.put("siete", 7);
            mapa.put("ocho", 8);
            mapa.put("nueve", 9);
            mapa.put("diez", 10);
            
        
        
        System.out.println("Calculadora");
        System.out.println("Escribe un número A");
        String numero_A = leer_texto.nextLine().toLowerCase();
        int eleccion_A = mapa.get(numero_A);
        
        System.out.println("Escribe un número B");
        String numero_B = leer_texto.nextLine().toLowerCase();
        int eleccion_B = mapa.get(numero_B);
        
        
       
        
     while (true){
        System.out.println("--- Elige una acción---");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Potencia ");
        System.out.println("6. Raíz");
        System.out.println("7. Salir");
        
        int opcion = leer_texto.nextInt();
        
        if (opcion == 1) {
            double Mostrar_resultado = eleccion_A + eleccion_B;
            System.out.println("--------------------------------");
            System.out.println("El resultado es:" + Mostrar_resultado);
            System.out.println("--------------------------------");
            continue;
        } 
        else if (opcion == 2){
            double Mostrar_resultado = eleccion_A - eleccion_B;
            System.out.println("--------------------------------");
            System.out.println("El resultado es:" + Mostrar_resultado);
            System.out.println("--------------------------------");
            continue;
        }
        else if (opcion == 3){
            double Mostrar_resultado = eleccion_A * eleccion_B;
            System.out.println("--------------------------------");
            System.out.println("El resultado es:" + Mostrar_resultado);
            System.out.println("--------------------------------");
            continue;
        }
        else if (opcion == 4){
            double Mostrar_resultado = eleccion_A / eleccion_B;
            System.out.println("--------------------------------");
            System.out.println("El resultado es:" + Mostrar_resultado);
            System.out.println("--------------------------------");
            continue;
        }
        else if (opcion == 5){
            double Mostrar_resultado = Math.pow(eleccion_A,  eleccion_B);
            System.out.println("--------------------------------");
            System.out.println("El resultado es:" + Mostrar_resultado);
            System.out.println("--------------------------------");
            continue;
        }
        else if (opcion == 6){
            double Mostrar_resultado = Math.pow(eleccion_A, 1.0 / eleccion_B);
            System.out.println("--------------------------------");
            System.out.println("El resultado es:" + Mostrar_resultado);
            System.out.println("--------------------------------");
            continue;
        }
        else if (opcion == 7){
           
            
            while (true){
                System.out.println("¿Desea elegir otros números? ");
                System.out.println("--------------------------------");
                System.out.println("1. si, continuar");
                System.out.println("2. no, salir");
                
                int opcion_saldia = leer_texto.nextInt();
                
                if(opcion_saldia == 1){
                    break;
                }
                else if (opcion_saldia == 2){
                System.out.println("Cerrando programa...");
                System.exit(0);
                }
                else {
                    System.out.println("--------------------------------");
                    System.out.println("La opción marcada no existe" );
                    System.out.println("--------------------------------");
                    
                }
            
            }
            break;
        }
        else {
             System.out.println("--------------------------------");
             System.out.println("La opción marcada no existe" );
             System.out.println("--------------------------------");
            continue;
                }
        
        
     }
     }
        
        
    }
    
}
