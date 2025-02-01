import java.util.LinkedList;
import java.util.Scanner;

class LinkedListLab01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        LinkedList<Integer> list = new LinkedList<Integer>();
        list.add(1); list.add(2); list.add(3);
        
        System.out.println(list);
        
        
        //adding at first
        int num1 = scan.nextInt();
        list.addFirst(num1);
        System.out.println(list);
        
        //adding at end
        int num2 = scan.nextInt();
        list.addLast(num2);
        System.out.println(list);
    
        //adding at mid
        int num3 = scan.nextInt();
        int len = list.size();
        int mid = len/2;
        list.add(mid, num3);
        System.out.println(list);
        
        
        // System.out.println(num1);
        scan.close();
    }
}
