package com.example.teste_caixa_branca;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TesteCaixaBrancaApplication {

	public static void main(String[] args) {
		SpringApplication.run(TesteCaixaBrancaApplication.class, args);
	}

	public void ordena(int[] vet, int pos) {
		int i = 0;
		while (i < pos - 1){
			int j = 0;
			while (j < pos - 1){
				if (vet[j] > vet[j + 1]){
					int aux = vet[j];
					vet[j] = vet[j + 1];
					vet[j + 1] = aux;
				}
				j++;
			}
			i++;
		}
	}

	public void insercao(int[] a, int size) {
		int i, j, aux;
		for (i = 1; i < size; i++) {
			aux = a[i];
			j = i - 1;
			while (j >= 0 && a[j] >= aux) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = aux;
		}
	}

	public void quicksort(int[] a, int lo0, int hi0) {
		int lo = lo0;
		int hi = hi0;
		int mid;

		if (hi0 > lo0) {
			mid = a[(lo0 + hi0) / 2];
			while (lo <= hi) {
				while ((lo < hi0) && (a[lo] < mid)) {
					++lo;
				}
				while ((hi > lo0) && (a[hi] > mid)) {
					--hi;
				}
				if (lo <= hi) {
					int t = a[lo];
					a[lo] = a[hi];
					a[hi] = t;
					++lo;
					--hi;
				}
			}
			if (lo0 < hi) {
				quicksort(a, lo0, hi);
			}
			if (lo < hi0) {
				quicksort(a, lo, hi0);
			}
		}
	}
}
