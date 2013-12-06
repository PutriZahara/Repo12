class Motor extends transport{

public void methodRoda(){
	super.methodKendaraan(); // memanggil kelas super
		System.out.println("Motor punya jumlah roda = 2");
	}
	public void methodAksi(){
		System.out.println("Motor dapat melakukan jumping");
	}
	public static void main(String[] args){
		Motor oks = new Motor();
		oks.methodRoda();
		oks.methodAksi();
	}
}
