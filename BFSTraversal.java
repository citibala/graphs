
package algorithms.graphs;

import java.util.Iterator;
import java.util.LinkedList;

public class BFSTraversal {
	private static int v = 6;
	private LinkedList<Integer> adj[];

	void bfsTraversal(int node) {
		boolean visited[] = new boolean[v];
		LinkedList<Integer> queue = new LinkedList<Integer>();
		visited[node] = true;
		queue.add(node);
		while (queue.size() != 0) {
			node = queue.poll();
			System.out.print(node + " ");
			Iterator<Integer> itr = adj[node].listIterator();
			while (itr.hasNext()) {
				int tempNode = itr.next();
				if (!visited[tempNode]) {
					visited[tempNode] = true;
					queue.add(tempNode);
				}
			}
		}
	}

	void addEdge(int start, int end) {
		adj[start].add(end);
	}

	public static void main(String args[]) {
		BFSTraversal obj = new BFSTraversal();
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

		System.out.println("Breadth First Traversal of a Graph:\n");
		obj.bfsTraversal(3);
	}
}
