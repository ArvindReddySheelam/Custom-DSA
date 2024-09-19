import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderWithTry{
    public static void main(String[] args){
        String File_Name = "C:/Users/srike/Documents/AWS Root vs IAM.txt";
        try(BufferedReader reader = new BufferedReader(new FileReader(File_Name))){
            String line;
            while((line = reader.readLine()) != null){
                System.out.println(line);
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        finally{
            System.out.println("All Done");
        }
    }
}
