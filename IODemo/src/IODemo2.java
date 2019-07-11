import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.RandomAccessFile;

public class IODemo2 {
	 public static void main(String args[])
     {
       try
         {
    	   /*PrintWriter pw=new PrintWriter(new FileOutputStream("Abc.txt",true));
           pw.println("hii everyone");
           pw.flush();
           pw.close();
           */
    	   
    	   File dir1=new File("abc");
    	   dir1.mkdir();
    	   File dir2=new File(dir1,"xyz");
    	   dir2.mkdir();
    	   File f=new File(dir2,"atoz.txt");
    	   f.createNewFile();
    	   PrintWriter pw=new PrintWriter(new FileOutputStream(f,true));
    	   pw.println("Created using program");
    	   pw.flush();
    	   pw.close();
              }
             
       catch(Exception e)
       {
         System.out.println("File doesnt exist");
        }
                 
         }
        
     }

