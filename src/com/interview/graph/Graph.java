package com.interview.graph;

import java.util.Iterator;
import java.util.LinkedList;

public class Graph {

    public int v;

    public LinkedList<Integer> adj[];

    public Graph(int v){
        this.v = v;
        adj = new LinkedList[v];
        for(int i=0;i<v;i++){
            adj[i] = new LinkedList<>();
        }
    }

    public void addEdge(int v, int w){
        adj[v].add(w);
    }

    public void DfsTraversal(int v, boolean[] visited){

        visited[v] = true;
        System.out.println(v);

        Iterator<Integer> i = adj[v].iterator();
        while(i.hasNext()){
            var num = i.next();
            if(!visited[num]){
                DfsTraversal(num, visited);
            }
        }
    }

    public void Dfs(){
        boolean[] visited = new boolean[v];

        for(int i = 0 ; i< v ; i++){
            if (visited[i] == false)
                DfsTraversal(i, visited);
        }
    }
}
