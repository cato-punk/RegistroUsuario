package org.example;
public class Aplicacion {

    public static void main(String[] args) {
        ejecutarRegistroDeUsuarios();
    }

    private static void ejecutarRegistroDeUsuarios() {
        RegistroUsuario registro = new RegistroUsuario();

        try {
            registro.registrar("Ana", 25); // caso válido
            registro.registrar("", 30);    // error: nombre vacío
        } catch (IllegalArgumentException e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
        }
    }
}