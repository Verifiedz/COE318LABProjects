/**
 *
 * @author Saad Wasim
 */
package coe318.lab3;
public class Counter {
    //Instance variables here
    private int digit=0; 
    private int mod; 
    private Counter left;
    public Counter(int modulus, Counter left) {
       this.mod = modulus; 
       this.left= left; 
        
    }


    /**
     * @return the modulus
     */
    public int getModulus() {
        return this.mod;
    }

    /**
     * Returns the Counter to the left attached to this
     * Counter.  Returns null if there is no Counter
     * to the left.
     * @return the left
     */
    public Counter getLeft() {
        
        if(left==null) { 
            return null;
        }

        else {
            return left; 
        }
        

    }

    /**
     * @return the digit
     */
    public int getDigit() {
        return digit;
    }

    /**
     * @param digit the digit to set
     */
    public void  setDigit(int digit ) {
        this.digit = digit; 
    }

    /**
     * Increment this counter.  If it rolls over,
     * its left Counter is also incremented if it
     * exists.
     */
    public void increment() {
    
        
        digit++; 
        if (this.mod== digit) {                                 
                                                                  
            digit= 0; 
        
        if (this.left!=null){
                this.left.increment(); 
        }
        }
        
    }

    /** Return the count of this Counter combined
     * with any Counter to its left.
     *
     * @return the count
     */
    public int getCount() {
            
        if (this.left == null) { //operant can not be "=" since its not of Boolean type, it can be only equated using the == for the counter left to be null 

            return digit; 
        }
        else{ 
            return(mod*this.left.getCount() + this.digit);

        }
        }
        
    

    /** Returns a String representation of the Counter's
     * total count (including its left neighbour).
     * @return the String representation
     */
    @Override
    public String toString() {
        //DO NOT MODIFY THIS CODE
        return "" + getCount();
    }

}
