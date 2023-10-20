package main;
public class App {

    public static int encontre(int[] arrayOrdenado, int num){
        
        for(int i = 0; i<arrayOrdenado.length; i++){
            if(arrayOrdenado[i] == num){
                return 1;
            }    
        }

        return 0;
    }
    
    public static int maior(int[] arrayDesordenado){
        
        int numero = arrayDesordenado[0];
        
        for(int i = 0; i<arrayDesordenado.length; i++){
            if(arrayDesordenado[i] > numero ){
                numero = arrayDesordenado[i];
            }    
        }
    
        return numero;
    }

    public static Double parMaisProximo(Integer[][] pares){ 

        Double menorDistancia = Double.MAX_VALUE;  

        for(int i = 0; i < pares.length - 1; i++){
            for(int j = i+1; j < pares.length; j++){
                Double eixo_x = (Double) Math.pow(pares[i][0] - pares[j][0], 2);
                Double eixo_y = (Double) Math.pow(pares[i][1] - pares[j][1], 2);
                Double distancia = (Double) Math.sqrt(eixo_x + eixo_y);
                
                if(distancia < menorDistancia){
                    menorDistancia = distancia;   
                }
            
            } 
        }

        return menorDistancia; 
    }
}
