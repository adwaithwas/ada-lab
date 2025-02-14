import java.util.LinkedList;

class Main{
    public static void main(String[] Args){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1); l.add(2); l.add(3);
        
        System.out.println(l); //old list
        
        //adding at the start
        l.addFirst(99);
        //adding at the end
        l.add(88);
        
        System.out.println(l); //new list
    }
}
