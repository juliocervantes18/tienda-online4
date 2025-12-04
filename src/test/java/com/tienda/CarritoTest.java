package com.tienda;

import com.tienda.models.Carrito;  // asegúrate de que la ruta sea exacta
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarritoTest {

    @Test
    void testAgregarProducto() {
        Carrito carrito = new Carrito();
        carrito.agregarProducto("Producto1");
        assertEquals(1, carrito.totalProductos());
    }
}
