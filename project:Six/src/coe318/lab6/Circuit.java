package coe318.Lab6;
import java.util.ArrayList;
public class Circuit{ 
    private static Circuit instance =null; 
  private ArrayList<Resistor> resistors = new ArrayList<Resistor>(); 
private Circuit(){

}
 public static Circuit getInstance() {
if (instance == null)
{ instance = new Circuit();
}
return instance;
}
public void add(Resistor r){
     resistors.add(r);

}
@Override
public String toString(){
 String listR = "\n List of Resistors:\n"; 
        for (Resistor resistor : resistors){
            listR = listR + "\n"+resistor.toString(); 
        } return listR; 
} 
public static void main(String[] args){
  Node x = new Node(); 
  Node y = new Node(); 
System.out.println(x.toString());
System.out.println(y.toString());
  Resistor n = new Resistor(50, x, y); 
  System.out.println(n.toString());
  n.getNodes();
  Node a = new Node(); 
  Node b = new Node(); 
  System.out.println(a.toString());
  System.out.println(b.toString());
  Resistor s = new Resistor(100, a, b); 
  System.out.println(s.toString());
  s.getNodes();
  Node c = new Node(); 
  Node d = new Node(); 
  System.out.println(c.toString());
  System.out.println(d.toString());
  Resistor h = new Resistor(30, c, d); 
  System.out.println(h.toString());
  h.getNodes();
  Circuit circuit = new Circuit(); 
  circuit.add(n); 
  circuit.add(s); 
  circuit.add(h); 
  System.out.println("\n  thecircuit\n ---------------");
System.out.println(circuit.toString());
  


}




}