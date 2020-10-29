package travelling_salesman_problem;
import java.util.*;

public class Travelling_salesman_problem {
    static String path;   
    static int tsp(int[][] g,int[] visited,int pos,int n,int count,int cost,int sol,String s)
    {
        if(count==n && g[pos][0]>0)
        {
            if(sol>cost+g[pos][0])
            {
                path=s;
                sol=cost+g[pos][0];
            }
            return sol;
        }
        for(int i=0;i<n;i++)
        {
            if(visited[i]==-1 && g[pos][i]>0)
            {
                visited[i]=1;
                String str= s+" -> "+Integer.toString(i+1);
                sol=tsp(g,visited,i,n,count+1,cost+g[pos][i],sol,str);
                visited[i]=-1;
            }
        }
        return sol;
    }
    
    public static void main(String args[])
    {   int n=7;
        int[][] graph = {{0,1,0,3,0,0,2}, 
                         {1,0,3,0,2,3,1}, 
                         {0,3,0,2,0,0,2}, 
                         {3,0,2,0,5,0,0},
                         {0,2,0,5,0,3,0},
                         {0,3,0,0,3,0,1},
                         {2,1,2,0,0,1,0}}; 
        int[] vint=new int[n];
        for(int i=0;i<n;i++)
        {
           vint[i]=-1;
        }
        
        int sol=Integer.MAX_VALUE;
        String s="1";
        int pos=0;
        vint[0]=1;
        sol=tsp(graph,vint,pos,n,1,0,sol,s);
        System.out.println("Path is : "+path+" -> 1");
        System.out.println("Minimum Cost : "+sol);
        
    }
} 
