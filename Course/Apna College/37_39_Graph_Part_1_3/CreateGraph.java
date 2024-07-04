import java.util.*;

public class CreateGraph {
    static class Edge {
        int src;
        int dest;
        int wt;

        public Edge(int s, int d, int w) {
            this.src = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<Edge>> graph = new ArrayList<>();
        for (int i = 0; i < V; i++) {
            graph.add(new ArrayList<>());
        }

        graph.get(0).add(new Edge(0, 1, 5));

        graph.get(1).add(new Edge(1, 0, 5));
        graph.get(1).add(new Edge(1, 2, 1));
        graph.get(1).add(new Edge(1, 3, 3));

        graph.get(2).add(new Edge(2, 1, 1));
        graph.get(2).add(new Edge(2, 3, 1));
        graph.get(2).add(new Edge(2, 4, 4));

        graph.get(3).add(new Edge(3, 1, 3));
        graph.get(3).add(new Edge(3, 2, 1));

        graph.get(4).add(new Edge(4, 2, 2));

        for (int i = 0; i < graph.get(2).size(); i++) {
            Edge e = graph.get(2).get(i);
            System.out.println("Destination: " + e.dest + ", Weight: " + e.wt);
        }
    }
}
