/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Damian
 */
public class Arreglos {
    
    //a) Método sumarLista que reciba por parámetro un arreglo unidimensional de enteros y muestre por pantalla la suma y promedio de los mismos.
    
    public static void sumarLista(ArrayList<Integer> list){
        
        
        
    }
    
    
    
    public static void m1(){
    int algo[]={22,45,67,90};

    for(int i=0;i<4;i++){
if(algo[i]%2==0){
System.out.println(algo[i]);
}
    }
    //for(String palabra:algo)
    //System.out.println(palabra)
}
    public static void m2(){
        int matriz[][] = {{12,15,16,21},{24,27,30,33},{36,39,42,45}};
       /* for(int f=0;f<3;f++){
for(int y=0;y<4;y++){
System.out.println(matriz[f][y]);*/

        
            
        for(int f = 0; f < matriz.length;f++){
            for(int j = 0; j < 4;j++){
                System.out.print(matriz[f][j]+" ");
            }
            System.out.println();
        }
        
        for(int[] a:matriz){
            for( int b:a){
                System.out.println(b+" ");
            }
            System.out.println();
        }
    
        
    }
    public static void m3(){
        
        int matriz[][] = {{48,75,5},{25,3,-1},{49,7,6}};
        
        for(int f = 0; f < matriz.length;f++){
            for(int j = 0; j < 4;j++){
                if(f==j){
                    System.out.print(matriz[f][j]+" ");
            }
            }
            System.out.print("");
        }
        
        
    }
    public static void m4(){
        int matriz[][]={{12,33,44},{45,3},{3}};
    
    
    
    
}
    /*public void m6(int lista[][]){
        int[] auxLista = lista[lista.length - 1 ];
        
        for(int f:auxLista){
            if(f%2 != 0){
                System.out.println(f);
            }
        }
    }
*/
    
    
    public static void m5(String x[][]){//muestra la cantidad de caracteres de la primera línea de la matriz
    String matriz[][]=x;
    
    for(String a:matriz[0]){
            //for( String b:a){
                System.out.println(a.length());
           // }
           // System.out.println();
        }
        
    
    }



        
        
   
}/*
b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e irregular de enteros y retorne el entero más grande que se encuentra
en el arreglo.
c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad de vocales que tiene la cadena.
d) Método cuentaCaracter que reciba por parámetro un String y un caracter, luego retorne la cantidad de veces que se repite en la cadena el
carácter recibido.*/