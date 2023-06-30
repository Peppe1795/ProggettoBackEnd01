package Proggetto;

import java.util.Scanner;

public class MainProggetto {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("****** Puoi Registrare 5 elementi tra Audio, Video o Immagini ******");
		Multimedia[] arrayContenuti = new Multimedia[5];

		for (int i = 0; i < arrayContenuti.length; i++) {
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

			default:
				System.out.println("Attenzione numero riferito al tipo non valido");

			}

		}

		stampaLista(arrayContenuti);

		int seleziona = -1;
		while (seleziona != 0) {
			System.out
					.print("Seleziona quale elemento della lista vuoi eseguire (1-5) oppure inserisci 0 per uscire: ");
			seleziona = input.nextInt();
			input.nextLine();

			if (seleziona >= 1 && seleziona <= 5) {
				Multimedia listItem = arrayContenuti[seleziona - 1];

				switch (listItem.getClass().getSimpleName()) {
				case "Audio":
					Audio tracciaAudio = (Audio) listItem;
					System.out.println("per regolare il volume digita 1 per alzarlo oppure 2 per abbasarlo");
					int regola = input.nextInt();
					;
					if (regola == 1) {
						tracciaAudio.alzaVolume();
					} else if (regola == 2) {
						tracciaAudio.abbassaVolume();
					}
					tracciaAudio.play();
					break;

				case "Video":
					Video contenutoVideo = (Video) listItem;
					System.out.println("per regolare il volume digita 1 per alzarlo oppure 2 per abbasarlo");
					int regola1 = input.nextInt();
					if (regola1 == 1) {
						contenutoVideo.alzaVolume();
					} else if (regola1 == 2) {
						contenutoVideo.abbassaVolume();
					}
					System.out.println("per regolare la luminosità digita 1 per alzarla oppure 2 per abbasarla");
					int regola4 = input.nextInt();
					input.nextLine();
					if (regola4 == 1) {
						contenutoVideo.aumentaLuminosita();
						;
					} else if (regola4 == 2) {
						contenutoVideo.abbassaLuminosita();
						;
					}
					contenutoVideo.play();
					break;

				case "Immagini":
					Immagini immagine = (Immagini) listItem;
					System.out.println("per regolare la luminosità digita 1 per alzarla oppure 2 per abbasarla");
					int regola2 = input.nextInt();
					if (regola2 == 1) {
						immagine.aumentaLuminosita();
						;
					} else if (regola2 == 2) {
						immagine.abbassaLuminosita();
						;
					}
					immagine.show();

				default:
					System.out.println("Tipo non identidicato");
				}
			}
		}
		System.out.println("Sei uscito correttamente dal programma");
		input.close();
	}

	public static void stampaLista(Multimedia[] list) {
		System.out.println("Elementi inseriti:");
		for (int i = 0; i < list.length; i++) {
			if (list[i] != null) {
				System.out.println((i + 1) + ". " + list[i].titolo);
			}
		}
	}

}
