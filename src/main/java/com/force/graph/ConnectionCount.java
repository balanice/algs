package com.force.graph;

import edu.princeton.cs.algs4.Graph;

/**
 * 处理一张图的连通分量
 */
public class ConnectionCount {

    private boolean[] marked;
    private int[] id;
    private int count;

    public ConnectionCount(Graph g) {
        marked = new boolean[g.V()];
        id = new int[g.V()];
        for (int i = 0; i < g.V(); i++) {
            if (!marked[i]) {
                count++;
                dfs(g, i);
            }
        }
    }

    private void dfs(Graph g, int v) {
        marked[v] = true;
        id[v] = count;
        for (int w : g.adj(v)) {
            if (!marked[w]) {
                dfs(g, w);
            }
        }
    }

    public boolean connected(int v, int w) {
        return id[v] == id[w];
    }

    public int count() {
        return count;
    }
}
