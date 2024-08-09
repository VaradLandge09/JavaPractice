package Graphs;
import java.util.*;

public class Graph1 {

    public static void addEdge(List<List<Integer>> graph, int source, int dest) {
        graph.get(source).add(dest);
        graph.get(dest).add(source);
        // if(graph.get(source) == null) {
        //     List<Integer> al = new ArrayList<>();
        //     al.add(dest);
        //     graph.add(al);
        // } else {
        //     List<Integer> l = graph.get(source);
        //     l.add(dest);
        //     graph.set(source, l);
        // }
    }
    public static void main(String[] args) {
        int V = 4;
        List<List<Integer>> graph = new ArrayList<>();

        for(int i=0; i<V; i++) {
            graph.add(new ArrayList<>());
        }

        addEdge(graph, 0, 1);
        addEdge(graph, 1, 2);
        addEdge(graph, 2, 3);
        addEdge(graph, 3, 1);
        System.out.println(graph);
        // int a = 0;
        // for(List<Integer> l: graph) {
        //     System.out.print(a + " = ");
        //     for(int i: l) {
        //         System.out.print(i + " ");
        //     }
        //     System.out.println();
        //     a++;
        // }
        
    }
}
