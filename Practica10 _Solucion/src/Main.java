import java.io.IOException;

import editor.Editor;
import editor.ui.EditorTextUI;

public class Main {
	public static void main(String[] args) throws IOException {
		Editor editor = new Editor();
		EditorTextUI console = new EditorTextUI(editor);
		console.run();
	}
}