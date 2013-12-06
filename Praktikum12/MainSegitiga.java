public class MainSegitiga {
	public static void main(String [] args){
		Segitiga sg = new Segitiga();
		sg.setAlas(10);
		sg.setTinggi(12);
		System.out.println("Alas :"+ sg.getAlas());
		System.out.println("Tinggi :"+ sg.getTinggi());
		System.out.println("Luas :"+ sg.getLuas());
	}
}