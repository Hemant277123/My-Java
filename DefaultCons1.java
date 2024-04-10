/* In this code I want to give pre  user defiend members
* in the class of Default Constructor */
//

/* If there is no any constructor in the class,compiler will automatically
provides a default constructor whose work is to initilize the value of members in the class.
 */

import java.util.*;
public class DefaultCons1 {
    String name;
    int age;
    public DefaultCons1(){
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
        // Constructor will automatically calls after creating object of the Class 'DefaultCons1'
        DefaultCons1 obj=new DefaultCons1();
        obj.show();
    }

}
