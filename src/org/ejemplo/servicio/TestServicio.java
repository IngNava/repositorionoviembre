package org.ejemplo.servicio;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
/*TODOS LOS METODOS DEBEN LLEVAR LA ANOTACION @Test
 *TODOS LOS METODOS DEBEN COMENZAR CON LA PALABRA  TEST
 *
 * 
 * 
 * 
 */
class TestServicio {

	ServicioEmpleado servicioEmpleado = null;
	
	@Test
	void test() {
		servicioEmpleado = new ServicioEmpleado();
	}
	public void testSalarioBono() {
		test();
		assertTrue(servicioEmpleado.salarioBono(10000.0, 5000.0)==15000.0);
	}
	public void testSalarioPrestamo() {
		test();
		assertEquals(servicioEmpleado.salarioPrestamo(10000.0, 5000.0),5000.0);
	}
}
