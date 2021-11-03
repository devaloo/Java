public class GraphImplementation {
    public static void main(String[] args) {
    
        // Undirected Graph using Adjacency List
        /*
        * Input
        * ----------------------
        * n - nodes, m - edges |
        * ----------------------
        * 1  2  (edge between nodes 1 & 2)
        * 3  6  (w) [weights - optional]
        * 4  2
        * 6  5
        * ....... (m lines)
        * */

        int n = 3, m=3;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<ArrayList<Integer>>();
        for(int i=0; i<=n; i++)
            adj.add(new ArrayList<Integer>());

        // Edge 1  2
        adj.get(1).add(2);
        adj.get(2).add(1);

        // Edge 2  3
        adj.get(2).add(3);
        adj.get(3).add(2);

        // Edge 1  3
        adj.get(1).add(3);
        adj.get(3).add(1);

        // Printing edges
        for(int i=1; i<=n; i++) {
            for(int j=0; j<adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }

    }
