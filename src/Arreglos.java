
import java.util.ArrayList;

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
    
    public static void sumarLista(Integer[] list){
        int sumatoria=0;
        float promedio=0;
        for(int i=0;i<list.length;i++){
        sumatoria += list[i];
    }
        promedio = sumatoria/list.length;
        System.out.println("La suma de los enteros es: "+ sumatoria + " y el promedio es: "+promedio);
    }
    
    //b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
    
    public static void buscarMayor(Integer[][] matrix){
        int aux=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[i].length;j++){
                if(matrix[i][j]>aux){
                    aux=matrix[i][j];
                }
                    }
                         }
        
        System.out.println("El enteros más grande es: "+ aux);
    }
    //c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad de vocales que tiene la cadena.
    
    public static void cuentaVocales(String vocales){
    int voc = 0;
    for(int x = 0;x < vocales.length(); x++){
        if (vocales.charAt(x) == 'a' || vocales.charAt(x) == 'e' || vocales.charAt(x) == 'i' || vocales.charAt(x) =='o' || vocales.charAt(x) == 'u' || vocales.charAt(x) == 'A' || vocales.charAt(x) == 'E' || vocales.charAt(x) == 'I' || vocales.charAt(x) =='O' || vocales.charAt(x) == 'U' || vocales.charAt(x) == 'á' || vocales.charAt(x) == 'é' || vocales.charAt(x) == 'í' || vocales.charAt(x) =='ó' || vocales.charAt(x) == 'ú' || vocales.charAt(x) == 'Á' || vocales.charAt(x) == 'É' || vocales.charAt(x) == 'Í' || vocales.charAt(x) =='Ó' || vocales.charAt(x) == 'Ú'){
            voc = voc+1;
        }
    }
        System.out.println("La cantidad de vocales son: "+voc);
    }
       
/*d) Método cuentaCaracter que reciba por parámetro un String y un caracter, luego retorne la cantidad de veces que se repite en la cadena el
carácter recibido.*/
    
    public static void cuentaCaracter(String palabra, char letra){
    int cont = 0;
    for(int x = 0;x < palabra.length(); x++){
        if (palabra.charAt(x) == letra){
            cont = cont+1;
        }
    }
        if(cont>0){
                System.out.println("Se encontraron "+cont+ " caracteres iguales en la palabra.");
        }else{
            System.out.println("El caracter ingresado no exciste en la palabra.");
        }
    }
       
}