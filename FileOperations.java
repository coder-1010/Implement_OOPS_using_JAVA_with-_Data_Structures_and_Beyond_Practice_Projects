import java.io.BufferedReader;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
public class FileOperations {
    public static void main(String[] args) {
        String fileName="FileOperations.txt",content1="line 1",content2,line;
        System.out.println("File name: "+fileName);
        try(BufferedWriter bw1=new BufferedWriter(new FileWriter(fileName))){
            System.out.println("Content: "+content1+"\n\nWrite to file");
            bw1.write(content1);
            System.out.println("Successfully completed\n");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        try(BufferedReader br1=new BufferedReader(new FileReader(fileName))){
            System.out.println("Read from file");
            if((line=br1.readLine())!=null){
                System.out.println(line);
            }
            System.out.println("Successfully completed\n");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        content2="line 2";
        try(BufferedWriter bw2=new BufferedWriter(new FileWriter(fileName,true))){
            System.out.println("Content: "+content2+"\nAppend to file");
            bw2.write("\n"+content2);
            System.out.println("Successfully completed");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
        try(BufferedReader br2=new BufferedReader(new FileReader(fileName))){
            System.out.println("\nRead from file");
            while((line=br2.readLine())!=null){
                System.out.println(line);
            }
            System.out.println("Successfully completed");
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
}
