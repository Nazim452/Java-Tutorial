import java.util.*;

// BFS- FOR SINGLE GRAPH

// public class graph {
//     static class edge {
//         int src;
//         int dest;

//         public edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;

//         }
//     }

//     public static void createGraph(ArrayList<edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<edge>();
//         }
//         graph[0].add(new edge(0, 1));
//         graph[0].add(new edge(0, 2));

//         graph[1].add(new edge(1, 0 ));
//         graph[1].add(new edge(1, 3 ));

//         graph[2].add(new edge(2, 0 ));
//         graph[2].add(new edge(2, 4 ));

//         graph[3].add(new edge(3, 1));
//         graph[3].add(new edge(3, 4));
//         graph[3].add(new edge(3, 5));

//         graph[4].add(new edge(4, 2));
//         graph[4].add(new edge(4, 3));
//         graph[4].add(new edge(4, 5));

//         graph[5].add(new edge(5, 3));
//         graph[5].add(new edge(5, 4));
//         graph[5].add(new edge(5, 6));

//         graph[6].add(new edge(6, 5));

//     }

//     public static void bfs(ArrayList<edge> graph[], int v, boolean vis[]){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(0);

//         while(!q.isEmpty()){
//             int curr = q.remove();

//             if(vis[curr]==false){
//                 System.out.print(curr+" ");
//                 vis[curr]= true;

//                 for(int i = 0; i<graph[curr].size(); i++){
//                     edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }

//             }
//         }

//     }
//     public static void main(String[] args) {
//         int v = 7;
//         ArrayList<edge>[] graph = new ArrayList[v];
//         createGraph(graph);

//         boolean []isVisited = new boolean[v];
//         // for(int i = 0; i < v; i++){
//         //     if(isVisited[i]==false){
//         //         dfs(graph, isVisited, i);

//         //     }
//         // }
//         bfs(graph, v, isVisited);

//     }
// }




//BFS FOR MORE THAN ONE SUBGRAPH



// public class graph {
//     static class edge {
//         int src;
//         int dest;

//         public edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;

//         }
//     }

//     public static void createGraph(ArrayList<edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<edge>();
//         }
//         graph[0].add(new edge(0, 1));
//         graph[0].add(new edge(0, 2));

//         graph[1].add(new edge(1, 0 ));
//         graph[1].add(new edge(1, 3 ));

//         graph[2].add(new edge(2, 0 ));
//         graph[2].add(new edge(2, 4 ));

//         graph[3].add(new edge(3, 1));
//         graph[3].add(new edge(3, 4));
//         graph[3].add(new edge(3, 5));

//         graph[4].add(new edge(4, 2));
//         graph[4].add(new edge(4, 3));
//         graph[4].add(new edge(4, 5));

//         graph[5].add(new edge(5, 3));
//         graph[5].add(new edge(5, 4));
//         graph[5].add(new edge(5, 6));

//         graph[6].add(new edge(6, 5));

//     }

//     public static void bfs(ArrayList<edge> graph[], int v, boolean vis[], int st){
//         Queue<Integer> q = new LinkedList<>();
//         q.add(st);

//         while(!q.isEmpty()){
//             int curr = q.remove();

//             if(vis[curr]==false){
//                 System.out.print(curr+" ");
//                 vis[curr]= true;

//                 for(int i = 0; i<graph[curr].size(); i++){
//                     edge e = graph[curr].get(i);
//                     q.add(e.dest);
//                 }

//             }
//         }

//     }
//     public static void main(String[] args) {
//         int v = 7;
//         ArrayList<edge>[] graph = new ArrayList[v];
//         createGraph(graph);

//         boolean []isVisited = new boolean[v];
//         for(int i = 0; i < v; i++){
//             if(isVisited[i]==false){
//                 bfs(graph, v, isVisited,i);

//             }
//         }

//     }
// }





// DFS FOR MORE THAN ONE SUB-GRAPH







// public class graph {
//     static class edge {
//         int src;
//         int dest;

//         public edge(int src, int dest) {
//             this.src = src;
//             this.dest = dest;

//         }
//     }

//     public static void createGraph(ArrayList<edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<edge>();
//         }
//         graph[0].add(new edge(0, 1));
//         graph[0].add(new edge(0, 2));

