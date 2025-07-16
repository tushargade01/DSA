import java.util.*;
class Graph{
    private HashMap<String, ArrayList<String>> adjList = new HashMap<>();
    
    void printGraph(){
        System.out.println(adjList);
    }
    boolean addVertex(String vertex){
        if(adjList.get(vertex) == null){
            adjList.put(vertex,new ArrayList<String>());
            return true;
        }
        return false;
    }
    boolean addEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null){
            adjList.get(vertex1).add(vertex2);
            adjList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }
    boolean removeEdge(String vertex1, String vertex2){
        if(adjList.get(vertex1) != null && adjList.get(vertex2) != null){
            adjList.get(vertex1).remove(vertex2);
            adjList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }
    boolean removeVertex(String vertex){
        if(adjList.get(vertex) == null) return false;
        for(String otherVertex : adjList.get(vertex)){
            adjList.get(otherVertex).remove(vertex);
        }
        adjList.remove(vertex);
        return true;
    }
}
public class example {
    public static void main(String[] args){
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.printGraph();
        graph.removeEdge("B", "C");
        graph.printGraph();
        graph.removeVertex("A");
        graph.printGraph();
    }
}
