package HA141106;

public class Display {

	public void ausgabe(double zahl) {
		switch ((int) zahl) { // welchen wert hat die zahl //nur vorkommastelle
								// da es keine 1,4 taste gibt!!
		case 99: // wenn zahl char99 (wenn char zeichen gedrückt wird diese in
					// den asciicode umgewandelt) 99=c
			System.out.println("\n_______________________________\n");
			break;
		case 42: // wenn *
			System.out.print(" * ");
			break;
		case 43: // wenn +
			System.out.print(" + ");
			break;
		case 45: // wenn -
			System.out.print(" - ");
			break;
		case 47: // wenn /
			System.out.print(" / ");
			break;
		case 46: // wenn komma
			System.out.print(".");
			break;
		default: // alles andere
			if (zahl - (int) zahl != 0) { // prüfe ob es nachkommastellen gibt
											// (2.0 - (int)2.0 (=2) == 0 -->
											// keine nachkommastelle somit kann
											// .0 weggecastet werden)
				System.out.print(zahl); // wenn 2.3 - 2 != 0 --> nachkommastele
										// vorhanden, wird zahl als double
										// ausgegeben
			} else
				System.out.print((int) zahl); // siehe if wird als int also ohne
												// .0 ausgegeben

		}
	}

}
