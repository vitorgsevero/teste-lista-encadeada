
public class ListaEncadeada {

    private ListaNo head;
    private ListaNo tail;
    
    public void append(int dado){ //Insere no final da lista
    	
    	
    	
    }
    public void addFirst(int dado){ //Insere no in�cio da lista
    	
    	
    	
    }

    public boolean temValor(int dado){
		return false;
    }

    public void print(int value){
        ListaNo node = this.head;
        while (node != null) {
        System.out.println(node.getDado());
        node = node.next(); //Avan�a ao segundo elemento da lista 
    }
    	
    }

}
