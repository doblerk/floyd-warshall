import java.util.Arrays;


public class FloydWarshall {

    public static void runAlgorithm(int A[][]) {
        int[][] d = new int[4][4];
        for (int i=0; i < A.length; i++) {
            for (int j=0; j < A.length; j++ ) {
                if (A[i][j] == 1 && i != j) {
                    d[i][j] = A[i][j];
                } else {
                    if (i == j) {
                        d[i][j] = 0;
                    } else {
                        d[i][j] = 1000;
                    }
                }
            }
        
        for (int k=0; k < A.length; k++) {
            for (int l=0; l < A.length; l++) {
                for (int m=0; m < A.length; m++) {
                    if (d[l][k] + d[k][m] < d[i][m]) {
                        d[i][m] = d[i][k] + d[k][m];
                    }
                }
            }
        }

        for (int[] row : d) {
            System.out.println(Arrays.toString(row));
        }
        }
    }

    public static void main(String[] args) {

        // Create adjacency matrix
        int A[][] = {{0, 1, 1, 0},
                     {1, 0, 1, 1},
                     {1, 1, 0, 0},
                     {0, 1, 0, 0}};
        
        // Initialize weighted graph
        WeightedGraph graph = new WeightedGraph(5);
        graph.addWeightedEdge(1, 2, 1);
        graph.addWeightedEdge(1, 3, 7);
        graph.addWeightedEdge(2, 3, 5);
        graph.addWeightedEdge(2, 4, 2);
        graph.printGraph();

        // run algorithm
        FloydWarshall.runAlgorithm(graph.adjacencyMatrix);

    }

}
