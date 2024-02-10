package oops;
public class interfaces {
    //INTERFACE IMPLEMENTATION FOR TOTAL ABSTRACTION 
     public static void main(String [] args){

//        queen q = new queen();
  //      q.moves();
    bear b = new bear();
    b.veg();
    b.nonveg();        
}
}

interface chessplayer{
    void moves();
}
class queen implements chessplayer{
    public void moves(){
        System.out.println("up down right left cross");
    }
}



//INTERFACE IMPLEMENTATION FOR MULTIPLE ABSTRACTION 
interface carnivore{
    public void nonveg();
}
interface herbivore{
    public void veg();
}

class bear implements herbivore, carnivore{
    public void nonveg(){
        System.out.println("eats nonveg");

    }
    public void veg(){
        System.out.println("eats veg");
    }
}