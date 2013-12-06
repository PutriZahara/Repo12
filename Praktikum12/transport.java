class transport{
	public void methodKendaraan(){
		System.out.println("Kendaraan punya Roda.Kemudi(stang).dan Sadel");
	}
	public void methodAksi(){
		System.out.println("Kendaraan dapat berjalan dan dapat mengerem");
	}
	public static void main(String[] args){
	transport oks = new transport();
	oks.methodKendaraan();
	oks.methodAksi();
	}
}