package graph;
import java.util.*;
public class Graph {
    LinkedList<Integer>adj[];
    Graph(int v){
        adj=new LinkedList[v];
        for(int i=0;i<v;i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }
    void addEdge(int source, int destination){
        adj[source].add(destination);
        adj[destination].add(source);
    }
    public  int bfs(int source, int destination){
        boolean []visited=new boolean[adj.length];
        int []parent=new int[adj.length];
        Queue<Integer>queue=new LinkedList<>();
        queue.add(source);
        parent[source]=-1;
        visited[source]=true;
        while(!queue.isEmpty()){
            int current=queue.poll();
            for(int neighbour:adj[current]){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    queue.add(current);
                    parent[neighbour]=current;
                }
            }
        }
        int current=destination;
        int distance=0;
        while(parent[current]!=-1){
            System.out.print(current+" --> ");
            current=parent[current];
            distance++;
        }
            return distance;

    }
        public boolean dfsUtil(int source, int destination, boolean []visited){
        if(source==destination)
            return true;
        for(int neighbour: adj[source]){
            if(!visited[neighbour]){
                visited[neighbour]=true;
                boolean current=dfsUtil(source,destination,visited);
                if(current)
                    return true;
            }
        }
        return false;
        }
        boolean dfs(int source, int destination){
        boolean []visted = new boolean[adj.length];
        visted[source]=true;
        return dfsUtil(source,destination,visted);
        }

        boolean dfsStack(int source, int destination){
        Stack<Integer>s=new Stack<>();
        boolean []visited=new boolean[adj.length];
        visited[source]=true;
        s.push(source);
        while(!s.isEmpty()){
            int current=s.pop();
            if(source==destination)
                return true;
            for(int neighbour: adj[current]){
                if(!visited[neighbour]){
                    visited[neighbour]=true;
                    s.push(neighbour);
                }
            }
        }
        return false;
        }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of vertices and edges");
        int v=sc.nextInt();
        int e=sc.nextInt();
        Graph graph=new Graph(e);
        System.out.println("Enter "+ e+" edges");
        for(int i=0;i<e;i++){
            int source=sc.nextInt();
            int destination=sc.nextInt();
            graph.addEdge(source,destination);
        }
        System.out.println("Enter source node and destiny ");
        int source=sc.nextInt();
        int destination=sc.nextInt();
//        int distance=graph.bfs(source, destination);
//        System.out.println("The distance is "+ distance);
        boolean DFS=graph.dfsStack(source,destination);
        System.out.println("Is Possible = "+ DFS);
        sc.close();
    }

}
