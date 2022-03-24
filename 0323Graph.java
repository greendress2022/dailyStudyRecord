package graph;

import java.util.ArrayList;
import java.util.Arrays;

public class Graph {
    //store vertex in the arraylist
    private ArrayList<String> vertexList;
    //store edges
    private int[][]edges;
    private int numOfEdges;

    public static void main(String[] args) {
        int n = 5;
        String Vertexes[] ={"a","b","c","d","e"};
        Graph graph = new Graph(n);
        //add vertex
        for(String vertex: Vertexes){
            graph.insertVertex(vertex);
        }
        //add edges, a-b,a-c,b-c,b-d,b-e
        graph.insertEdge(0,1,1);
        graph.insertEdge(0,2,1);
        graph.insertEdge(1,2,1);
        graph.insertEdge(1,3,1);
        graph.insertEdge(1,4,1);
        //show matrix
        graph.show();

    }

    public Graph(int n){
        //initiate matrix and arraylist
        edges = new int[n][n];
        vertexList = new ArrayList<String>(n);
        numOfEdges = 0;
        //not sure about numofedges so default 0
    }
    //insert a vertex
    public void insertVertex(String vertex){
        vertexList.add(vertex);

    }
    //add edges

    /**
     *
     * @param v1 index of first vertex
     * @param v2 index of second vertex
     * @param weight link
     */
    public void insertEdge(int v1, int v2, int weight){
        edges[v1][v2] = weight;
        edges[v2][v1] = weight;
        numOfEdges++;
    }

    public int getNumOfEdges() {
        return numOfEdges;
    }
    public int getNumOfVertex(){
        return vertexList.size();
    }
    //return index i data- 0->'A'
    public String getValueByIndex(int i){
        return vertexList.get(i);
    }
    public int getWeight(int v1,int v2)
    {
        return edges[v1][v2]; //?
    }
    //show the matrix of the graph, 4 new concepts!
    public void show(){
        for(int[]link : edges){
            System.err.println(Arrays.toString(link));
        }
    }


}
