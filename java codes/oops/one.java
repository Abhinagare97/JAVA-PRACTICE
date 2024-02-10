package oops;
    // studying classes and objects



public class one {
    public static void main (String [] args){
        Mobile mb = new Mobile();
        mb.setname("iphone");
        mb.setprice(130000);
        System.out.println("my updated phone is "+ mb.getname());
       
        System.out.println("the updated price "+ mb.getprice());
    }
}
class Mobile{
    private String name;
    private int price;
    
    String getname(){
        return this.name;
    }
    int getprice(){
        return this.price;
    }
    void setname(String newname){
        this.name = newname;
    }
    void setprice(int newprice){
        this.price = newprice;
    }
    
}
