/* If there is no any constructor in the class,compiler will automatically
provides a default constructor whose work is to initilize the value of members in the class.
 */

import java.util.*;
public class DefaultCons {
    String name;
    int age;
    public void show(){
        System.out.println("Name="+name);
        System.out.println("Age="+age);
    }

    public static void main(String[] args) {
        DefaultCons obj=new DefaultCons();
        obj.show();
    }

}
