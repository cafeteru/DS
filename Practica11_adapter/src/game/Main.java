package game;

public class Main {
	public static void main(String[] args) {
		BallGame game = new BallGame(Platform.ANDROID);
		game.play();
		game = new BallGame(Platform.PLAYSTATION);
		game.play();
		game = new BallGame(Platform.WINDOWS);
		game.play();
	}
}