//         graph[1].add(new edge(1, 0 ));
//         graph[1].add(new edge(1, 3 ));

//         graph[2].add(new edge(2, 0 ));
//         graph[2].add(new edge(2, 4 ));

//         graph[3].add(new edge(3, 1));
//         graph[3].add(new edge(3, 4));
//         graph[3].add(new edge(3, 5));

//         graph[4].add(new edge(4, 2));
//         graph[4].add(new edge(4, 3));
//         graph[4].add(new edge(4, 5));

//         graph[5].add(new edge(5, 3));
//         graph[5].add(new edge(5, 4));
//         graph[5].add(new edge(5, 6));

//         graph[6].add(new edge(6, 5));

//     }

//      public static void dfs(ArrayList<edge>[] graph, boolean[]isVisited,int curr){
//         System.out.print(curr+" ");
//         isVisited[curr] = true;
//         {

//             for(int i = 0; i<graph[curr].size(); i++){
//                 edge e = graph[curr].get(i);
//                 if(isVisited[e.dest]==false){
//                     dfs(graph, isVisited, e.dest);

//                 }

//             }
//         }

//      }

//     public static void main(String[] args) {
//         int v = 7;
//         ArrayList<edge>[] graph = new ArrayList[v];
//         createGraph(graph);

//         boolean []isVisited = new boolean[v];
//         for(int i = 0; i < v; i++){
//             if(isVisited[i]==false){
//                 dfs(graph, isVisited, i);

//             }
//         }

//         // System.out.println();

//     }
// }

// All  PATH FROM SOURCE TO TARGET

// public class graph {
//     static class edge {
//         int src;
//         int dest;

//         public edge(int src, int dest ) {
//             this.src = src;
//             this.dest = dest;

//         }
//     }

//     public static void createGraph(ArrayList<edge>[] graph) {
//         for (int i = 0; i < graph.length; i++) {
//             graph[i] = new ArrayList<>();
//         }
// graph[0].add(new edge(0, 1));
// graph[0].add(new edge(0, 2));

// graph[1].add(new edge(1, 0 ));
// graph[1].add(new edge(1, 3 ));

// graph[2].add(new edge(2, 0 ));
// graph[2].add(new edge(2, 4 ));

// graph[3].add(new edge(3, 1));
// graph[3].add(new edge(3, 4));
// graph[3].add(new edge(3, 5));

// graph[4].add(new edge(4, 2));
// graph[4].add(new edge(4, 3));
// graph[4].add(new edge(4, 5));

// graph[5].add(new edge(5, 3));
// graph[5].add(new edge(5, 4));
// graph[5].add(new edge(5, 6));

// graph[6].add(new edge(6, 5));

//     }

//     public static void printAllPath(ArrayList<edge>[] graph , int curr,String path, int tar, boolean[] isVisited){
//         if(curr==tar){
//             System.out.println(path);
//             return;
//         }

//         for(int i =0; i<graph[curr].size(); i++){
//             edge e = graph[curr].get(i);

//             if(!isVisited[curr]){
//                 isVisited[curr] = true;

//                 printAllPath(graph, e.dest, path+e.dest, tar, isVisited);
//                 isVisited[curr] = false;
//             }
//         }
//     }

//     public static void main(String[] args) {
// int v = 7;
// ArrayList<edge>[] graph = new ArrayList[v];
// createGraph(graph);

//         boolean []isVisited = new boolean[v];
//         int src = 0, tar = 5;
//         printAllPath(graph, src, "0", tar, isVisited);
//     }
// }

// Cycle detection in graph

// public class graph{
//         static class edge {
//         int src;
//         int dest;

//         public edge(int src, int dest ) {
//             this.src = src;
//             this.dest = dest;

//         }
//     }

        // public static void createGraph(ArrayList<edge>[] graph){
        //         for(int i = 0 ; i<graph.length; i++){
        //                 graph[i] = new ArrayList<>();
        //         }

        //         graph[0].add(new edge(0, 2));

        //         graph[1].add(new edge(1, 0));
        //         graph[2].add(new edge(2, 3));
        //         graph[0].add(new edge(3, 0));

        // }
