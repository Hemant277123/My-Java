import java.util.*;
public class ParametrizedCons {
    String name;
    int age;
    /* If i will not give any Parameter in Constructor
     * they will print the same task as how many times they will call through object
     *
     * but here I am giving the parameter "String=n & int=a" */
    public ParametrizedCons(String n,int a){
        name=n;
        age=a;
    }
    // The name of Constructor is same as the Class name.
    //And Here no any return volue even void.
    public void show(){
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }

    public static void main(String[] args) {
        // Constructor will automatically calls after creating object of the Class 'ParametrizedCons'
        ParametrizedCons obj=new ParametrizedCons("Ashish Kr.Pandey",27);
        ParametrizedCons obj1=new ParametrizedCons("Praveen Kr.Pandey",25);
        ParametrizedCons obj2=new ParametrizedCons("Hemant Kr. Pandey",20);
        obj.show();
        obj1.show();
        obj2.show();
    }

}
