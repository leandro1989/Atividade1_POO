package ClassesExercicio1;
import java.util.Scanner;

public class Main {
	public static void main(String[]args){
		int quantidadeProprietarios, quantidadeCasas;
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Informe a quantidade de proprietarios a serem cadastrados: ");
		quantidadeProprietarios = input.nextInt();
		
		quantidadeCasas = 4*quantidadeProprietarios;
		
		Residencia[] casas=new Residencia[quantidadeCasas];
	//Instanciando as casas
		for(int i=0;i<(quantidadeCasas);i++){
			casas[i]=new Residencia();
		}
	//Testando o Código
		
		Pessoa pessoa1=new Pessoa("Márcio",21,"345.677.897-62",1500);
		Pessoa pessoa2=new Pessoa("Ricardo",25,"333.444.666-77",940);
		Pessoa pessoa3=new Pessoa("Pedro",25,"333.444.666-77",940);
		
		pessoa1.proprietarioDaCasa(casas[0]);
		pessoa1.proprietarioDaCasa(casas[1]);
		pessoa1.proprietarioDaCasa(casas[2]);
		pessoa1.proprietarioDaCasa(casas[3]);
		pessoa1.proprietarioDaCasa(casas[5]);
		pessoa2.proprietarioDaCasa(casas[4]);
		pessoa3.alugarCasa(casas[0]);
		pessoa2.alugarCasa(casas[1]);
		pessoa3.alugarCasa(casas[1]);
		
		System.out.println(casas[0].getProprietario()); //Retorna o nome do inquilino
		System.out.println(casas[0].getInquilino()); //Retorna a quantidade de casas alugadas
	//Fim do teste
	}
}
