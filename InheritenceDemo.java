import java.util.*;
class CellPhone{
    public void basicPhone(){
        System.out.println("You can only communicate through basic phone");

    }
}
class Multimedia extends CellPhone{
    public void multimediaPhone(){
        System.out.println("Internet and Camera Facility Added");
    }
}

public class InheritenceDemo {
    public static void main(String[] args) {
        Multimedia obj=new Multimedia();
        obj.basicPhone();
        obj.multimediaPhone();

    }
}
