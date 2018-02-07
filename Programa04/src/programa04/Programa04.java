/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa04;

import java.util.Scanner;

/**
 *
 * @author Arturo
 */
public class Programa04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int edad, x=1;
        Scanner entrada = new Scanner(System.in);
        while(x==1){
        System.out.println("Ingresa tu edad: ");
        edad = entrada.nextInt();
        if (edad >= 0 && edad <= 5) {
            System.out.println("¡¡ESTAS NENE!!");
        }
        else if(edad>=6 && edad<=15){
            System.out.println("¡¡ESTAS CHAVO!!");
        }
        else if(edad>=16 && edad<=20){
            System.out.println("¡¡ESTAS MECO!!");
        }
        else if(edad>=21 && edad<=25){
            System.out.println("¡¡ESTAS JODIDO!!");
        }
        else if(edad>=26 && edad<=40){
            System.out.println("¡¡ESTAS CHAVORRUCO!!");
        }
        else if(edad>=41 && edad<=60){
            System.out.println("¡¡ESTAS CASI MUERTO!!");
        }
        else{
            System.out.println("¡¡ESTAS MUERTO!!");
        }
    }
    }

}
