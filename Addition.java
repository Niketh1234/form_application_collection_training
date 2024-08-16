// import java.util.Scanner;
public class Addition{
    public static void main(String args[]){
        MyAdd<Integer> list1 = new MyAdd();
        System.out.println(list1.addTwoThings(10,20));
        MyAdd<String> list2 = new MyAdd();
        System.out.println(list2.addTwoThings("abc ","def"));
    }
}