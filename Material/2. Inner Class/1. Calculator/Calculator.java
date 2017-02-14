/* OBJECT CALCULATOR */
class Calculator {
	
	// Class Operasi not init yet
	private Operasi opr;
	
	Calculator() { // Construct
		opr = new Operasi();
	}
	
	Operasi getOpr() {
		return opr;
	}
	
	// Init Operasi class
	class Operasi {
		Operasi() { // Construct
		}
		
		int tambah(int x,int y) {
			return (x+y);
		}
		
		int kurang(int x,int y) {
			return (x-y);
		}
		
		int kali(int x,int y) {
			return (x*y);
		}
		
		int bagi(int x,int y) {
			if (y > 0) { 
				return (x/y);
			} else {
				return -999999;
			}
		}
		
	}
}