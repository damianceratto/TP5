
import java.util.Scanner;

/* @author Damian
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
/*a) Método sumarLista que reciba por parámetro un arreglo unidimensional de enteros y muestre por pantalla la suma y promedio de los mismos.
b) Método buscarMayor que reciba por parámetro un arreglo bidimensional e irregular de enteros y retorne el entero más grande que se encuentra
 en el arreglo.
c) Método cuentaVocales, que reciba por parámetro un String y retorne la cantidad de vocales que tiene la cadena.
d) Método cuentaCaracter que reciba por parámetro un String y un caracter, luego retorne la cantidad de veces que se repite en la cadena el
carácter recibido.*/
        
        
        Integer numerosUnidi[]={23,5,6,99,12,34};
        Integer numerosBidi[][]= {{48,19,30,22,-43,99},{18,33,-6,100}};
        String vocalesUno="cantidad", vocalesDos="bidimensional";
        char letraUno='n', letraDos='i';
        Scanner entrada = new Scanner(System.in);
        
        Arreglos.sumarLista(numerosUnidi);
        Arreglos.buscarMayor(numerosBidi);
        Arreglos.cuentaVocales(vocalesDos);
        Arreglos.cuentaVocales(vocalesUno);
        Arreglos.cuentaCaracter(vocalesUno, letraDos);
        Arreglos.cuentaCaracter(vocalesDos, letraUno);
        System.out.println("Ingrese una frase: ");
        vocalesUno= entrada.nextLine();
        Arreglos.cuentaCaracter(vocalesUno, letraDos);
        Arreglos.cuentaVocales(vocalesUno);

    }   
}
