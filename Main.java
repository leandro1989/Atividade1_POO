package ClassesExercicio1;
import java.util.Scanner;
//import java.util.ArrayList;

public class Main {
	public static void main(String[]args){
		int quantidadeProprietarios, maxCasas,salario, idade, quantidadeCasas, numCasa;
		String nome, cpf;
		
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println("Informe a quantidade de proprietários a serem cadastrados: ");
		quantidadeProprietarios = input.nextInt();
		
		
		maxCasas = (4*quantidadeProprietarios);
		
		Residencia[] casas=new Residencia[maxCasas];
	//Instanciando as casas
		Pessoa[] proprietarios = new Pessoa[quantidadeProprietarios];
		
		for(int i=0;i<(maxCasas);i++){
			casas[i]=new Residencia();
		}
	//Adicionando os proprietarios
		for (int i = 0; i < quantidadeProprietarios ;i++){
			Scanner str = new Scanner(System.in);
			
			System.out.printf("Informe o nome de um proprietário %d: \n",i+1);
			nome = str.nextLine();
			
			System.out.printf("Informe a idade do proprietário %d: \n",i+1);
			idade = input.nextInt();
			
			System.out.printf("Informe o cpf(345.677.897-62) do proprietário %d: \n", i+1);
			cpf = str.nextLine();
			
			System.out.printf("Informe o salario do proprietário %d: \n", i+1);
			salario = input.nextInt();
			
		//Criando o objeto
			proprietarios[i] = new Pessoa(nome,idade,cpf,salario);
			
			System.out.printf("Proprietario %s Criado. \n",nome);
			
			System.out.printf("Informe a quantidade de casa que %s vai adquirir: \n", nome);
			quantidadeCasas = input.nextInt();
			
		//Adicionando as casa aos proprietarios
			for (int j = 0; j < quantidadeCasas; j++){
				System.out.printf("Informe o número(o número não pode passar de %d) da casa a ser adquirida: \n", maxCasas);
				numCasa = input.nextInt();
				if (proprietarios[i].getQuantCasa() == 4){
					System.out.println(nome + " já possui 4 casas.");
				}
				else if (proprietarios[i].proprietarioDaCasa(casas[numCasa-1])) {
					System.out.println(nome + " a casa foi adquirida com sucesso.");
				}
				else {
					System.out.printf(nome +" a Casa %d não esta disponível para aquizição.\n", j);
				}
			}
		}
	}
}
