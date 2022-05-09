package com.force.graph;

import edu.princeton.cs.algs4.Graph;

/**
 * 给定的图是否有环
 */
public class Circle {

    private boolean[] marked;
    private boolean hasCircle;

    public Circle(Graph g) {
        marked = new boolean[g.V()];
        for (int i = 0; i < g.V(); i++) {
            if (!marked[i]) {
                dfs(g, i, i);
            }
        }
    }

    public void dfs(Graph g, int v, int u) {
        marked[v] = true;
        for (int i : g.adj(v)) {
            if (!marked[i]) {
                dfs(g, i, v);
            } else if (i != u) { // DFS 回溯时候检查
                hasCircle = true;
            }
        }
    }

    public boolean hasCircle() {
        return hasCircle;
    }
}
