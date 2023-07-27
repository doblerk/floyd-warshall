public class WeightedGraph {

      public int adjacencyMatrix[][];

      private int vertexCount;

      public WeightedGraph(int vertexCount) {

            this.vertexCount = vertexCount;

            adjacencyMatrix = new int[vertexCount][vertexCount];

      }


      public void addWeightedEdge(int i, int j, int k) {

            if (i > 0 && i < vertexCount && j > 0 && j < vertexCount) {

                  adjacencyMatrix[i][j] = k;

                  adjacencyMatrix[j][i] = k;

            }

      }


      public void removeWeightedEdge(int i, int j) {

            if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount) {

                  adjacencyMatrix[i][j] = 0;

                  adjacencyMatrix[j][i] = 0;

            }

      }

 
      public boolean isEdge(int i, int j) {

            if (i >= 0 && i < vertexCount && j > 0 && j < vertexCount)
                if (adjacencyMatrix[i][j] > 0) {
                    return true;
                } 
                else { 
                    return false;
                }
            else
                  return false;

      }


      public void printGraph(){

            for (int i = 0; i < vertexCount ; i++) {
                for (int j = 0; j < vertexCount ; j++) {
                    if (adjacencyMatrix[i][j] > 0 || adjacencyMatrix[j][i] > 0) {
                        System.out.println("vertex-" + i + " is connected to " + "vertex-" + j +
                            " with weight " + adjacencyMatrix[i][j]);
                    }
                    
                }
            }
        }


      public static void main(String[] args) {

        WeightedGraph graph = new WeightedGraph(5);
        graph.addWeightedEdge(1, 2, 1);
        graph.addWeightedEdge(1, 3, 7);
        graph.addWeightedEdge(2, 3, 5);
        graph.addWeightedEdge(2, 4, 2);
        graph.printGraph();
        
      }

}