//         public static boolean  detectCycle(ArrayList<edge>[] graph, int curr, boolean[]isVisited, boolean[]rec){
//                 isVisited[curr] = true;
//                 rec[curr] = true;

//                 for(int i =0; i<graph[curr].size(); i++){
//                         edge  e = graph[curr].get(i);

//                         if(rec[e.dest]) {
//                                 return true;
//                         }

//                         else if(!isVisited[e.dest]){
//                                 if(detectCycle(graph,e.dest, isVisited, rec)) {
//                                         return true;
//                                 }
//                         }

//                 }
//                rec[curr] = false;
//                 return false;

//         }
//         public static void main(String[] args) {
//         int v = 4;
//         ArrayList<edge>[] graph = new ArrayList[v];
//         createGraph(graph);
//         boolean[]isVisited = new boolean[v];
//         boolean[] rec = new boolean[v];

//         // for multiplee sub graph

//         for(int i = 0; i < v; i++){
//                 if(!isVisited[i]){
//                         boolean isCycle =detectCycle(graph, 0, isVisited, rec);

//                         if(isCycle){
//                                  System.out.println(isCycle);
//                                  break;
//                         }

//                 }
//         }
//        // System.out.println(detectCycle(graph, 0, isVisited, rec));

//         }
// }

// tropoligcal Sorting

// public class graph{
        // static class edge {
        //         int src;
        //         int dest;

        //         public edge(int src, int dest ) {
        //             this.src = src;
        //             this.dest = dest;

        //         }
        //     }

        //     public static void createGraph(ArrayList<edge>[] graph){
        //         for(int i = 0 ; i<graph.length; i++){
        //                 graph[i] = new ArrayList<>();
        //         }

        //         // graph[0].add(new edge(0, 2));

        //         // graph[1].add(new edge(1, 0));

        //         graph[2].add(new edge(2, 3));
        //         graph[3].add(new edge(3, 1));
        //         graph[4].add(new edge(4, 0));
        //         graph[5].add(new edge(5, 0));
        //         graph[5].add(new edge(5, 2));

        // }
//         public static void  tropoligcalUtil(ArrayList<edge>[] graph, int curr,Stack<Integer> stack ,boolean[]isVisited){
//                 isVisited[curr] = true;

//                 for(int i = 0; i<graph[curr].size();i++){
//                         edge e = graph[curr].get(i);

//                         if(!isVisited[e.dest]){
//                                 tropoligcalUtil(graph, e.dest, stack, isVisited);

//                         }
//                 }
//              stack.push(curr);
//         }

//         public static void tropoligcal(ArrayList<edge>[]  graph, int v){
//                 boolean[] isVisited = new boolean[v];
//                 Stack<Integer> stack = new Stack<Integer>();

//                 for(int i = 0; i<v; i++){
//                         if(!isVisited[i]){
//                                 tropoligcalUtil(graph, i, stack, isVisited);
//                         }
//                 }

//                 while(!stack.isEmpty()){
//                         System.out.print(stack.pop()+" ");
//                 }
//         }
//         public static void main(String[] args) {
//                 int v = 6;
//                 ArrayList<edge> graph[] = new ArrayList[v];

//                 createGraph(graph);
//                 tropoligcal(graph, v);

//         }
// }

// public class graph{
//           static class edge {
//                 int src;
//                 int dest;

//                 public edge(int src, int dest ) {
//                     this.src = src;
//                     this.dest = dest;

//                 }
//             }

//             public static void createGraph(ArrayList<edge>[] graph){
//                 for(int i = 0 ; i<graph.length; i++){
//                         graph[i] = new ArrayList<>();
//                 }

//                 graph[0].add(new edge(0, 1));
//                 graph[0].add(new edge(0, 4));

//                 graph[1].add(new edge(1, 0));
//                 graph[1].add(new edge(1, 2));
//                 // graph[1].add(new edge(1, 4));

//                 graph[2].add(new edge(2, 3));
//                 graph[2].add(new edge(2, 1));

//                 graph[3].add(new edge(3, 2));

//                 graph[4].add(new edge(4, 0));
//                 // graph[4].add(new edge(4, 1));
//                 graph[4].add(new edge(4, 5));

//                 graph[5].add(new edge(5, 4));
//                 // graph[5].add(new edge(5, 2));

