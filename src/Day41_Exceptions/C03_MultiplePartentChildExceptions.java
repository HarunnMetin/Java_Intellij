package Day41_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C03_MultiplePartentChildExceptions {

    public static void main(String[] args) {

        String dosyaYolu = "C:\\Users\\acer\\Java_Team120\\src\\Day41_Exceptions\\Dosya.txt";

        try {
            FileInputStream fileInputStream = new FileInputStream(dosyaYolu);

            int k = 0;
            while ((k = fileInputStream.read() ) != (-1)){
                System.out.print((char) k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("verilen dosya yolu hatali dosya bulunamadi");
        } catch (IOException e) {
            System.out.println("dosya okunamiyor");
        }


    }
}
