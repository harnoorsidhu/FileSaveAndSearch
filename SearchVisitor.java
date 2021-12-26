package As4.lkj.As5;

/**
 * Write a description of class SearchVisitor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.List;
public class SearchVisitor implements Visitor
{
    private String key ="";
    public SearchVisitor()
    {
    }

    public void setSearchTerm(String word){
        key=word;

    }

    public void visit(Folder e)
    {   
        Folder f = (Folder) e;
        List<FileComponent> list = f.getContent();

        for(FileComponent fileComponent: list){

            fileComponent.accept(this);
        }
    }

    
    public void visit(File file){

        String data= file.getData().toLowerCase();
        if(file.toString().toLowerCase().contains(key)||data.contains(key)){
            System.out.println(file.getPath());
        }
    }

}


