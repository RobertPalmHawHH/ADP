package aufgabenblatt4;

public class PascalRekursiv implements InterfacePascal{


    public int[] berechneZeile(int zeile)
	{
		int[] pascal = new int[zeile];

		for (int reihe = 0; reihe < zeile; reihe++)
		{
			zaehler++;
			pascal[reihe] = function_pascal(zeile - 1, reihe);

		}

		return pascal;
	}
    
    public int function_pascal(int zeile, int spalte)
	{
		if (spalte == 0 || spalte == zeile)
		{
			return 1;
		}
		zaehler++;
		return function_pascal(zeile - 1, spalte)
				+ function_pascal(zeile - 1, spalte - 1);
	}



public void setZaehler(int zaehler) {
	this.zaehler = zaehler;
	
}

public int getZaehler() {

	return zaehler;
}}
