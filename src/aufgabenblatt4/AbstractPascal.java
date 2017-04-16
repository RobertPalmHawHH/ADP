package aufgabenblatt4;


public abstract class  AbstractPascal {
    
    abstract int[] berechneZeile(int n);
    
    
    
    
 // Main fuer test
    public static void main(String[] args) {
	
	AbstractPascal rekursiv = new PascalRekursiv();
	AbstractPascal iterativ;
	AbstractPascal schnell;
	
	
	for (int k = 1; k < 15; k++) {
	    int[] zeileN = rekursiv.berechneZeile(k);
	    for (int i : zeileN) {
		System.out.printf("%d\t", i);
	    }
	    System.out.println();
	}

    }

}
