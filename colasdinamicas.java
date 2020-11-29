package colasdinamicas;


public class ColaDinamica {
    Nodo raiz = null;
    Nodo cima = null;
    int tamaño = 0;
    
    public void Insertar(String palabra){
        Nodo nodo = new Nodo(palabra);
        
        if(raiz == null){
            raiz = nodo;
            cima = nodo;
        }else{
            cima.siguiente=nodo;
            cima=nodo;
        }
        tamaño ++;
    }
    public void Eliminar(){
       if(raiz ==  null){
           System.out.println("No existe ningun elemento");
       } else{
           raiz = raiz.siguiente;
           tamaño --;
           System.out.println("Dato eliminado");
       }
    }
    public void Mostrar(){
       Nodo recorrer = raiz;
       if(recorrer==null){
           System.out.println("No existe elemento");  
       }else{
           while(recorrer!=null){
               System.out.println(" "+recorrer.elemento);
               recorrer=recorrer.siguiente;
           }
       }
    }
    
}
