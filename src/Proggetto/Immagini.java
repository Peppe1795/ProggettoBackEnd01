package Proggetto;

public class Immagini extends Multimedia implements Luminosita {
	private int luminosita;

	public Immagini(String tit, int lum) {
		super(tit);
		this.luminosita = lum;
	}

	public int getluminosita() {
		return luminosita;
	}

	public void setluminosita(int lum) {
		this.luminosita = lum;
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

	public void show() {
		String stampaLuminosita = "*".repeat(luminosita);
		System.out.println(titolo + stampaLuminosita);
	}
}
