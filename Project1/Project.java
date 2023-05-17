import java.util.Scanner;

public class Project extends ProjectFileFunctions {
    static Scanner input=new Scanner(System.in);
    public static void fileFunctions(String path){
        
        //Scanner input=new Scanner(System.in);
        boolean flag=true;

        while(flag){
            System.out.println("\nChoose:\na. Add file\nb. Delete File\nc. Search file\nd. Exit");
            char s=input.next().charAt(0);
            switch(s){
                case 'a': input.nextLine();
                          System.out.print("\nEnter file name: ");
                          String fileNme=input.nextLine();
                          addFile(path,fileNme);
                          break;
                case 'b': input.nextLine();
                          System.out.print("\nEnter file name: ");
                          fileNme=input.nextLine();
                          deleteFile(path,fileNme);
                          break;
                case 'c': System.out.print("\nEnter file name: ");
                          input.nextLine();
                          String fileName=input.nextLine();
                          boolean exist=searchFile(path,fileName,false);
                          if(exist){
                            System.out.println("\nFile found");
                          }
                          else{
                            System.out.println("\nFile not found");
                          }
                          break;
                case 'd': flag=false;
                          break;
                default: System.out.println("Enter from a to d");
            }
        }
    }
    public static void main(String[] args) {
        
        // Specify the directory path
        String path = "/Users/shrutheebalakrishnan/Documents/Simplilearn/VirtualClass/Project1/SearchFolder";

        boolean flag=true;
        //Scanner input=new Scanner(System.in);

        System.out.println("Welcome to LockedMe.com");

        while(flag){
            System.out.println("\nSelect:\n1. List file names\n2. File operations\n3. Quit");
            
            int s=input.nextInt();

            switch(s){
                case 1: listFiles(path);
                        break;
                case 2: fileFunctions(path);
                        break;
                case 3: flag=false;
                        break;
                default: System.out.println("Enter from 1 to 3");
            }
        }

        System.out.println("\nThank you for using LockedMe.com\n");
        input.close();
    }
}
