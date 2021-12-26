package As4.lkj.As5;

/**
 * ACS-3913 - Assignment 5
 */

public class File extends FileComponent{
    private String data;    // file contents
    private int size;       // file size

    public File(String name, String data, int size){
        this.name = name;
        this.data = data;
        this.size=size;
    }

    public String getData() {
        return data;
    }
    
    public int getSize(){
        
        return size;
    }
    public String getPath(){
        Folder parent = (Folder)this.getParent();
        
        
    String previousPath= parent.getPath();
    return previousPath+"/"+this.toString();
    }
     public void accept(Visitor v) {
        v.visit(this);
    }

    public void display(String indent) {
        indent += "--";
        System.out.println(indent + "File: " + name);
    }  
    
    public String toString(){
        return name;
    }
}
