package com.ucb.FramkyService;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ConverterServiceTests {

	private ConverterService converterService;
	private ConfigParam configParam;

	@BeforeEach
	void setUp() {
		// Usamos un mock para ConfigParam
		configParam = Mockito.mock(ConfigParam.class);
		converterService = new ConverterService(configParam);
	}

	@Test
	void testCalculocelciusToFahrenheit() {
		// Prueba con valores conocidos
		double celsius = 0.0;
		double expectedFahrenheit = 32.0;

		double result = converterService.calculocelciusToFahrenheit(celsius);

		assertEquals(expectedFahrenheit, result, "0°C debería ser 32°F");
	}

	@Test
	void testCalculofarenheitToCelsius() {
		// Prueba con valores conocidos
		double fahrenheit = 32.0;
		double expectedCelsius = 0.0;

		double result = converterService.calculofarenheitToCelsius(fahrenheit);

		assertEquals(expectedCelsius, result, "32°F debería ser 0°C");
	}

	@Test
	void testCalculateDollarConversion() {
		// Configurar el mock de ConfigParam para devolver un valor fijo
		Mockito.when(configParam.getOficialDollar()).thenReturn(6.96);

		double bolivianAmount = 100.0;
		double expectedDollar = 696.0;  // 100 * 6.96

		double result = converterService.calculateDollarConversion(bolivianAmount);

		assertEquals(expectedDollar, result, "La conversión de bolivianos a dólares no es correcta");
	}
}
