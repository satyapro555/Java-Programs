import java.util.*;

class ColectionDemo
{
    public static void main(String []ar){
        Collection<Integer> c1;
        System.out.println("main begins");
        //c1 = new ArrayList<Integer>();
        c1 = new Vector<Integer>();
        System.out.println("c1 contains "+c1.size()+" elemets");
        System.out.println("is c1 is empty:"+c1.isEmpty()); 
        c1.add(101);
        c1.add(202);
        c1.add(22);
        c1.add(33);
        System.out.println("c1: "+c1);
        c1.remove(22);
        System.out.println("c1: "+c1);
        System.out.println("is c1 contains 12: "+c1.contains(12));
    }
}