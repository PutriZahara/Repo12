public class Segitiga{
	private double alas;
	private double tinggi;
	
public Segitiga(){
	alas = 0;
	tinggi = 0;
}
private double luas(double a, double t){
	return ((a*t)/2);
}
public void setAlas(double alas){
	this.alas=alas;
}
public void setTinggi(double tinggi){
	this.tinggi=tinggi;
}
public double getAlas(){
	return alas;
}
public double getTinggi(){
	return tinggi;
}
public double getLuas(){
	return luas(alas, tinggi);
	}
}