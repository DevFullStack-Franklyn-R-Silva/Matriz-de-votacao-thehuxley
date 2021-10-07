package application;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int linha = sc.nextInt();
		int coluna = sc.nextInt();

		int[][] matriz = new int[coluna][linha];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		int cont = 0;
		int votos = 0;
		int princesa = 1;

		while (true) {
			for (int l = 0; l < matriz.length; l++) {
				for (int c = 0; c < matriz[l].length; c++) {

					if (c == cont) {
						if (matriz[l][c] == 1) {
							votos += matriz[l][c];
						}
					}
				}
			}

			System.out.println("Princesa " + princesa + ": " + votos + " voto(s)");
			votos = 0;
			cont += 1;
			princesa += 1;

			if (cont == linha) {
				break;
			}
		}
		sc.close();

	}

}
