package ClassesExercicio1;

public class Residencia {
	private double area;
	private String posFrente, posEsquina, inquilino, proprietario;
	private boolean disponibilidadeCasaAluguar, comprarCasa;
	
	public Residencia(){
		this.area=0;
		this.posFrente=null;
		this.posEsquina=null;
		this.disponibilidadeCasaAluguar = true;
		this.comprarCasa = true;
		this.proprietario = "";
	}
	
	public Residencia(double area,String posFrente,String posEsquina){
		this.area=area;
		this.posFrente=posFrente;
		this.posEsquina=posEsquina;
		this.disponibilidadeCasaAluguar = true;
		this.comprarCasa = true;
		this.proprietario = "";
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	public String getPosFrente() {
		return posFrente;
	}

	public void setPosFrente(String posFrente) {
		this.posFrente = posFrente;
	}

	public String getPosEsquina() {
		return posEsquina;
	}

	public void setPosEsquina(String posEsquina) {
		this.posEsquina = posEsquina;
	}
	
	public boolean getStatusCasa() {
		return disponibilidadeCasaAluguar;
	}
	
	public String getInquilino(){
		return inquilino;
	}
	
	public boolean getComprarCasa() {
		return comprarCasa;
	}
	
	public String getProprietario(){
		return proprietario;
	}
	
	public boolean adquirirCasa(String proprietario){
		if (this.comprarCasa){
			this.proprietario = proprietario;
			this.comprarCasa = false;
			return true;
		}
		return false;
	}

	public void alugar(String inquilino) {
		if(this.disponibilidadeCasaAluguar){
			this.disponibilidadeCasaAluguar = false;
			this.inquilino=inquilino;
		}
	}
}
