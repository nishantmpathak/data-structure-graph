package com.interview;

import com.interview.graph.Graph;

public class Main {

    public static void main(String[] args) {

        Graph g = new Graph(6);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(4, 5);
        g.Dfs();
    }
}
