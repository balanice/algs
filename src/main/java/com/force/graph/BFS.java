package com.force.graph;

import edu.princeton.cs.algs4.Graph;
import edu.princeton.cs.algs4.Queue;

/**
 * 广度优先搜索
 */
public class BFS extends Search {
    private int[] edgeTo;
    private int s;

    public BFS(Graph g, int s) {
        super(g, s);
        marked = new boolean[g.V()];
        edgeTo = new int[g.V()];
        this.s = s;
        bfs(g, s);
    }

    private void bfs(Graph g, int s) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(s);
        while (!queue.isEmpty()) {
            int i = queue.dequeue();
            for (int j : g.adj(i)) {
                if (!marked[j]) {
                    marked[j] = true;
                    edgeTo[j] = i;
                    queue.enqueue(j);
                    count++;
                }
            }
        }
    }

    public boolean marked(int v) {
        return marked[v];
    }

    public Iterable<Integer> pathTo(int v) {
        Queue<Integer> queue = new Queue<>();
        if (!marked(v)) {
            return queue;
        }
        for (int i = v; i != s; i = edgeTo[i]) {
            queue.enqueue(i);
        }
        queue.enqueue(s);
        return queue;
    }

    @Override
    public int getCount() {
        return count;
    }
}
