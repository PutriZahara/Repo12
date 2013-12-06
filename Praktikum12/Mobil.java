class Mobil extends transport{

public void methodRoda(){
	super.methodKendaraan(); // memanggil kelas super
		System.out.println("mobil punya jumlah roda = 4");
	}
	public void methodAksi(){
		System.out.println("mobil dapat bergerak mundur");
	}
	public static void main(String[] args){
		Mobil oks = new Mobil();
		oks.methodRoda();
		oks.methodAksi();
	}
}
