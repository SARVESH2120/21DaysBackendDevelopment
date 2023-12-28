public class Overriding {
    public void showDetails(){
        System.out.println("this is parent");
    }
    
}

class Employee extends Overriding{
    public void showDetails(){
        System.out.println("This is child");
    }
}
