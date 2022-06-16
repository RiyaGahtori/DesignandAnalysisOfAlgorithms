/*
1  2
2  3
2  4
3  4
5  3
1  3
1  5
-------
=> 0
   1 - 2, 3, 5
   2 - 1, 3, 4
   3 - 2, 4, 5, 1
   4 - 2, 3
   5 - 1, 3
 */

package Graphs.GraphRepresentation_in_Java;
import java.util.ArrayList;

public class GR2_AdjacencyList {
    public static void main(String[] args)
    {
        int n = 3, m = 3;
        ArrayList<ArrayList<Integer>>adj = new ArrayList<ArrayList<Integer>>();

        for(int i = 0; i<=n; i++)
            adj.add(new ArrayList<Integer>());

/*      edge 1--2
        adj.get(1).add(2); //get ArrayList at index 1 and add 2 to it
        adj.get(2).add(1);
 */
        // edge 2--3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // edge 1--3
        adj.get(1).add(3);
        adj.get(3).add(1);

        for(int i = 1; i<n; i++)
            for(int j = 0; j<adj.get(i).size(); j++){
                System.out.print(adj.get(i).get(j)+" ");
            }
        System.out.println();
    }
}
