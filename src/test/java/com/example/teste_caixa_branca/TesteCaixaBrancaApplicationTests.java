package com.example.teste_caixa_branca;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

@SpringBootTest
class TesteCaixaBrancaApplicationTests {

	private final TesteCaixaBrancaApplication app = new TesteCaixaBrancaApplication();

	@Test
	void contextLoads() {
	}

	@Test
	void testOrdena() {
		int[] array = {5, 3, 8, 4, 2};
		app.ordena(array, array.length);
		assertArrayEquals(new int[]{2, 3, 4, 5, 8}, array);
	}

	@Test
	void testOrdenaEmptyArray() {
		int[] array = {};
		app.ordena(array, array.length);
		assertArrayEquals(new int[]{}, array);
	}

	@Test
	void testOrdenaSingleElement() {
		int[] array = {1};
		app.ordena(array, array.length);
		assertArrayEquals(new int[]{1}, array);
	}

	@Test
	void testOrdenaAlreadySorted() {
		int[] array = {1, 2, 3, 4, 5};
		app.ordena(array, array.length);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
	}

	@Test
	void testOrdenaWithDuplicates() {
		int[] array = {3, 1, 2, 3, 1};
		app.ordena(array, array.length);
		assertArrayEquals(new int[]{1, 1, 2, 3, 3}, array);
	}



	@Test
	void testInsercao() {
		int[] array = {5, 3, 8, 4, 2};
		app.insercao(array, array.length);
		assertArrayEquals(new int[]{2, 3, 4, 5, 8}, array);
	}

	@Test
	void testInsercaoEmptyArray() {
		int[] array = {};
		app.insercao(array, array.length);
		assertArrayEquals(new int[]{}, array);
	}

	@Test
	void testInsercaoSingleElement() {
		int[] array = {1};
		app.insercao(array, array.length);
		assertArrayEquals(new int[]{1}, array);
	}

	@Test
	void testInsercaoAlreadySorted() {
		int[] array = {1, 2, 3, 4, 5};
		app.insercao(array, array.length);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
	}

	@Test
	void testInsercaoWithDuplicates() {
		int[] array = {3, 1, 2, 3, 1};
		app.insercao(array, array.length);
		assertArrayEquals(new int[]{1, 1, 2, 3, 3}, array);
	}

	@Test
	void testQuicksort() {
		int[] array = {5, 3, 8, 4, 2};
		app.quicksort(array, 0, array.length - 1);
		assertArrayEquals(new int[]{2, 3, 4, 5, 8}, array);
	}

	@Test
	void testQuicksortEmptyArray() {
		int[] array = {};
		app.quicksort(array, 0, array.length - 1);
		assertArrayEquals(new int[]{}, array);
	}

	@Test
	void testQuicksortSingleElement() {
		int[] array = {1};
		app.quicksort(array, 0, array.length - 1);
		assertArrayEquals(new int[]{1}, array);
	}

	@Test
	void testQuicksortAlreadySorted() {
		int[] array = {1, 2, 3, 4, 5};
		app.quicksort(array, 0, array.length - 1);
		assertArrayEquals(new int[]{1, 2, 3, 4, 5}, array);
	}

	@Test
	void testQuicksortWithDuplicates() {
		int[] array = {3, 1, 2, 3, 1};
		app.quicksort(array, 0, array.length - 1);
		assertArrayEquals(new int[]{1, 1, 2, 3, 3}, array);
	}

}
