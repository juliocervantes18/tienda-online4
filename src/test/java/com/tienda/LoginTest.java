package com.tienda;

import com.tienda.models.Usuario;
import com.tienda.services.LoginService;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {

    @Test
    void testAutenticacionCorrecta() {
        Usuario usuario = new Usuario("armida", "12345");
        LoginService login = new LoginService();
        assertTrue(login.autenticar(usuario));
    }

    @Test
    void testAutenticacionIncorrecta() {
        Usuario usuario = new Usuario("armida", "wrongpass");
        LoginService login = new LoginService();
        assertFalse(login.autenticar(usuario));
    }
}
