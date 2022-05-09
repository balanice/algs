package com.force.graph;

import edu.princeton.cs.algs4.Graph;

/**
 * 深度优先搜索，遍历图的所有点，从起点开始，递归遍历它所有的邻接点
 */
public class DFS {

    private boolean[] marked;
    private int count;

    public DFS(Graph graph, int v) {
        marked = new boolean[graph.V()];
        dfs(graph, v);
    }

    private void dfs(Graph graph, int v) {
        marked[v] = true;
        for (int w : graph.adj(v)) {
            if (!isMarked(w)) {
                dfs(graph, w);
            }
        }
    }

    private boolean isMarked(int v) {
        return marked[v];
    }

    public int count() {
        return count;
    }
}