//         }
//         public static boolean isCycle(ArrayList<edge> [] graph,int curr,int par, boolean[] isVisited){
//                 isVisited[curr] = true;

//                 for(int i = 0; i<graph[curr].size();i++){
//                         edge e = graph[curr].get(i);
//                                 if(isVisited[e.dest]&&e.dest!=par ) return true;

//                                 else if(!isVisited[e.dest]){
//                                         if(isCycle(graph, e.dest,curr, isVisited)) return true;
//                                 }
//                 }

//                 return false;

//         }
//         public static void main(String[] args) {
//                 int v = 6;
//                 ArrayList<edge>[] graph = new ArrayList[v];
//                 createGraph(graph);
//                 boolean []isVisited = new boolean[v];
//                 System.out.println(isCycle(graph, 0, -1, isVisited));

//         }
// }


// DIJKSTRA ALGO-SHORTEST PATH______________________________________________________________




// public class graph{

//             static class edge {
//                 int src;
//                 int dest;
//                 int wt;

//                 public edge(int src, int dest ,int wt) {
//                     this.src = src;
//                     this.dest = dest;
//                     this.wt = wt;

//                 }
//             }

//             public static void createGraph(ArrayList<edge>[] graph){
//                 for(int i = 0 ; i<graph.length; i++){
//                         graph[i] = new ArrayList<>();
//                 }

// graph[0].add(new edge(0, 1,2));
// graph[0].add(new edge(0, 2,4));

// graph[1].add(new edge(1, 3,7));
// graph[1].add(new edge(1, 2,1));

// graph[2].add(new edge(2, 4,3));

// graph[3].add(new edge(3, 5,1));

// graph[4].add(new edge(4,3,2));

// graph[4].add(new edge(4, 5,5));

//         }
        //    public static class pair implements Comparable<pair> {
        //         int node;
        //         int dist;

        //         public pair(int node, int dist){
        //                 this.node = node;
        //                 this.dist = dist;
        //         }
        //          @Override

        //          public int compareTo(pair p2){
        //                 return this.dist-p2.dist;  // comnaprison based on distanxce
        //          }

//            }

//         public static void dijkstra (ArrayList<edge>[] graph, int src,int V){
//                 PriorityQueue<pair> pq = new PriorityQueue<>();
//                 int[]dist = new int[V];

//                 for(int i = 0; i<V; i++){
//                         if(i!=src){
//                                 dist[i] =Integer.MAX_VALUE;
//                         }
//                 }
//                 boolean[]isVisited = new boolean[V];
//                 pq.add(new pair(0, 0));

//                 while(!pq.isEmpty()){
//                         pair curr = pq.remove();

//                         if(!isVisited[curr.node]) {
//                                 isVisited[curr.node] = true;

//                                 for(int i = 0; i<graph[curr.node].size(); i++){
//                                 edge e = graph[curr.node].get(i);

//                                 int u = e.src;
//                                 int v = e.dest;

//                                if(dist[u]+e.wt<dist[v]) dist[v] = dist[u]+e.wt; // realxation
//                         }

//                         }

//                 }
//                 for(int i = 0; i<V; i++){
//                         System.out.print(dist[i]+" ");
//                 }

//         }
//         public static void main(String[] args) {
//                 int v = 6;
//                 ArrayList<edge>[] graph = new ArrayList[v];
//                 createGraph(graph);

//         }
// }

//BELLMANFPORD ALGO

// public class graph {
//         static class edge {
//                 int src;
//                 int dest;
//                 int wt;

//                 public edge(int src, int dest, int wt) {
//                         this.src = src;
//                         this.dest = dest;
//                         this.wt = wt;

//                 }
//         }

//         public static void createGraph(ArrayList<edge>[] graph) {
//                 for (int i = 0; i < graph.length; i++) {
//                         graph[i] = new ArrayList<>();
//                 }

//                 graph[0].add(new edge(0, 1, 2));
//                 graph[0].add(new edge(0, 2, 4));

//                 graph[1].add(new edge(1, 2, -4));

//                 graph[2].add(new edge(2, 3, 2));

//                 graph[3].add(new edge(3, 4, 4));

