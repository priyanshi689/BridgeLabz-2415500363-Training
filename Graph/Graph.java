public class Graph {
    int[][] matrix;

    Graph(int vertex){
        matrix = new int[vertex][vertex];
    }
    public void addEdge(int s,int d){
        matrix[s][d] = 1;
        matrix[d][s]=1;
    }

    public void print(){
        for (int i = 0; i < matrix.length; i++) {
            for(int j=0 ; j<matrix.length ;j++){
                System.out.print(matrix[i][j]+" ");
            }
          System.out.println();  
        }
    }
    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(0,1);
        g.addEdge(1,2 );
        g.addEdge(2, 4);
        g.addEdge(3, 1);

        g.print();

    }
    
}
