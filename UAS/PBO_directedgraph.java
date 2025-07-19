public class PBO_directedgraph {
    public static void main(String[] args) {
        MasterPBO_directedgraph graf = new MasterPBO_directedgraph();
        
        graf.insertVertex('A');
        graf.insertVertex('B');
        graf.insertVertex('C');
        graf.insertVertex('D');
        graf.insertVertex('E');
        graf.insertVertex('F');
        
        graf.insertEdge('A', 'D');
        graf.insertEdge('A', 'B');
        graf.insertEdge('B', 'A');
        graf.insertEdge('B', 'D');
        graf.insertEdge('D', 'C');
        graf.insertEdge('B', 'C');
        graf.insertEdge('C', 'E');
        graf.insertEdge('E', 'F');
        graf.insertEdge('F', 'F');
        
        System.out.println("Graph: ");
        graf.display();
        
        graf.deleteEdge('E', 'F');
        System.out.println("Setelah E-F dihapus: ");
        graf.display();
        
        graf.deleteVertex('A');
        System.out.println("Setelah vertex A dihapus: ");
        
        graf.display();
        
        System.out.println("Jumlah vertex sekarang: " + graf.length());
    }
}

