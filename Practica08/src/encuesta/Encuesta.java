package encuesta;

public class Encuesta extends Observable {

	private String pregunta;
	private int si, no;

	public Encuesta(String pregunta) {
		this.pregunta = pregunta;
	}

	public void incrementaSi() {
		si++;
		notificar();
	}

	public void incrementaNo() {
		no++;
		notificar();
	}

	public int getVotosSi() {
		return si;
	}

	public int getVotosNo() {
		return no;
	}

	public String getPregunta() {
		return pregunta;
	}

}
