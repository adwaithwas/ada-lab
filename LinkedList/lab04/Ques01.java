import java.util.LinkedList;

class Main{
    public static void main(String[] args){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1); l.add(2); l.add(3); l.add(4);
        
        printForward(l);
        printBackward(l, 0);
        
        
    }
    
    private static void printForward(LinkedList<Integer> l){
        System.out.println(l);
    }
    
    private static void printBackward(LinkedList<Integer> l, int index){
        if (l.size() == index){
            return;
        }
        printBackward(l, index+1);
        System.out.println(l.get(index));
    }
}