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
		String[] eins={	"        ",
					"        ",
					"   /\\   ",
					"  |  |  ",
					"  |  |  ",
					"   \\/   ",
					"   /\\   ",
					"  |  |  ",
					"  |  |  ",
					"   \\/   ",
					"        "};
	
	String[] zwei={	"    ____     ",
					"   /    \\    ",
					"   \\____/\\   ",
					"       |  |  ",
					"    ___|  |  ",
					"   /    \\/   ",
					"  /\\____/    ",
					" |  |        ",
					" |  |___     ",
					"  \\/    \\    ",
					"   \\____/    "};
	String[] drei={	"   ____     ",
					"  /    \\    ",
					"  \\____/\\   ",
					"      |  |  ",
					"   ___|  |  ",
					"  /    \\/   ",
					"  \\____/\\   ",
					"      |  |  ",
					"   ___|  |  ",
					"  /    \\/   ",
					"  \\____/    "};
	String[] vier={	"            ",
					"            ",
					" /\\    /\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					"  \\____/\\   ",
					"      |  |  ",
					"      |  |  ",
					"       \\/   ",
					"            "};
	String[] fuenf={"   ____     ",
					"  /    \\    ",
					" /\\____/    ",
					"|  |        ",
					"|  |___     ",
					" \\/    \\    ",
					"  \\____/\\   ",
					"      |  |  ",
					"   ___|  |  ",
					"  /    \\/   ",
					"  \\____/    "};
	String[] sechs={"   ____     ",
					"  /    \\    ",
					" /\\____/    ",
					"|  |        ",
					"|  |___     ",
					" \\/    \\    ",
					" /\\____/\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					"  \\____/    "};
	String[] sieben={	"   ____     ",
						"  /    \\    ",
						"  \\____/\\   ",
						"      |  |  ",
						"      |  |  ",
						"       \\/   ",
						"       /\\   ",
						"      |  |  ",
						"      |  |  ",
						"       \\/   ",
						"            "};
	String[] acht={	"   ____     ",
					"  /    \\    ",
					" /\\____/\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					" /\\____/\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					"  \\____/    "};
	String[] neun={	"   ____     ",
					"  /    \\    ",
					" /\\____/\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					"  \\____/\\   ",
					"      |  |  ",
					"   ___|  |  ",
					"  /    \\/   ",
					"  \\____/    "};
	String[] zero={	"   ____     ",
					"  /    \\    ",
					" /\\____/\\   ",
					"|  |  |  |  ",
					"|  |  |  |  ",
					" \\/    \\/   ",
					" /\\    /\\   ",
					"|  |  |  |  ",
					"|  |__|  |  ",
					" \\/    \\/   ",
					"  \\____/    "};
	String[] punkt={"   ",
					"   ",
					"   ",
					"   ",
					"   ",
					"   ",
					"   ",
					"   ",
					"   ",
					"## ",
					"## "};
	String[] plus={	"          ",
					"          ",
					"          ",
					"    #     ",
					"    #     ",
					" ######## ",
					"    #     ",
					"    #     ",
					"          ",
					"          ",
					"          "};
	String[] minus={"          ",
					"          ",
					"          ",
					"          ",
					"          ",
					" #######  ",
					"          ",
					"          ",
					"          ",
					"          ",
					"          "};
	String[] mal={	"       ",
					"       ",
					"       ",
					" #   # ",
					"  # #  ",
					"   #   ",
					"  # #  ",
					" #   # ",
					"       ",
					"       ",
					"       "};
	String[] geteilt={	"      ",
						"      ",
						"      ",
						"  ##  ",
						"  ##  ",
						"      ",
						"  ##  ",
						"  ##  ",
						"      ",
						"      ",
						"      "};
	String[] gleich={	"         ",
						"         ",
						"         ",
						"         ",
						" ####### ",
						"         ",
						" ####### ",
						"         ",
						"         ",
						"         ",
						"         "};
	
		public void strAnzeigen(String str){
			for (int i=0;i<eins.length;i++){
				for (int j=0;j<str.length();j++){
					switch (str.charAt(j)){
					case '1':
						System.out.print(eins[i]);
						
						break;
					case '2':
						System.out.print(zwei[i]);
						break;
					case '3':
						System.out.print(drei[i]);
						
						break;
					case '4':
						System.out.print(vier[i]);
						break;
					case '5':
						System.out.print(fuenf[i]);
						break;
					case '6':
						System.out.print(sechs[i]);
						break;
					case '7':
						System.out.print(sieben[i]);
						break;
					case '8':
						System.out.print(acht[i]);
						break;
					case '9':
						System.out.print(neun[i]);
						break;
					case '0':
						System.out.print(zero[i]);
						
						break;
					case '.':
					case ',':
						System.out.print(punkt[i]);
						break;
					case '+':
						System.out.print(plus[i]);
						break;
					case '-':
						System.out.print(minus[i]);
						break;
					case '*':
						System.out.print(mal[i]);
						break;
					case '/':
						System.out.print(geteilt[i]);
						break;
					case '=':
						System.out.print(gleich[i]);
						break;
						
					}
					
				}System.out.println();
				
				
				}
			
			}
		

		
	}


