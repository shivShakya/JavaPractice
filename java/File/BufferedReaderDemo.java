import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class BufferedReaderDemo {
public static void main(String[] args) throws IOException {
FileReader fr = new FileReader("abc.txt");
BufferedReader br = new BufferedReader(fr);
char c[] = new char[20];
br.skip(8);
if (br.ready()) {
      System.out.println(br.readLine());
//br.read(c);
/*
for (int i = 0; i < 20; i++) {
	System.out.print(c[i]);
}
*/
}
}
}