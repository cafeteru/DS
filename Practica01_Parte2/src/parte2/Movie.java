package parte2;

public class Movie {
	private String title;
	private MovieType type;
	
	public Movie(String title, MovieType type) {
		this.title = title;
		this.type = type;
	}

	public String getTitle() {
		return title;
	}

	public void setTitulo(String title) {
		this.title = title;
	}

	public MovieType getTipo() {
		return type;
	}

	public void setTipo(MovieType type) {
		this.type = type;
	}
	
	
}
