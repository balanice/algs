package com.force.graph;

import edu.princeton.cs.algs4.Graph;

public abstract class Search {

    int count;
    boolean[] marked;

    public Search(Graph g, int v) {}

    /**
     * 
     * @return 与v连通的顶点数量
     */
    public abstract int getCount();

    /**
     * 
     * @param w 顶点w
     * @return 顶点w是否与顶点v连通
     */
    public abstract boolean marked(int w);
}
