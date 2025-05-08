package org.example;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class RegistroUsuarioTest { //los mensajes deben concordar

    @Test
    void testExcepcionSiNombreEsVacio() {
        RegistroUsuario registro = new RegistroUsuario();

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            registro.registrar("", 25);
        });

        assertEquals("El nombre no puede estar vacío.", ex.getMessage());
    }

    @Test
    void testExcepcionSiEdadEsNegativa() {
        RegistroUsuario registro = new RegistroUsuario();

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () -> {
            registro.registrar("Carlos", -5);
        });

        assertEquals("La edad debe ser mayor que cero.", ex.getMessage());
    }
}