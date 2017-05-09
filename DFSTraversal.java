
package algorithms.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class DFSTraversal {
	private static int v = 6;
	private LinkedList<Integer> adj[];

	void dfsTraversal(int node, boolean[]visited) {
		visited[node] = true;
        System.out.print(node+" ");
        Iterator<Integer> itr = adj[node].listIterator();
        while (itr.hasNext())
        {
            int tempNode = itr.next();
            if (!visited[tempNode])
            dfsTraversal(tempNode, visited);
        }
	}

	void addEdge(int start, int end) {
		adj[start].add(end);
	}

	public static void main(String args[]) {
		DFSTraversal obj = new DFSTraversal();
		obj.adj = new LinkedList[v];
		for (int i = 0; i < v; ++i)
			obj.adj[i] = new LinkedList<>();
		obj.addEdge(0, 1);
		obj.addEdge(0, 3);
		obj.addEdge(1, 2);
		obj.addEdge(1, 0);
		obj.addEdge(2, 4);
		obj.addEdge(2, 1);
		obj.addEdge(4, 5);
		obj.addEdge(4, 2);
		obj.addEdge(4, 3);
		obj.addEdge(5, 4);
		obj.addEdge(3, 4);
		obj.addEdge(3, 0);

		System.out.println("Depth First Traversal of a Graph:\n");
		boolean visited[] = new boolean[v];
		obj.dfsTraversal(3,visited);
	}
}
