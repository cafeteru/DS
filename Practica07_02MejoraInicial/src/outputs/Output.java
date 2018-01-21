package outputs;

import java.io.IOException;

//Patr�n Strategy, te falta una parte del codigo
public interface Output {
	void send(char c) throws IOException;

	void close() throws IOException;
}
