
//Hesap isimli objemizin içindeki bilgileri ayarlayan çağıran ve onlara gerekli işlevleri tanımlayan 
//banka hesabımızı oluşturan Class

public class Hesap {

	private String kullancı_adı;  //HESAP Nesnenin 1. Özelliği
	private String sifre;		  //HESAP Nesnenin 2. Özelliği	
	private double bakiye;		  //HESAP Nesnenin 3. Özelliği	
	
	
	public Hesap(String kullancı_adı, String sifre, double bakiye) {
	
		this.kullancı_adı = kullancı_adı;
		this.sifre = sifre;
		this.bakiye = bakiye;
	}

	public String getKullancı_adı() {
		return kullancı_adı;
	}

	public void setKullancı_adı(String kullancı_adı) {
		this.kullancı_adı = kullancı_adı;
	}

	public String getSifre() {
		return sifre;
	}

	public void setSifre(String sifre) {
		this.sifre = sifre;
	}

	public double getBakiye() {
		return bakiye;
	}

	public void setBakiye(double bakiye) {
		this.bakiye = bakiye;
	}
	public void paraYatır(double miktar) {
		
		bakiye +=miktar;
		System.out.println("Yeni Bakiyeniz:"+ this.bakiye);
		
	}
	public void paraÇek(double miktar) {
		
		if(miktar > bakiye) {
			
			System.out.println("İstenilen Miktar Bakiyenizde Mevcut Değildir!..");
			
		}else if (miktar > 1500 ) {
			
			System.out.println("Bir Günde Atmden En Fazla 1500TL Çekilebilir..");
			
		}else {
			
			bakiye-=miktar;
			System.out.println("Yeni Bakiyeniz:"+this.bakiye);
			
		}
		
	}
	
	
}
