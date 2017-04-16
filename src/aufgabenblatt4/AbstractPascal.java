package aufgabenblatt4;


public abstract class  AbstractPascal {
    
    abstract int[] berechneZeile(int n);
    
    
    
    
 // Main fuer test
    public static void main(String[] args) {
	
	AbstractPascal rekursiv = new PascalIterativ();
	AbstractPascal iterativ;
	AbstractPascal schnell;
	
	
	for (int n = 1; n < 15; n++) {
	    int[] zeileN = rekursiv.berechneZeile(n);
	    for (int i : zeileN) {
		System.out.printf("%d\t", i);
	    }
	    System.out.println();
	}

    }

}