//                 graph[4].add(new edge(4,1,-1));
//                 // graph[4].add(new edge(4, 1, -10));

//                 // graph[4].add(new edge(4, 5,5));

//         }

//         public static void BellmanFOrd(ArrayList<edge>[] graph, int src, int V) {
//                 int[] dis = new int[V];

//                 for (int i = 0; i < V; i++) {
//                         if (i != src)
//                                 dis[i] = Integer.MAX_VALUE;

//                 }

//                 for (int k = 0; k < V - 1; k++) {

//                         for (int i = 0; i < V; i++) {
//                                 for (int j = 0; j < graph[i].size(); j++) {
//                                         edge e = graph[i].get(j);

//                                         int u = e.src;
//                                         int v = e.dest;

//                                         if (u != Integer.MAX_VALUE && dis[u] + e.wt < dis[v])
//                                                 dis[v] = dis[u] + e.wt;
//                                 }
//                         }

//                 }
//                 // detect -ve wt cycles---->> UNcomment 640

//                 for (int i = 0; i < V; i++) {
//                         for (int j = 0; j < graph[i].size(); j++) {
//                                 edge e = graph[i].get(j);

//                                 int u = e.src;
//                                 int v = e.dest;

//                                 if (u != Integer.MAX_VALUE && dis[u] + e.wt < dis[v])
//                                        System.out.println("-ve Cycle detedted");
//                         }
//                 }
//                 for (int i = 0; i < dis.length; i++) {
//                         System.out.print(dis[i] + " ");
//                 }
//         }

//         public static void main(String[] args) {
//                 int V = 5;
//                 ArrayList<edge>[] graph = new ArrayList[V];
//                 createGraph(graph);
//                 BellmanFOrd(graph, 0, V);
//         }
// }

// MINNIMUM SPANNIG TREE - pRIMS ALGO

// public class graph{

//          static class edge {
//                 int src;
//                 int dest;
//                 int wt;

//                 public edge(int src, int dest, int wt) {
//                         this.src = src;
//                         this.dest = dest;
//                         this.wt = wt;

//                 }
//         }

//         public static void createGraph(ArrayList<edge>[] graph) {
//                 for (int i = 0; i < graph.length; i++) {
//                         graph[i] = new ArrayList<>();
//                 }

//                 graph[0].add(new edge(0, 1, 10));
//                 graph[0].add(new edge(0, 2, 15));
//                 graph[0].add(new edge(0, 3, 30));

//                 graph[1].add(new edge(1, 0, 10));
//                 graph[1].add(new edge(1, 3, 0));

//                 graph[2].add(new edge(2, 0, 15));
//                 graph[2].add(new edge(2, 3, 50));

//                 graph[3].add(new edge(3, 1, 40));
//                 graph[3].add(new edge(3, 2, 50));

//         }

//         public class pair implements Comparable<pair>{
//                 int node;
//                 int cost;

//                 public pair(int node, int cost){
//                         this.node =node;
//                         this.cost =cost;
//                 }

//                 @Override

//                 public int compareTo(pair p2){
//                         return this.cost - p2.cost;
//         }

//         public static void primsAlgo(ArrayList<edge>[]graph,int V){
//                 PriorityQueue<pair> pq = new PriorityQueue<>(); // NON -MST
//                 boolean[]isVisited =  new boolean[V]; // MST

//                pq.add(new pair(0, 0));

//                 int cost = 0;

//                 while(!pq.isEmpty()){
//                         pair curr = pq.remove();

//                         if(!isVisited[curr.node]){
//                                 isVisited[curr.node] = true;
//                                 cost+=curr.cost;

//                                 for(int i = 0; i<graph[curr.node].size(); i++){
//                                         edge e = graph[curr.node].get(i);

//                                         if(!isVisited[e.dest]){
//                                                 pq.add(new pair(e.dest, e.wt));
//                                         }
//                                 }
//                         }
//                 }
//                 System.out.println("MIN Cost"+cost);

//         }
//         public static void main(String[] args) {
//                 int V = 4;
//                 ArrayList<edge>[]graph = new ArrayList[V];
//                 createGraph(graph);

//         }
//         }
// }

//      KOSARAJU ALGORITHM- STRONGY CONNECTED COMPONENT 

// Error- sout related error

