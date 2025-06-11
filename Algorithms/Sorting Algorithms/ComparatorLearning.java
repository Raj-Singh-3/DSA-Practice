import java.util.*;
class Sorter
{
    int age;
    double sal;
    String name;
    public Sorter(int age,double sal,String name)
    {
        this.age = age;
        this.sal = sal;
        this.name = name;
    }
    public void showDetails()
    {
        System.out.println(name +" "+sal+" "+age);
    }
}

public class ComparatorLearning {
    public static void main(String[] args) {
        ArrayList<Sorter> arr = new ArrayList<>();
        arr.add(new Sorter(18, 24.8, "abc"));
        arr.add(new Sorter(28, 22, "x"));
        arr.add(new Sorter(8, 21, "y"));
        arr.add(new Sorter(23, 28.4, "pe"));
        arr.add(new Sorter(12, 26.3, "ijk"));
        System.out.println("Before Sorting");
        for(Sorter s: arr)
        {
            s.showDetails();
        }

        // To access the primitive int data types;
        // Collections.sort(arr,Comparator.comparingInt(s->s.age));
        // to sort this thing in descending
        Collections.sort(arr, Comparator.comparingInt((Sorter s) ->s.age).reversed());


        System.out.println("After Sorting with int");
        for(Sorter s: arr)
        {
            s.showDetails();
        }
        //To access the primitive double data types;
        Collections.sort(arr,Comparator.comparingDouble(s->s.sal));

        System.out.println("After Sorting with double");
        for(Sorter s: arr)
        {
            s.showDetails();
        }
    }
}



