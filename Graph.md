# Graph - 图

## 1. 无向图

* 图是由一组顶点和一组能够将两个顶点相连的边组成的

### 1.1 术语表

当两个顶点通过一条边相连时，我们称这两个顶点是相邻的，并称这条边依附于这两个顶点。某个顶点的度数即为依附于它的边的总数。子图是由一幅图的所有边的一个子集（以及它们所依附的顶点）组成的图。

### 1.2 深度优先搜索

探索迷宫而不迷路的一种古老方法叫做 Tremaux 搜索，它的用法为：
* 选择一条没有标记过的通道，在你走过的路上铺一条绳子；
* 标记所有你第一次路过的路口和通道；
* 当来到一个标记过的路口时，（用绳子）退回到上一个路口；
* 当回退到的路口没有可走通道时，继续回退；

搜索连通图的经典递归算法和 Tremaux 算法类似，但描述起来更简单。在访问其中一个顶点时：
* 将它标记为已访问；
* 递归地访问它所有没被标记过的邻居顶点；

这种方法称为深度优先搜索（DFS）。

```java
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
```

## 有向图

## 加权图

## 加权有向图