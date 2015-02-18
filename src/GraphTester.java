import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Matt on 2/6/2015.
 */
public class GraphTester {

    public static void main(String[] args) {
        System.out.println("This is a the graph tester.");

        Vertex v1 = new Vertex("A");
        Vertex v2 = new Vertex("B");
        Vertex v3 = new Vertex("C");
        Vertex v4 = new Vertex("D");
        Vertex v5 = new Vertex("E");
        Vertex v6 = new Vertex("F");
        Vertex v7 = new Vertex("G");
        Set<Vertex> nodes = new HashSet<Vertex>();
        nodes.add(v1);
        nodes.add(v2);
        nodes.add(v3);
        nodes.add(v4);
        nodes.add(v5);
        nodes.add(v6);
        nodes.add(v7);
        Set<Edge> edges = new HashSet<Edge>();
        edges.add( new Edge (v1, v2, 3));
        edges.add( new Edge (v1, v4, 6));
        edges.add( new Edge (v2, v4, 2));
        edges.add( new Edge (v1, v3, 1));
        edges.add( new Edge (v4, v3, 7));
        edges.add( new Edge (v3, v6, 4));
        edges.add( new Edge (v4, v6, 2));
        edges.add( new Edge (v7, v6, 9));
        edges.add( new Edge (v4, v7, 3));
        edges.add( new Edge (v5, v7, 6));
        edges.add( new Edge (v5, v4, 7));
        edges.add( new Edge (v2, v5, 8));






        Graph g = new MyGraph(nodes, edges);
        Collection<Vertex> r = g.reachableVertices(v1);



    }
}

