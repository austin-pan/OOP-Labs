package logic;
public class PropVar extends Wff {
     private String propVar;

     public PropVar(String str) {
         this.propVar = str;
     }
     
     @Override
     public boolean eval(Valuation val) {
    	 return val.get(this);
     }

     @Override
     public String toString() {
         return propVar;
     }
}