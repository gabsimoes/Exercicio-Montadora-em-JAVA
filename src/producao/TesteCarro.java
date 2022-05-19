package producao;

import java.util.Scanner;

public class TesteCarro {

	public static void main(String[] args) {
		Carro civic;
		civic = new Carro();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite a marca: ");
		civic.setMarca(sc.nextLine());
		System.out.println("Digite o modelo: ");
		civic.setModelo(sc.nextLine());
		
		System.out.println("Digite a quantidade de passageiros: ");
		civic.setNumPassageiros(sc.nextInt());
		System.out.println("Digite a capacidade de combustível: ");
		civic.setCapacidadeCombustivel(sc.nextDouble());
		System.out.println("Digite o consumo de combustível: ");
		civic.setConsumoCombustivel(sc.nextDouble());
		
		civic.exibirAutonomia();
		
		System.out.println(civic.getMarca());
		System.out.println(civic.getModelo());
		System.out.println(civic.getNumPassageiros());
		System.out.println(civic.getCapacidadeCombustivel());
		System.out.println(civic.getConsumoCombustivel());
	}

}
