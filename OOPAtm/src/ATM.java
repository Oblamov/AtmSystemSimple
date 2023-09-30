
//ATM projesinde çalıştırılacak olan her türlü kodu bir
//methoda toplayıp main kısmında çalıştırdığımız sınıfımız

import java.util.Scanner;

public class ATM {

	public void çalış(Hesap hesap) {

		Login login = new Login();
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("Bankamıza Hoş Geldiniz.");
		System.out.println("************************\n");
		System.out.println("Kullanıcı Girişi");
		System.out.println("************************\n");
		
		int giris_hak = 3; 
		
		while (true) {
			
			if(login.login(hesap)) {
				
				System.out.println("Giriş Başarılı Program Başlatılıyor..");
				break;
				
			}else {
				
				System.out.println("!!Giriş Yapılamadı!!");
				
				giris_hak -= 1;
				System.out.println("Kalan Giriş Hakkınız:"+giris_hak);
				
			}if(giris_hak ==0) {
				
				System.out.println("Giriş Hakkınızı Doldurdunuz Sistemden Çıkılıyor!..");
				return;
			}
			
		}
		System.out.println("*******************************************");
		String islemler = "1.Bakiye Gör\n"
						+ "2.Para Yatır\n"
						+ "3.Para Çek\n"
						+ "4.Çıkış İçin Q'ya Basınız";
		System.out.println(islemler);
		System.out.println("*******************************************");
		
		while(true) {
		System.out.print("İşlemi Seçiniz:");
		String işlem = scan.nextLine();
		
		if(işlem.equals("Q")) {
			
			break;
			
		}else if(işlem.equals("1")) {
			
			System.out.println("Bakiyeniz:"+hesap.getBakiye());
			
		}else if(işlem.equals("2"))	{
			
			System.out.print("Hesabınıza Yatırmak İstediğiniz Miktarı Giriniz:");
			double miktar = scan.nextDouble();
			scan.nextLine();
			hesap.paraYatır(miktar);
		}else if(işlem.equals("3")) {
			
			System.out.println("Hesabınızdan Çekmek İstedğiniz Miktarı Giriniz:");
			double miktar = scan.nextDouble();
			scan.nextLine();
			hesap.paraÇek(miktar);
			
			
		}else {
			
			System.out.println("Yanlış İşlem Tuşlandı");
		}
			
		}
	}

}
