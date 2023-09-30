
//ATM projesinin giriş kısmını yapabilmek için girişi sağlayacak kodların bulunduğu
//ve bize true false döndüren bir giriş(login) yaptırıcı methodun bulunduğu Class

import java.util.Scanner;

public class Login {

	public boolean login(Hesap hesap) {

		Scanner scan = new Scanner(System.in);

		String kullanıcı_adı;
		String sifre;

		System.out.print("Kullanıcı adı:");
		kullanıcı_adı = scan.nextLine();
		System.out.print("        Sifre:");
		sifre = scan.nextLine();

		if (hesap.getKullancı_adı().equals(kullanıcı_adı) && hesap.getSifre().equals(sifre)) {

			return true;

		} else {

			return false;

		}

	}

}
