import java.io.File;
import java.util.Arrays;
import java.util.List;
import java.io.IOException;

public class ProjectFileFunctions{
    public static void addFile(String path,String fileName){
        if(searchFile(path,fileName.toLowerCase(),true)){
            System.out.println("\nFile name already exists");
        }
        else{
            try{
                File file=new File(path,fileName);
                file.createNewFile();
                System.out.println("\nFile added");
            } catch(IOException ioe){
                System.out.println("\nFile not added");
            }
        }
    }

    public static void deleteFile(String path,String fileName){
        if(!searchFile(path,fileName,false)){
            System.out.println("\nFile doesn't exist");
        }
        else{
            try{
                File file=new File(path, fileName);
                file.delete();
                System.out.println("\nFile deleted");
            } catch(Exception ioe){
                System.out.println("\nFile can't be deleted");
            }
            
        }
    }
    
    public static List<String> srchFile(String path,String fileName,boolean cse){
        // Create a File object for the directory
        File directory = new File(path);
        
        // Get the list of file names in the directory
        String[] files = directory.list();
        if(cse==true){
            for (int i = 0; i < files.length; i++) {
                files[i] = files[i].toLowerCase();
            }
        }
        
        List<String> list = Arrays.asList(files);
        return list;
    }

    public static boolean searchFile(String path,String fileName,boolean cse){
        
        List<String> list=srchFile(path,fileName,cse);
        if(list.contains(fileName)){
            return true;
        }
        else{
            return false;
        }
    }

    public static void listFiles(String path){
        // Create a File object for the directory
        File directory = new File(path);
        
        // Get the list of file names in the directory
        String[] files = directory.list();
        
        // Sort the file names in ascending order
        Arrays.sort(files);
        System.out.println("");
        // Print the sorted file names
        for (String file : files) {
            System.out.println(file);
        }
    }

}