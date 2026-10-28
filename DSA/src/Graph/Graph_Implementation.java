package Graph;
import java.util.*;
public class Graph_Implementation {
    public static void main(String[] args) {
        SimpleGraph graph = new SimpleGraph();
        graph.addEdge("A", "B");
        graph.addEdge("A", "C");
        graph.addEdge("B", "D");
        graph.addEdge("C", "D");

        System.out.println("Graph Adjacency List:");
        graph.display();
    }
}



class SimpleGraph {
    // Maps each node to a list of its connected neighbors
    private Map<String, List<String>> adjList = new HashMap<>();

    // Adds a vertex to the graph
    public void addVertex(String vertex) {
        adjList.putIfAbsent(vertex, new ArrayList<>());
    }

    // Adds an edge between source and destination (Undirected)
    public void addEdge(String source, String destination) {
        addVertex(source);
        addVertex(destination);
        adjList.get(source).add(destination);
        adjList.get(destination).add(source); // Remove this line for a Directed graph
    }

    // Prints the graph
    public void display() {
        for (String vertex : adjList.keySet()) {
            System.out.println(vertex + " -> " + adjList.get(vertex));
        }
    }

}
