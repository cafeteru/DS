package outputs;
import java.io.*;

//Patrón Strategy, te falta una parte del codigo
public interface Output { 
	void send(char c) throws IOException;
	void close() throws IOException;
}
