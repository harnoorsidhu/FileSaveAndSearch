package As4.lkj.As5;


/**
 * Write a description of class BackupVisitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
import java.io.*;
import java.io.IOException; 
public class BackupVisitor implements Visitor
{
    String NextPath="";
    String folder="";
     public BackupVisitor()
    {
    }
    public void visit(Folder e)
    {
     
        List<FileComponent> list = e.getContent();
         java.io.File  course= new java.io.File(e.getPath());
                    
                   course.mkdir();
        System.out.println("Backing up Folder "+e+" contents:");
        for(FileComponent fileComponent: list){
          fileComponent.accept(this);
    }
    

}
 public void visit(File file){
       
               String data= file.getData();
               
      
               
            try {
                System.out.println(file.getPath());
            java.io.File myObj = new java.io.File(file.getPath());
            FileWriter myWriter = new FileWriter(file.getPath());
            myWriter.write(data);
      myWriter.close();
    }catch(IOException jk) {}
    
        
    }
    
    }
    

