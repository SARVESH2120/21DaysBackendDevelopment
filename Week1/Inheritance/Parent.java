

public class Parent {
    public void eat(){
        System.out.println("parent eat");
    }
    public void m1(){
        System.out.println("I am m1() of parent");
    }
}


class Child extends Parent{
    public void m1(){
        System.out.println("I am m1() of child");
    }
    
}



//Inheritance
//Child overides the property of parent is called method overriding(parent called overridden method)
//public>protected>default>private 

// --Encapsulation
//Wrapping of data members)(variables) and member methods(method) in a single unit.
// Data hiding, security
//always create a variable private -- use of getters & settters

// -- Abstraction(Abstract class(50%), Interface(100%))
// showing feature and hiding internal detail(implementation)
//Abstract Methods -- don't have body of method
//abstract public void call();
//



