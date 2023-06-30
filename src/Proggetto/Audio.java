package Proggetto;

public class Audio extends Multimedia implements Riproduci {

	private int volume;
	private int durata;

	public Audio(String titolo, int dur, int vol) {
		super(titolo);
		this.setDurata(dur);
		this.volume = vol;
	}

	@Override
	public void play() {
		for (int i = 0; i <= durata; i++) {
			String stampaVolume = "!".repeat(volume);
			System.out.println(titolo + stampaVolume);
		}
	}

	@Override
	public void alzaVolume() {
		if (volume >= 10) {
			System.out.println("Attenzione volume al massimo");
		} else {
			volume++;
		}

	}

	@Override
	public void abbassaVolume() {
		if (volume <= 0) {
			System.out.println("attenzione il volume è al minimo");
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

	public int getVolume() {
		return volume;
	}

	public void setVolume(int vol) {
		this.volume = vol;
	}
}
