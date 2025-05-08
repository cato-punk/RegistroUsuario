package org.example;
public class RegistroUsuario {

    public void registrar(String nombre, int edad) throws IllegalArgumentException {
        validarNombre(nombre);
        validarEdad(edad);
        System.out.println("  Usuario registrado: " + nombre + ", " + edad + " años...");
    }

    // Validación de nombre: no debe ser nulo ni vacío
    private void validarNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
    }

    // Validación de edad: debe ser un número positivo
    private void validarEdad(int edad) {
        if (edad <= 0) {
            throw new IllegalArgumentException("La edad debe ser mayor que cero.");
        }
    }
}