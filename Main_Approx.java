package travelling_salesman_problem;

public class Main_Approx {
    public static void main(String[] args) {
        int[][] graph = {{0,1,0,3,0,0,2}, 
                         {1,0,3,0,2,3,1}, 
                         {0,3,0,2,0,0,2}, 
                         {3,0,2,0,5,0,0},
                         {0,2,0,5,0,3,0},
                         {0,3,0,0,3,0,1},
                         {2,1,2,0,0,1,0}}; 
        int v=7;
        ApproxAlgo a=new ApproxAlgo();
        a.Prim(graph,v);
        Graph g=new Graph(7);
        for(int i=0;i<7;i++){
            for(int j=0;j<7;j++){
                if(graph[i][j]!=0)
                {
                    g.addEdge(i, j);
                }
            }
        }
        System.out.print("\nThe path is : ");
        g.DFS(0,graph); 
        System.out.println();
        
    }      
}
