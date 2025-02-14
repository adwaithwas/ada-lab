import java.util.LinkedList;

class Main{
    public static void main(String[] Args){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(1); l.add(2); l.add(3); l.add(4); l.add(5); l.add(6);
        
        findNode(l, 3);
    }
    
    private static void findNode(LinkedList<Integer> l, int index){
        int newIndex;
        newIndex = l.size() - index;
        System.out.println(l.get(newIndex));
    }
}
