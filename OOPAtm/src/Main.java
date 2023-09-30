
//Atm projesinin çalıştığı Class!

public class Main {

	public static void main(String[] args) {
		
		Hesap hesap = new Hesap("Werther","ahmetnt55",15000.0);
		
		ATM atm = new ATM();
		atm.çalış(hesap);
		
		System.out.println("Programdan çıkılıyor");

	}

}
