package colasdinamicas;

import java.util.Scanner;


public class ColasDinamicas {

   
    public static void main(String[] args) {
        boolean continuar = true;
        int opc;
        String palabra;
        
        ColaDinamica cola = new ColaDinamica();
        Scanner leer = new Scanner(System.in);
        
        while(continuar){
            System.out.println("Menu");
            System.out.println("1. Insertar");
            System.out.println("2. Eliminar");
            System.out.println("3. Mostrar");
            System.out.println("4. Salir");
            
            opc = leer.nextInt();
            
            switch(opc){
                case 1:
                    System.out.println("Insertar palabra");
                    palabra = leer.next();
                    cola.Insertar(palabra);
                    break;
                case 2: 
                    cola.Eliminar();
                    break;
                case 3:
                    cola.Mostrar();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            
        }
    }
    
}
