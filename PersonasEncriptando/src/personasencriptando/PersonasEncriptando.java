/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package personasencriptando;

import java.util.*;
public class PersonasEncriptando {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Persona persona1;
        Persona persona2;
        
        System.out.println("Dime el mensaje de ivan: ");
        persona1 = new Persona("Ivan", sc.next());
        
        System.out.println("Dime el mensaje de Pablo: ");
        persona2 = new Persona("Pablo", sc.next());
        
        System.out.println("Encriptando...");
        
        String mensaje1 = persona1.encriptarMensaje(3);
        String mensaje2 = persona2.encriptarMensaje(-2);
        
        System.out.println("Mensajes:");
        System.out.println(mensaje1);
        System.out.println(mensaje2);
        
    }

}
