//3 types of data structures
    //array
    //2d array
    //arraylists
import java.util.ArrayList;

public class MyProgram
{
    public static void main(String[] args)
    {
        //ArrayList
        ArrayList<Integer> x = new ArrayList<Integer>();
        
        //ArrayList methods
            //size()
            //get()
            //set()
            //add()
            //remove()
        x.add(5);
        x.add(20);
        x.add(30);
        
        for(int i = 0; i < x.size(); i++){
            
            System.out.println(x.get(i));
        
        }
    }
}