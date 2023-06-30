package Proggetto;

public class Video extends Multimedia implements Riproduci, Luminosita {

	private int volume;
	private int durata;
	private int luminosita;

	public Video(String titolo, int dur, int vol, int lum) {
		super(titolo);
		this.setDurata(dur);
		this.luminosita = lum;
		this.volume = vol;
	}

	@Override
	public void play() {
		for (int i = 0; i <= durata; i++) {
			String stampaVolume = "!".repeat(volume);
			String stampaluminosita = "*".repeat(volume);

			System.out.println(titolo + stampaVolume + stampaluminosita);
		}
	}

	@Override
	public void alzaVolume() {
		if (volume == 10) {
			System.out.println("Attenzione volume al massimo");
		} else {
			volume++;
		}

	}

	@Override
	public void abbassaVolume() {
		if (volume == 0) {
			System.out.println("attenzione il volume è a 0");
		} else {
			volume--;
		}
	}

	public int getDurata() {
		return durata;
	}

	public void setDurata(int durata) {
		this.durata = durata;
	}

	@Override
	public void aumentaLuminosita() {
		if (luminosita == 10) {
			System.out.println("Attenzione luminosità al massimo");
		} else {
			luminosita++;
		}

	}

	@Override
	public void abbassaLuminosita() {
		if (luminosita == 0) {
			System.out.println("attenzione il luminosità è a 0");
		} else {
			luminosita--;
		}

	}

}
