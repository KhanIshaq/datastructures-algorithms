package com.ishaqkhan.dsa.graph;

public class Main {

    public static void main(String[] args) {
        MyGraph myGraph = new MyGraph();
        myGraph.addVertex("W");
        myGraph.addVertex("X");
        myGraph.addVertex("Y");
        myGraph.addVertex("Z");

        myGraph.addEdge("W","X");
        myGraph.addEdge("W","Y");
        myGraph.addEdge("W","Z");
        myGraph.addEdge("X","Z");
        myGraph.addEdge("Y","Z");
        myGraph.printGraph();

        myGraph.removeVertex("Z");
        myGraph.printGraph();
    }
}
