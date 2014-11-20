package HA141106;

public class Taschenrechner {
	private Display display;
	private double zahl1;
	private double zahl2;
	private double zahl3;
	private double zahl4;
	private char operation;
	private char zustand = '1';
	private double erg;
	String s = null;

	public void verarbeite(char zeichen) {
		switch (zustand) {
		case '1': // eingabe 1. zahl
			switch (zeichen) {
			case 'c':
				if (zahl1 != 0)
				display.ausgabe(zahl1);
				zahl1 = 0;
				zahl2 = 0;
				erg = 0;
				System.out.println("\n\nC gedrückt - Display leer");
				zustand = 1;

				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				zahl1 = (zahl1 * 10) + zeichen - '0';
				//display.ausgabe(zeichen - '0');
//------------------------------------------------------------------------				
				s = String.valueOf(zahl1);	
				display.strAnzeigen(s);		
				break;				
//------------------------------------------------------------------------			
			
			
			case ',':
				zustand = '4'; // nachkommastelle zahl1!!
				display.ausgabe('.');
				break;
			case '+':
				operation = '+';
				zustand = '2'; // zustand auf plus --> eingabe zahl2
				display.ausgabe(operation);

				break;
			case '-':
				operation = '-';
				zustand = '2'; // zustand auf minus --> eingabe zahl2
				display.ausgabe(operation);
				break;
			case '*':
				operation = '*';
				zustand = '2'; // zustand auf mal --> eingabe zahl2
				display.ausgabe(operation);
				break;
			case '/':
				operation = '/';
				zustand = '2'; // zustand auf div --> eingabe zahl2
				display.ausgabe(operation);
				break;
			case '=':
				System.out.print(" = ");
				display.ausgabe(zahl1);
				
				zustand = '3';
				
			}
			
			break;
		case '2': // eingabe 2.zahl wenn operation + - * / gedrückt wurde
			switch (zeichen) {
			case 'c':
				if (zahl2 != 0)
					display.ausgabe(zahl2);
				zahl1 = 0;
				zahl2 = 0;
				erg = 0;
				System.out.println("\n\nC gedrückt - Display leer");
				zustand = 1;

				break;

			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				zahl2 = (zahl2 * 10) + zeichen - '0';
				display.ausgabe(zeichen - '0');
				break;
			case ',':
				zustand = '5'; // nachkommastelle zahl1!!
				display.ausgabe('.');
				break;
			case '=':
				if (operation == '+') {
					erg = zahl2 + zahl1;
				} else if (operation == '-') {
					erg = zahl1 - zahl2;
				} else if (operation == '*') {
					erg = zahl1 * zahl2;
				} else if (operation == '/' & zahl2 != '0') {
					erg = zahl1 / zahl2;
				}
				System.out.print(" = ");

				display.ausgabe(erg);

				zustand = '3';
				break;
			}
			break;
		case '3':
			zahl3 = 0;
			zahl4 = 0;
			zahl2 = 0;
			zahl1 = erg;
			switch (zeichen) {
			case 'c':
				if (zahl2 != 0)
					display.ausgabe(zahl2);
				zahl1 = 0;
				zahl2 = 0;
				erg = 0;
				System.out.println("\n\nC gedrückt - Display leer");
				zustand = '1';
				break;
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				display.ausgabe('c');
				zahl1 = zeichen - '0';
				display.ausgabe(zeichen - '0');
				zustand = '1';
				break;
			case '+':
				operation = '+';
				zustand = '2'; // zustand auf plus --> eingabe zahl2
				display.ausgabe(operation);

				break;
			case '-':
				operation = '-';
				zustand = '2'; // zustand auf minus --> eingabe zahl2
				display.ausgabe(operation);
				break;
			case '*':
				operation = '*';
				zustand = '2'; // zustand auf mal --> eingabe zahl2
				display.ausgabe(operation);
				break;
			case '/':
				operation = '/';
				zustand = '2'; // zustand auf div --> eingabe zahl2
				display.ausgabe(operation);
				break;

			}
			break;
		case '4':
			switch (zeichen) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				zahl3 = (zahl3 * 10) + zeichen - '0';
				display.ausgabe(zahl3);
				break;

			case '=':
				zustand = '3';
				zahl3 = this.afterComma(zahl3);
				zahl1 = zahl1 + zahl3;
				display.ausgabe(zahl1);

				break;
			case '+':
				operation = '+';
				zustand = '2';
				zahl3 = this.afterComma(zahl3);
				zahl1 = zahl1 + zahl3;
				display.ausgabe(operation);
				break;
			case '-':
				operation = '-';
				zustand = '2';
				zahl3 = this.afterComma(zahl3);
				zahl1 = zahl1 + zahl3;
				display.ausgabe(operation);
				break;
			case '*':
				operation = '*';
				zustand = '2';
				zahl3 = this.afterComma(zahl3);
				zahl1 = zahl1 + zahl3;
				display.ausgabe(operation);
				break;
			case '/':
				operation = '/';
				zustand = '2';
				zahl3 = this.afterComma(zahl3);
				zahl1 = zahl1 + zahl3;
				display.ausgabe(operation);
				break;
			}
			break;
		case '5':

			switch (zeichen) {
			case '0':
			case '1':
			case '2':
			case '3':
			case '4':
			case '5':
			case '6':
			case '7':
			case '8':
			case '9':
				zahl4 = (zahl4 * 10) + zeichen - '0';
				display.ausgabe(zeichen - '0');

				break;

			case '+':
				operation = '+';
				zustand = '2';
				zahl4 = this.afterComma(zahl4);
				zahl2 = zahl2 + zahl4;
				display.ausgabe(zahl2);
				display.ausgabe(operation);
				break;
			case '-':
				operation = '-';
				zustand = '2';
				zahl4 = this.afterComma(zahl4);
				zahl2 = zahl2 + zahl4;
				display.ausgabe(operation);
				break;
			case '*':
				operation = '*';
				zustand = '2';
				zahl4 = this.afterComma(zahl4);
				zahl2 = zahl2 + zahl4;
				display.ausgabe(operation);
				break;
			case '/':
				operation = '/';
				zustand = '2';
				zahl4 = this.afterComma(zahl4);
				zahl2 = zahl2 + zahl4;
				display.ausgabe(operation);
				break;
			case '=':
				zahl4 = this.afterComma(zahl4);
				zahl2 = zahl2 + zahl4;
				if (operation == '+') {
					erg = zahl2 + zahl1;
				} else if (operation == '-') {
					erg = zahl1 - zahl2;
				} else if (operation == '*') {
					erg = zahl1 * zahl2;
				} else if (operation == '/' & zahl2 != '0') {
					erg = zahl1 / zahl2;
				}
				System.out.print(" = ");

				display.ausgabe(erg);
				
				zustand = '3';
				break;
				
			}
			
			break;
			
		}

	}

	public void setDisplay(Display display) {
		this.display = display;
	}

	private double afterComma(double zahl) {
		int hilfe = 1;
		double comma = 0;
		for (int i = 1; i <= Math.log10(zahl) + 1; i++) {
			hilfe = hilfe * 10;
		}
		zahl = zahl / hilfe;
		comma = zahl;
		return comma;
	}

}
