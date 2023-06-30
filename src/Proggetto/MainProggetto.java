package Proggetto;

import java.util.Scanner;

public class MainProggetto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("****** Puoi Registrare 5 elementi tra Audio, Video o Immagini ******");
		Multimedia[] arrayContenuti = new Multimedia[5];

		for (int i = 0; i <= 5; i++) {
			System.out.println("Inserisci il titolo dell'elemento");
			String titolo1 = input.nextLine();
			System.out.println("Definisci il tipo di contenuto multimediale");
			System.out.println("1 = Audio, 2 = Video, 3 = Immagine");
			int tipoContenuto = input.nextInt();
			input.nextLine();

			switch (tipoContenuto) {
			case 1:
				System.out.println("Inserisci durata traccia");
				int durata1 = input.nextInt();
				input.nextLine();
				System.out.println("Inserisci volume(da 1 a 10)");
				int volume1 = input.nextInt();
				input.nextLine();
				if (volume1 < 0 || volume1 > 10) {
					System.out.println("Attenzione il volume va da 0 a 10 deve reinserie i dati");
				} else {
					arrayContenuti[i] = new Audio(titolo1, durata1, volume1);
				}
				break;

			case 2:
				System.out.println("Inserisci durata Video");
				int durata2 = input.nextInt();
				input.nextLine();
				System.out.println("Inserisci volume Video(da 1 a 10)");
				int volume2 = input.nextInt();
				input.nextLine();
				if (volume2 < 0 || volume2 > 10) {
					System.out.println("Attenzione il volume va da 0 a 10 deve reinserie i dati");
				}
				System.out.println("Inserisci luminosità(da 1 a 10)");
				int luminosita1 = input.nextInt();
				input.nextLine();
				if (luminosita1 < 0 || luminosita1 > 10) {
					System.out.println("Attenzione la luminosita va da 0 a 10 deve reinserie i dati");
				} else {
					arrayContenuti[i] = new Video(titolo1, durata2, volume2, luminosita1);
				}
				break;

			case 3:
				System.out.println("Inserisci luminosità");
				int luminosita2 = input.nextInt();
				input.nextLine();
				if (luminosita2 < 0 || luminosita2 > 10) {
					System.out.println("Attenzione la luminosita va da 0 a 10 deve reinserie i dati");
				} else {
					arrayContenuti[i] = new Immagini(titolo1, luminosita2);
				}
				break;
			}

		}

//
//		System.out.println("Inserisci titolo traccia");
//		String traccia1 = input.nextLine();
//		System.out.println("Inserisci durata traccia");
//		int durata1 = input.nextInt();
//		Audio nuova = new Audio(traccia1, durata1);
//		input.nextLine();
//		nuova.alzaVolume();
//		nuova.play();
//
//		System.out.println("--------");
//		System.out.println("Inserisci titolo Video");
//		String video1 = input.nextLine();
//		System.out.println("Inserisci durata Video");
//		int durataVideo1 = input.nextInt();
//		Video videoNuovo = new Video(video1, durataVideo1);
//		videoNuovo.alzaVolume();
//		videoNuovo.aumentaLuminosita();
//		videoNuovo.play();
//		input.close();
	}

}
