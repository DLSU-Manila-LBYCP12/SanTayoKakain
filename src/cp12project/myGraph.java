package cp12project;

import java.util.Arrays;

class myGraph implements Graph { // Graph: Adjacency matrix
   private int[][] matrix; // The edge matrix
   private int numEdge; // Number of edges
   public String[] Mark; // The mark array

   public myGraph(int n){ // Constructor
       Mark = new String[n];
       matrix = new int[n][n];
       numEdge= 0;
   }

   public int n(){ 
        return Mark.length; 
   }  

   public int e(){ 
        return numEdge; 
   }
   
   public String showProfiles(){
	   return Arrays.toString(Mark);
   }
   
   public void showMatrix(){
	   for(int i=0; i<50; i++){
		   for(int j=0; j<50; j++){
			   System.out.printf("%d \n", matrix[i][j]);
		   }		   
	   }
   }
   
   public Edge first(int v){ // Get the first edge for a vertex
     for (int i=0; i<Mark.length; i++)
        if (matrix[v][i] != 0)
            return new myEdge(v, i);
     return null; // No edge for this vertex
   }

   public Edge next(Edge w){ // Get next edge for a vertex
     if (w == null) 
        return null;
     for (int i=w.v2()+1; i<Mark.length; i++)
        if (matrix[w.v1()][i] != 0)
            return new myEdge(w.v1(), i);
      return null; // No next edge;
   }

   public boolean isEdge(Edge w){ // True if this is an edge
      if (w == null) return false;
      else return matrix[w.v1()][w.v2()] != 0;
   }

   public boolean isEdge(int i, int j)// True if this is an edge
   { 
      return matrix[i][j] != 0;
   }

   public int v1(Edge w)// Where edge comes from
   { 
      return w.v1(); 
   }

   public int v2(Edge w)// Where edge goes to
   { 
      return w.v2(); 
   }

   // Set edge weight
   public void setEdge(int i, int j, int wt){
       if(wt!=0){
       matrix[i][j] = wt;
       matrix[j][i] = wt;
       numEdge++;
       }
   }
 
   // Set edge weight
   public void setEdge(Edge w, int weight){
   if (w != null)
       setEdge(w.v1(), w.v2(), weight);
   	   setEdge(w.v2(), w.v1(), weight);
   }

   public void delEdge(Edge w){ // Delete edge w
    if (w != null)
      if (matrix[w.v1()][w.v2()] != 0) {
         matrix[w.v1()][w.v2()] = 0;
         matrix[w.v2()][w.v1()] = 0;
         numEdge--;
       }
   }

   public void delEdge(int i, int j){ // Delete edge (i, j)
    if (matrix[i][j] != 0) {
        matrix[i][j] = 0;
        matrix[j][i] = 0;
        numEdge--;
    }
   }

   public int weight(int i, int j){ // Return weight of edge
     if (matrix[i][j] == 0) return Integer.MAX_VALUE;
     else return matrix[i][j];
   }

   public int weight(Edge w){ // Return weight of edge
      if (w == null ) return -1; //ERROR 
         if (matrix[w.v1()][w.v2()] == 0) return Integer.MAX_VALUE;
         else 
           return matrix[w.v1()][w.v2()];
     
   }
   
   public void getNeighbors(String val){ //return neighbors
	   int x = getIndex(val);
	   			 System.out.println("The neighbors of " + val + " are: ");
		   for(int y=0; y<Mark.length; y++){
			   if(matrix[x][y] != 0){
				 System.out.println(Mark[y]);
			   }
	   }
   }

    public void setMark(int v, String val){
         Mark[v] = val;
    } // Set Mark

    public String getMark(int v){ 
          return Mark[v]; 
    } // Get Mark
    
    public int getIndex(String val){
    	  return Arrays.asList(Mark).indexOf(val);  
      // Get Index
    }
}
