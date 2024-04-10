import java.util.*;
public class NonParametrizedCons {
    String name;
    int age;
    /* If i will not give any Parameter in Constructor
    * they will print the same task as how many times they will call through object */
    public NonParametrizedCons(){
        name="Hemant Kr. Pandey";
        age=20;
    }
    // The name of Constructor is same as the Class name.
    //And Here no any return volue even void.
    public void show(){
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }

    public static void main(String[] args) {
        // Constructor will automatically calls after creating object of the Class 'NonParametrizedCons'
        NonParametrizedCons obj=new NonParametrizedCons();
        NonParametrizedCons obj1=new NonParametrizedCons();
        NonParametrizedCons obj2=new NonParametrizedCons();
        obj.show();
        obj1.show();
        obj2.show();
    }

}
