package HA141106;

public class TSim {

	public static void main(String[] args) {

		// //------------------------------------Objekte / Tasten /
		// Taschenrechner / Display
		// anlegen------------------------------------------------------
		Taschenrechner t = new Taschenrechner(); // t = neuer Taschenrechner
													// namens t
		t.setDisplay(new Display()); // t hat ein Display

		Taste t0 = new Taste(); // anlegen einer Taste namens t0
		t0.setZeichen('0'); // welchen wert hat die Taste / was steht drauf
		t0.setTaschenrechner(t); // gebe der Taste den Taschenrechner

		Taste t1 = new Taste();
		t1.setZeichen('1');
		t1.setTaschenrechner(t);

		Taste t2 = new Taste();
		t2.setZeichen('2');
		t2.setTaschenrechner(t);

		Taste t3 = new Taste();
		t3.setZeichen('3');
		t3.setTaschenrechner(t);

		Taste t4 = new Taste();
		t4.setZeichen('4');
		t4.setTaschenrechner(t);

		Taste t5 = new Taste();
		t5.setZeichen('5');
		t5.setTaschenrechner(t);

		Taste t6 = new Taste();
		t6.setZeichen('6');
		t6.setTaschenrechner(t);

		Taste t7 = new Taste();
		t7.setZeichen('7');
		t7.setTaschenrechner(t);

		Taste t8 = new Taste();
		t8.setZeichen('8');
		t8.setTaschenrechner(t);

		Taste t9 = new Taste();
		t9.setZeichen('9');
		t9.setTaschenrechner(t);

		Taste tplus = new Taste();
		tplus.setZeichen('+');
		tplus.setTaschenrechner(t);

		Taste tminus = new Taste();
		tminus.setZeichen('-');
		tminus.setTaschenrechner(t);

		Taste tmal = new Taste();
		tmal.setZeichen('*');
		tmal.setTaschenrechner(t);

		Taste tdiv = new Taste();
		tdiv.setZeichen('/');
		tdiv.setTaschenrechner(t);

		Taste tgleich = new Taste();
		tgleich.setZeichen('=');
		tgleich.setTaschenrechner(t);

		Taste tc = new Taste();
		tc.setZeichen('c');
		tc.setTaschenrechner(t);

		Taste tpunkt = new Taste();
		tpunkt.setZeichen(',');
		tpunkt.setTaschenrechner(t);
		// --------------------------------simulation----------------------------

		t1.druecken();
		t0.druecken();
		t3.druecken();	
		tpunkt.druecken();
		t4.druecken();
		
		tplus.druecken();
		t8.druecken();
		t3.druecken();
		tpunkt.druecken();
		t2.druecken();
		t4.druecken();
		tgleich.druecken();		
		tmal.druecken();
		t3.druecken();
		tgleich.druecken();
		t2.druecken();
		tpunkt.druecken();
		t1.druecken();
		tminus.druecken();
		t8.druecken();
		tgleich.druecken();
		tdiv.druecken();
		t8.druecken();
		tgleich.druecken();
		tc.druecken();
		
		}

}
