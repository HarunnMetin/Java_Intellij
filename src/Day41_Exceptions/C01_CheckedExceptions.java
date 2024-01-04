package Day41_Exceptions;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_CheckedExceptions {

    public static void main(String[] args) throws FileNotFoundException {

        FileInputStream fileInputStream = new FileInputStream("C:\\Users\\acer\\Java_Team120\\src\\Day41_Exceptions\\Dosya.txt");
    }
}
