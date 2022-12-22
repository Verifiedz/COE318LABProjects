package coe318.Lab6;
public class Node {
    //This class consists of instance variables, a constructor, and a toString() method.
    //instance variable one is node id and instance variable 2 is next node id number
    private int id = 0;
    public int length; 
    private static int nextNode=0; 
    public Node(){
        int sign =  -1; 
        if(id== sign){
        throw new IllegalArgumentException("id can't be negative");
        }
                 
                id = nextNode+1; //need to increment the node at the creation of a new node to change the static nextNode 
                nextNode++;
        }  

 @Override
public String toString(){
    return("Ident#:"+id); 
}


}
