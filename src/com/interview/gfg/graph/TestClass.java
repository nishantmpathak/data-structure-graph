package com.interview.gfg.graph;

public class TestClass {

    public static void main(String[] args) {
        Graph graph = new Graph(6);
        graph.addEdge(0,1);
        graph.addEdge(0,4);
        graph.addEdge(0,2);
        graph.addEdge(1,3);
        graph.addEdge(2,1);
        graph.addEdge(2,3);
        graph.addEdge(4,2);
        graph.addEdge(3,4);
        graph.addEdge(3,5);
        graph.addEdge(5,0);
        graph.printGraph();
//        System.out.println("\n BFS ");
//        graph.BFS();
       System.out.println("\n DFS");
        graph.DFS(3);
    }
}
