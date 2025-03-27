/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package personasencriptando;

/**
 *
 * @author Iván
 */
public class Persona {

    
    //atributos
    private String nombre;
    private String mensaje;

    
    //constructor vacio y con los atributos
    
    public Persona() {
    }

    public Persona(String nombre, String mensaje) {

        this.nombre = nombre;
        this.mensaje = mensaje;

    }

    //getters y setters
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    //metodo que encripta el mensaje
    public String encriptarMensaje(int n) {

        String mensajeEncriptado = "";
        char myChar = ' ';
        int ascii = 0;

        for (int i = 0; i < mensaje.length(); i++) {

            ascii = (int) mensaje.charAt(i);

            ascii = arreglarASCII(ascii, n);
            
            ascii += n;

            myChar = (char) ascii;

            mensajeEncriptado += Character.toString(myChar);

        }

        return mensajeEncriptado;
    }

    // metodo que comprueba los limites del codigo ascii y si se pasa hace que vuelva al principio del abcdario
    public int arreglarASCII(int ascii, int n) { 
        //spaguetti code :v
        
        if (n == -2) {

            if (ascii == 97) {
                ascii = 121;
            } else if (ascii == 98) {
                ascii = 122;
            } else if (ascii == 65) {
                ascii = 89;
            } else if (ascii == 66) {
                ascii = 90;
            }

        } else if (n == 3) {

            if (ascii == 88) {
                ascii = 65;
            } else if (ascii == 89) {
                ascii = 66;
            } else if (ascii == 90) {
                ascii = 67;
            }

            if (ascii == 120) {
                ascii = 97;
            } else if (ascii == 121) {
                ascii = 98;
            } else if (ascii == 122) {
                ascii = 99;
            }

        }

        return ascii;
    }

}
