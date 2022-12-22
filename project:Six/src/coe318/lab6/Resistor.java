package coe318.Lab6; 
public class Resistor {
    private Node n1; 
    private Node n2; 
    private double resistance; 
    private static int nextR=0; 
public Resistor(double resistance, Node node1, Node node2){
this.resistance = resistance; 
n1=node1; 
n2 =node2;
            resistance = nextR +1; 
            nextR++; 
      
 if (resistance<0) {
throw new IllegalArgumentException("resistance can't be negative");
}
    if(n1 == null || n2 == null){ 
        throw new IllegalArgumentException("nodes cant be null");
    }
}


public Node [] getNodes(){
Node[] theNodes = {n1, n2};
         
        return theNodes; 
} 
@Override
public String toString(){
    return("R"+nextR + ":"+n1+","+n2+","+resistance);
}
}




