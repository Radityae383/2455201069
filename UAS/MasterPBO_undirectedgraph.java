public class MasterPBO_undirectedgraph {
    final int MAX_ELEMENTS = 50;
    private double data[][] = new double [MAX_ELEMENTS][MAX_ELEMENTS];
    private char label[] = new char [MAX_ELEMENTS];
    private int jumVertex;
    
    public  MasterPBO_undirectedgraph(){
        jumVertex = 0;
    }
    private int find(char labelVertex){
        for(int j = 0; j < jumVertex; j++)
            if(label[j] == labelVertex)
                return j;
        
        return -1;
    }
    public void insertVertex(char labelVertex){
        if(jumVertex ==  MAX_ELEMENTS -1){
            System.out.println("Array sudah penuh");
            return;
        }
        if(find(labelVertex) > -1){
            System.out.println("Label " + labelVertex + " sudah ada");
            return;
        }
        for(int j = 0; j <= jumVertex; j++){
            data[j][jumVertex] = 0;
            data[jumVertex][j] = 0;
        }
        label[jumVertex] = labelVertex;
        jumVertex++;
    }
    public void deleteVertex(char labelVertex){
        if(jumVertex == 0){
            System.out.println("Tak ada vertex");
            return;
        }
        int pos = find(labelVertex);
        if(pos == -1){
            System.out.println("Tak ada vertex");
            return;
        }
        if(pos < jumVertex){
            for(int j = pos; j < jumVertex; j++){
                for(int k = 0; k < jumVertex; k++)
                data[j][k] = data[j+1][k];
            label[j] = label[j+1];
        }
        for(int j = pos; j < jumVertex -1; j++){
            for(int k = 0; k < jumVertex; k++)
                data[k][j] = data[k][j+1];
        }
    }
    jumVertex--;
}
    public void insertEdge(char vertex1, char vertex2){
        int pos1 = find(vertex1);
        int pos2 = find(vertex2);
        if((pos1 == -1) || (pos2 == -1)){
            System.out.println("Ada vertex yang tidak dikenal");
            return;
        }
        data[pos1][pos2] = 1;
        data[pos2][pos1] = 1;
}
    public void deleteEdge(char vertex1, char vertex2){
        int pos1 = find(vertex1);
        int pos2 = find(vertex2);
        if((pos1 == -1) || (pos2 == -1)){
            System.out.println("Ada vertex yang tidak dikenal");
            return;
        }
        if(data[pos1][pos2] == 0){
            System.out.println(vertex1 + " dan " + vertex2 + " tak punya garis");
            return;
        }
        data[pos1][pos2] = 0;
        data[pos2][pos1] = 0;
}
    public long length(){
    return jumVertex;
}
    public void display(){
        for(int j = 0; j < jumVertex; j++)
            for(int k = 0; k <= j; k++)
                if(data[j][k] == 1)
                   System.out.print(label[j] + "-" + label[k] + " ");
                   System.out.println(); 
    }
}
