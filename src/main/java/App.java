import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class App {
    public static void main(String[] args){
        BufferedReader bufferedReader= new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Hey this is an Encryption App!!!");
        System.out.println("enter a text and get it Encrypted and decrypted:");
        try{
            String text=bufferedReader.readLine();
            Encrypt encrypt= new Encrypt();
            String result=encrypt.Ceaser(text);
            System.out.println("the encrypted text is: "+result);
            Decrypt decrypt=new Decrypt();
            String inverse=decrypt.cipher(result);
            System.out.println("the decrypted text is:" +inverse);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
