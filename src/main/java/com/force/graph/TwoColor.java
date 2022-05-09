package com.force.graph;

import edu.princeton.cs.algs4.Graph;

/**
 * 能够用两种颜色将图的所有顶点着色，使得任意一条边两端的顶点颜色都不相同，这个问题也等价于：这是一个二分图吗
 * 
 */
public class TwoColor {

    private boolean[] marked;
    private boolean[] colors;
    private boolean isTwoColors = true;

    public TwoColor(Graph g) {
        marked = new boolean[g.V()];
        colors = new boolean[g.V()];
        for (int i = 0; i < g.V(); i++) {
            if (!marked[i]) {
                dfs(g, i);
            }
        }
    }

    private void dfs(Graph g, int v) {
        marked[v] = true;
        for (int w : g.adj(v)) {
            if (!marked[w]) {
                colors[w] = !colors[v];
                dfs(g, w);
            } else if (colors[w] == colors[v]) {
                isTwoColors = false;
            }
        }
    }

    public boolean isTwoColors() {
        return isTwoColors;
    }
}
