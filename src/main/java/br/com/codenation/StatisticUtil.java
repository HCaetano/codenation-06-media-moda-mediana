package br.com.codenation;

import java.util.Arrays;

public class StatisticUtil {

	public static int average(int[] elements) {
		int soma = 0;

		for (int numero : elements) {
			soma += numero;
		}

		return soma / elements.length;
	}

	public static int mode(int[] elements) {
		int maximoOcorrencias = 0;
		int numeroOcorenciasTemp = 0;
		int moda = 0;
		int numeroSendoIterado;

		for (int numeroExterior : elements) {
			numeroSendoIterado = numeroExterior;

			for (int numeroInterior : elements) {
				if(numeroSendoIterado == numeroInterior) {
					numeroOcorenciasTemp++;
				}
			}

			if(numeroOcorenciasTemp > maximoOcorrencias) {
				maximoOcorrencias = numeroOcorenciasTemp;
				moda = numeroSendoIterado;
			}

			numeroOcorenciasTemp = 0;
		}

		return moda;
	}

	public static int median(int[] elements) {
		Arrays.sort(elements);

		if(elements.length % 2 == 0) {
			return (elements[elements.length / 2 - 1] + elements[elements.length / 2]) / 2;
		} else {
			return elements[elements.length / 2];
		}
	}
}