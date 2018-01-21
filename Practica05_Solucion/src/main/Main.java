package main;

import java.io.IOException;
import java.io.InputStreamReader;

import editor.Dibujo;
import editor.Editor;

public class Main {

	public static void main(String[] args) throws IOException {
		Editor editor = new Editor(new Dibujo());
		TextModeInterface userInterface = new TextModeInterface(
				new InputStreamReader(System.in), editor);
		userInterface.run();
	}

}
