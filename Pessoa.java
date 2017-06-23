package ClassesExercicio1;

public class Pessoa {
	private int idade, numeroCasas=0;
	private String nome, cpf;
	private double salario;
	
	public Pessoa(){
		this.nome = null;
		this.idade = 0;
		this.cpf = null;
		this.salario = 0;
	}
	
	public Pessoa(String nome,int idade,String cpf,double salario){
		this.nome=nome;
		this.idade=idade;
		this.cpf=cpf;
		this.salario=salario;
	}
	
	public int getQuantCasa() {
		return numeroCasas;
	}

	public void setQuantCasa() {
		this.numeroCasas = this.numeroCasas+1;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	//Metodo que permite cada proprietario adiquirir no max 4 casas.
	public boolean proprietarioDaCasa(Residencia casa){
		if(this.numeroCasas<4){
			if(casa.getComprarCasa()){
				this.numeroCasas++;
				casa.adquirirCasa(this.nome);
				return true;
			}
			else {
				return false;
			}
		}
		return false;
	}
	//Metodo para a casa ser alugada no max uma vez. 
	public void alugarCasa(Residencia casa){
		if(casa.getStatusCasa()){
			casa.alugar(this.nome);
			System.out.println(this.nome + " a casa foi alugada com sucesso.");
		}
		else {
			System.out.println(this.nome+ " a casa não esta disponível para alugar. Pois esta alugada a "+casa.getInquilino()+'.');	
		}
	}	
}