package travelling_salesman_problem;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;
import java.util.Vector;


public class Graph {
   int V;          
    LinkedList<Integer>[] adj; 
    Graph(int V) 
    { 
        this.V = V; 
        adj = new LinkedList[V]; 
              
        for (int i = 0; i < adj.length; i++) 
        adj[i] = new LinkedList<Integer>(); 
              
    } 
    void addEdge(int v, int w) 
    {   adj[v].add(w);} 
    
    void DFS(int s,int G[][]) 
    {   ArrayList<Integer> a= new ArrayList<Integer>(7);
        ArrayList<Integer> b= new ArrayList<Integer>(7);
        Vector<Boolean> visited = new Vector<Boolean>(V); 
        for (int i = 0; i < V; i++) 
            visited.add(false);    
        Stack<Integer> stack = new Stack<>(); 
        stack.push(s); 
              
         while(stack.empty() == false) 
        { 
            s = stack.peek(); 
            stack.pop(); 
                
            if(visited.get(s) == false) 
            {   
                System.out.print((s+1) + " -> "); 
                visited.set(s, true); 
                a.add(s);
            } 

            Iterator<Integer> itr = adj[s].iterator(); 
                  
             while (itr.hasNext())  
             { 
                int v = itr.next(); 
                if(!visited.get(v)) 
                    stack.push(v); 
             } 
                 
      
        }
         a.add(0);
        System.out.print("1");
        int i,n,j,z=0,k;
        for(i=1;i<a.size();i++){
            k=i-1;
            n = a.get(k);
            j = a.get(i);
            z=z+G[n][j];
        }
        System.out.print("\nMinimum Cost : "+z);
}
}
