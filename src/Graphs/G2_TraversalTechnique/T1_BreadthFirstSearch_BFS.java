package Graphs.G2_TraversalTechnique;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

public class T1_BreadthFirstSearch_BFS
{
    public ArrayList<Integer> G2_AdjacencyList(int V, ArrayList<ArrayList<Integer>>adj)
    {
        ArrayList<Integer>bfs = new ArrayList<>();
        boolean vis[] = new boolean[V+1];

        for(int i=1; i<=V; i++)
        {
            if(vis[i] == false)
            {
                Queue<Integer> q = new LinkedList<>();
                q.add(i);
                vis[i] = true;

                while(!q.isEmpty())
                {
                    Integer node = q.poll();
                    bfs.add(node);
                    for(Integer it: adj.get(node))
                    {
                        if(vis[it] == false)
                        {
                            vis[it] = true;
                            q.add(it);
                        }
                    }
                }
            }
        }
        return null;
    }
}