// public class graph {
//         static class edge {
//                 int src;
//                 int dest;

//                 public edge(int src, int des) {
//                         this.src = src;
//                         this.dest = dest;
//                 }
//         }

//         public static void createGraph(ArrayList<edge>[] graph) {
//                 for (int i = 0; i < graph.length; i++) {
//                         graph[i] = new ArrayList<edge>();
//                 }
//                 graph[0].add(new edge(0, 2));
//                 graph[0].add(new edge(0, 3));

//                 graph[1].add(new edge(1, 0));
//                 // graph[1].add(new edge(1, 3));

//                 graph[2].add(new edge(2, 1));
//                 // graph[2].add(new edge(2, 4));

//                 // graph[3].add(new edge(3, 1));
//                 graph[3].add(new edge(3, 4));
//                 // graph[3].add(new edge(3, 5));

//         }

//         public  static void dfs(ArrayList<edge>[] graph, int curr, boolean[]isVisited){
//                 isVisited[curr] = true;
//                 System.out.print(curr+" ");

//                 for(int i =0; i<graph[curr].size(); i++){
//                         edge e = graph[curr].get(i);

//                         if(!isVisited[e.dest]){
//                                 dfs(graph,e.dest, isVisited);

//                         }

//                 }
//         }

//         public static void topsort(ArrayList<edge>[] graph, int curr, boolean[] isVisited, Stack<Integer> st) {
//                 isVisited[curr] = true;

//                 for (int i = 0; i < graph[curr].size(); i++) {
//                         edge e = graph[curr].get(i);
//                         if (!isVisited[e.dest]){
//                                 topsort(graph, e.dest, isVisited, st);
//                         }

//                 }
//                 st.push(curr);
//         }

//         public static void kasaRaju_algo(ArrayList<edge>[] graph, int v) {

//                 // step-1

//                 boolean[] isVisited = new boolean[v];
//                 Stack<Integer> st = new Stack<>();

//                 for (int i = 0; i < v; i++) {
//                         if (!isVisited[i]){
//                                 topsort(graph, i, isVisited, st);
//                         }

//                 }

//                 // step-2

//                 ArrayList<edge>[] tranpose= new ArrayList[v];

//                 for (int i = 0; i < graph.length; i++) {
//                         isVisited[i] = false  ;
//                         tranpose[i] = new ArrayList<edge>();
//                 }

//                 for(int i = 0; i<v; i++){
//                         for(int j = 0; j<graph[i].size(); j++){
//                                 edge e = graph[i].get(j);
//                                 tranpose[e.dest].add(new edge(e.dest, e.src));
//                         }
//                 }

//                 //step -3

//                 while(!st.isEmpty()) {
//                     int curr = st.pop();

//                     if(!isVisited[curr]){
//                         dfs(tranpose,curr,isVisited);
//                         System.out.println();
//                     }
//                 }

//         }

//         public static void main(String[] args) {

//                 int v =5;
//                 ArrayList<edge>[] graph = new ArrayList[v];
//                 createGraph(graph);
//                 kasaRaju_algo(graph, v);

//         }
// }





// BRIDGE IN gRAPH-TARJAN ALGORITHM






// public class graph {
//         static class edge {
//                 int src;
//                 int dest;

//                 public edge(int src, int des) {
//                         this.src = src;
//                         this.dest = dest;
//                 }
//         }

//         public static void createGraph(ArrayList<edge>[] graph) {
//                 for (int i = 0; i < graph.length; i++) {
//                         graph[i] = new ArrayList<edge>();
//                 }
//                 graph[0].add(new edge(0, 1));
//                 graph[0].add(new edge(0, 2));
//                 graph[0].add(new edge(0, 3));

//                 graph[1].add(new edge(1, 0));
//                 graph[1].add(new edge(1, 2));

//                 graph[2].add(new edge(2, 0));
//                 graph[2].add(new edge(2, 1));

//                 graph[3].add(new edge(3, 0));
//                 graph[3].add(new edge(3, 4));
//                 graph[3].add(new edge(3, 5));

//                 graph[4].add(new edge(4, 3));
//                 graph[4].add(new edge(4, 5));

//                 graph[5].add(new edge(5, 3));
//                 graph[5].add(new edge(5, 4));

