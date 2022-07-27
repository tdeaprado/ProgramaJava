import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Listas {

	public static void main(String[] args) {
		
		
		List<Empregado> empregados = new ArrayList<>();
		
		Scanner in = new Scanner (System.in);
		
		System.out.println("Digite o numero de funcionários:");
		int num = in.nextInt();
		
		for (int i =0 ; i<num ; i++) {
			System.out.printf("Empregado %d: %n",i+1);
			
			System.out.println("Nome:");
			String name = in.nextLine();
			
			System.out.println("ID:");
			int id = in.nextInt();
			
			System.out.println("Salario:");
			double salario = in.nextDouble();
			
			Empregado emp = new Empregado (id,name,salario);
			
			empregados.add(emp);
			
		}
		
		System.out.println("Entre o ID do empregado que terá aumento:");
		int idsalario = in.nextInt();
		
		Integer pos = position(empregados,idsalario);
		
		
		in.close();
		

		
		
		for (Empregado emps : empregados)
		{
			System.out.println(emps);
		}

	}

	public static Integer position(List <Empregado> emp,int id)
	{
		for (int i=0; i< emp.size();i++) {
			if (emp.get(i).getId()== id)
				return i;
		}
		return -1;
	}
	
	// comments
}
