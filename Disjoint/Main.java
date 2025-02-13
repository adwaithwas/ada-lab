package Disjoint;
import java.util.Arrays;

class Disjoint{
    int[] parent;
    Disjoint(int n){
        // if (parent == 0) return;
        parent = new int[n+1];
        
        for(int i=1; i<=n; i++){
            parent[i]= i;
        }
    }
    
    public int find(int n){
        if(parent[n] != n){
            parent[n] = find(parent[n]);
        }
        return parent[n];
    }
}

class Main{
    public static void main(String[] Args){
        Disjoint dis = new Disjoint(10);
        System.out.println(Arrays.toString(dis.parent));
        
        System.out.println(dis.find(7)); //parent of 5
        
    }
