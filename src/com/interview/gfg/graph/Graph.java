package com.interview.gfg.graph;

import java.util.*;

public class Graph {
    private ArrayList<ArrayList<Integer>> nodes;
    private int size;
    public Graph(int size){
        nodes = new ArrayList<>(size);
        this.size = size;
        for(int i =0;i<size;i++){
            nodes.add(new ArrayList<Integer>());
        }
    }

    public void addEdge(int initialNode, int finalNode){
        validateNode(initialNode, finalNode);
        nodes.get(initialNode).add(finalNode);
    }

    private void validateNode(int initialNode, int finalNode) {
        if(initialNode>=size || finalNode>=size){
            throw new InvalidNodeEnteredException();
        }
    }

    public void printGraph(){
        for(int i =0;i<size;i++){
            var adjacentNodes = nodes.get(i);
            System.out.print("\n on node "+i+" ");
            for(int j=0;j<adjacentNodes.size();j++){
                System.out.print("->"+adjacentNodes.get(j));
            }
        }
    }

    public void BFS(){
        Queue<Integer> q = new LinkedList<Integer>();
        boolean[] visited = new boolean[size];
        visited[0] = true;
        q.add(0);
        while(!q.isEmpty()){
            Integer curr = q.poll();
            System.out.println(curr+" ");
            List<Integer> adjacent = nodes.get(curr);
            Iterator<Integer> itr = adjacent.iterator();
            while(itr.hasNext()){
                Integer adjacentNode = itr.next();
                if(!visited[adjacentNode]){
                    q.add(adjacentNode);
                    visited[adjacentNode] = true;
                }
            }
        }
    }

    public void DFS(int initialNode){
        boolean[] visitedNodes = new boolean[size];
        System.out.println("DFS for initial node "+initialNode+" is");
        DFSUtil(initialNode, visitedNodes);
    }

    private void DFSUtil(int initialNode, boolean[] visitedNodes) {
        visitedNodes[initialNode] = true;
        System.out.println(initialNode);
        ArrayList<Integer> adjacentNodes = nodes.get(initialNode);
        Iterator<Integer> itr = adjacentNodes.iterator();
        if(itr.hasNext()){
            int curr = itr.next();
            if(!visitedNodes[curr]){
                DFSUtil(curr, visitedNodes);
            }
        }
    }
}
