package aufgabenblatt2;

public class SiebDesEratosthenes {
    
    
    
    
    public boolean[] siebeAus(int n){
	
	boolean[] felder = new boolean[n];
	int suchGrenze = (int) Math.sqrt(n);
    
	for(int i = 0; i < n; i++){
	    felder[i] = true;
	}

	for(int i = 0; i < suchGrenze; i++){
	    if(felder[i] == true){
		for (int j = 2 ; i*j < n ; j++)
		    felder[i*j] = false;
	    }
	}
	return felder	;
    }

}