//         }

//         public static void dfs(ArrayList<edge>[] graph, int curr, boolean[] isVisited, int[] dt, int[] low, int time,int par) {
                        

//                 isVisited[curr] = true;

//                 dt[curr] = low[curr] = ++time;
//                 for (int i = 0; i < graph[curr].size(); i++) {
//                         edge e = graph[curr].get(i);

//                         if (e.dest == par)
//                                 continue;
//                         else if (!isVisited[e.dest]) {
//                                 dfs(graph, e.dest, isVisited, dt, low, time, curr);
//                                 low[curr] = Math.min(low[curr], low[e.dest]);

//                                 if (dt[curr] < low[e.dest]) {
//                                         // System.out.println("Bridge is:- " + curr + "---" + e.dest);
//                                         System.out.println(curr+e.dest);
//                                 }

//                         } else {
//                                 low[curr] = Math.min(low[curr], dt[e.dest]);

//                         }
//                 }

//         }

//         public static void bridge(ArrayList<edge>[] graph, int v) {
//                 int[] dt = new int[v];
//                 int[] low = new int[v];

//                 int time = 0;
//                 boolean[] isVisited = new boolean[v];

//                 for (int i = 0; i < v; i++) {
//                         if (!isVisited[i]) {
//                                 dfs(graph, i, isVisited, dt, low, time, -1);
//                         }
//                 }
//         }

//         public static void main(String[] args) {
//                 int v = 6;
//                 ArrayList<edge>[] graph = new ArrayList[v];
//                 createGraph(graph);
//                 bridge(graph, v);

//         }
// }








//ARTICULATION POINT







public class graph{

        static class edge {
                int src;
                int dest;

                public edge(int src, int des) {
                        this.src = src;
                        this.dest = dest;
                }
        }

        public static void createGraph(ArrayList<edge>[] graph) {
                for (int i = 0; i < graph.length; i++) {
                        graph[i] = new ArrayList<edge>();
                }
                graph[0].add(new edge(0, 1));
                graph[0].add(new edge(0, 2));
                graph[0].add(new edge(0, 3));

                graph[1].add(new edge(1, 0));
                graph[1].add(new edge(1, 2));

                graph[2].add(new edge(2, 0));
                graph[2].add(new edge(2, 1));

                graph[3].add(new edge(3, 0));
                graph[3].add(new edge(3, 4));
                // graph[3].add(new edge(3, 5));

                graph[4].add(new edge(4, 3));
              
        }
        public static void dfs(ArrayList<edge>[] graph ,int curr, int par,int[]dt,int[]low,boolean[]isVisited,int time, boolean[]ap){

                isVisited[curr] = true;
                dt[curr] = low[curr]=++time;
                int child  =0;

                for(int i = 0; i<graph[curr].size();i++){
                        edge e= graph[curr].get(i);
                        int nebr = e.dest;


                        if(nebr==par) {
                                continue;
                        }

                        else if(isVisited[nebr]) {
                                low[curr] =Math.min(low[curr],dt[nebr]);
                        }

                        else{
                                dfs(graph,nebr,curr,dt,low,isVisited,time,ap);
                                
                                low[curr] = Math.min(low[curr],low[nebr]);

                                if(dt[curr]<=low[nebr]  &&par!=-1){
                                         ap[curr] = true ;
                                }
                                child++;
                                

                        }

                }
                if(par==-1&&child>1) {
                        ap[curr] = true ;
                }
               
        }

        public static void getAP( ArrayList<edge>[] graph , int v){
                int[] dt = new int[v];
                int[]low = new int[v];
                int time = 0;
                boolean[]isVisited = new boolean[v];
                boolean[]ap = new boolean[v];

                for(int i = 0; i<v; i++){
                        if(!isVisited[i]){
                                dfs(graph, i, -1, dt, low, isVisited, time, ap);
                                
                        }
                }


                for(int i = 0; i<v; i++){
                        if(ap[i]) {
                                System.out.println("AP : "+i);
                        }
                }
        }

        public static void main(String[] args) {
                int v = 5;
                ArrayList<edge>[] graph = new ArrayList[v];
                createGraph(graph);
                getAP(graph, v);

                
        }
}











































