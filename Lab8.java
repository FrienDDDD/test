import java.util.*;

public class Lab8 {
    public static void display(Iterable iterable) {
        Iterator it = iterable.iterator();
        System.out.print("{ ");
        while (it.hasNext()) {
            System.out.print(it.next());
            System.out.print(" , ");
        }

        System.out.println("}");
    }

    public static void main(String[] Args) {
        HashMapSet<Integer> A = new HashMapSet<>(); // Our own Set class
        Set<Integer> B = new HashMapSet<>(); // Our own Set clas
        System.out.println("\n__________Demonstrating equals,hashcode, and toArray method__________\n");


        System.out.print("A = ");
        display(A);
        System.out.print("B = ");
        display(B);
        A.add(1) ;
        A.add(2) ;
        A.add(3) ;
        System.out.println("adding 1,2,3 to A");
        System.out.print("A = ");
        display(A);
        System.out.println("adding 0,2,4 to B");
        B.add(0) ;
        B.add(2) ;
        B.add(4) ;
        System.out.print("B = ");
        display(B);
        System.out.println();

        System.out.println("\n__________Demonstrating toArray method__________\n");

        System.out.print("A = ");
        display(A);
        System.out.print("B = ");
        display(B);
        System.out.println("Change A to Array");
        A.toArray() ;
        System.out.print("[ ");
        for(int element : A){
            System.out.print(element + " ,");
        }
        System.out.println("] ");
        System.out.println("Copy the array from A by using toArray()");
        Integer[] arr = new Integer[3];
        arr = A.toArray(arr);
        System.out.print("The arr[] is: [ ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + ", ");
        }
        System.out.print("] ");
        System.out.println();

        System.out.println("\n__________Demonstrating hashcode method__________\n");
        System.out.print("A = ");
        display(A);
        System.out.print("B = ");
        display(B);
        System.out.println("hashcode of A is " + A.hashCode());
        System.out.println("hashcode of B is " + B.hashCode());
        System.out.println();

        System.out.println("\n__________Demonstrating equals method__________\n");

        System.out.print("A = ");
        display(A);
        System.out.print("B = ");
        display(B);
        System.out.println("A equal to B ? : " + A.equals(B));
        System.out.println();

        System.out.println("\n__________Demonstrating ShortLexComparator_________\n");
        Comparator<String> c = new ShortLexComparator() ;
        String name[] = {"prayut","prawit","jaa","jaa"} ;
        String name1[] = {"xiao","leenajung","oak","jaa"} ;
        for(int i = 0;i < name.length;i++){
            System.out.println(name[i] + " compare " + name1[i] + " in short-lex order");
            System.out.print("Result : ");
            if(c.compare(name[i],name1[i]) > 0){
                System.out.println(name[i] + " comes after " + name1[i]);
            }else if(c.compare(name[i],name1[i]) == 0){
                System.out.println(name[i] + " equals " + name[i]);
            }else{
                System.out.println(name[i] + " comes before " + name1[i]);
            }
            System.out.println();
        }

    }
}
