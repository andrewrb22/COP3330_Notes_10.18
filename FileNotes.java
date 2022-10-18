import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotes {
public static void main(String[] args) throws FileNotFoundException {
Scanner fileInput = new Scanner( new File("inputfile.txt") );
int lines = fileInput.nextInt();
for (int i=0; i<lines; i++) {
//System.out.println(fileInput.nextInt() + ", " + 
fileInput.nextInt() ;
}
fileInput.close();
}
}