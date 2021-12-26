package As4.lkj.As5;



/**
 * ACS-3913 - Assignment 5
 */

import java.util.ArrayList;
import java.util.List;

public class Folder extends FileComponent {
    private List<FileComponent> contents;
    private int total=0;
    public Folder(String n){
        name = n;
        contents = new ArrayList<>();
    }
    
    public void addFileComponent(FileComponent fc){
        contents.add(fc);
        fc.setParent(this);
    }
    public int getSize(){
        
        
        for(FileComponent fileComponent: contents){
             total=total+fileComponent.getSize();
            }
        
        
    
        return total;
    }
    public String getPath(){
            String Final =this.toString();
            
            FileComponent k = this.getParent();
            while(k!=null){
                
                Final=k.toString()+"/"+Final;
                k=k.getParent();
                
        }
            return Final;
        
    }
    public void accept(Visitor v) {
        v.visit(this);
    }
    public List<FileComponent> getContent(){
        return contents;
    }
    
    
    public void display(String indent) {
        indent += "--";
        System.out.println(indent + "Folder: "+name);
        for(FileComponent fileComponent: contents){
            fileComponent.display(indent);
        }
    }

    public String toString(){
        return name;
    }
}