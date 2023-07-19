package teste.services;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

import teste.models.Funcionario;

public class FuncionarioServices {

	public void incrementarSalarios(List<Funcionario> funcionarios) {
		for (Funcionario emp : funcionarios) {
			emp.aumentoSalario();
			System.out.println(emp.toString());
		}
	}

	public void imprimirFuncionarios(List<Funcionario> funcionarios) {
		for (Funcionario emp : funcionarios) {
			System.out.println(emp.toString());
		}
	}

	public void imprimirPorFuncao(List<Funcionario> funcionarios) {
		System.out.println("-----teste 3.6-----");
		HashMap<String, String> map = new HashMap<>();
		for (Funcionario empl : funcionarios) {
			String chave = empl.getFuncao();
			String valor = empl.getNome();

			if (!map.containsKey(chave)) {
				map.put(chave, valor);
			} else {
				map.put(chave, map.get(chave) + ", " + valor);
			}
		}
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
		System.out.println("");
	}

	public void imprimirPorMesDeAniversario(List<Funcionario> funcionarios, int mes) {
		System.out.println("-----teste 3.8-----");
		System.out.println("Aniversariantes do mês " + mes + ":");
		for (Funcionario emp : funcionarios) {
			int month = emp.getDataNascimento().getMonthValue();
			if (month == mes) {
				System.out.println(emp);
			}
		}
		System.out.println("");
	}

	public void imprimirFuncinarioMaisVelho(List<Funcionario> funcionarios) {
		System.out.println("-----teste 3.9-----");
		int idade = 0;
		Funcionario empOlder = new Funcionario();
		for (Funcionario emp : funcionarios) {
			int idadeEmp = Period.between(emp.getDataNascimento(), LocalDate.now()).getYears();
			if(idadeEmp > idade) {
				idade = idadeEmp;
				empOlder = emp;
			}
		}
		System.out.printf("%s%n%s%n%n", "Funcionário mais velho:", "Nome: " + empOlder.getNome() + ", Idade: " + idade);
	}

	public void imprimirEmOrdemAlfabetica(List<Funcionario> funcionarios) {
		System.out.println("-----teste 3.10-----");
		Collections.sort(funcionarios);
		imprimirFuncionarios(funcionarios);
		System.out.println("");
	}

	
	public void somarSalarios(List<Funcionario> funcionarios) {
		System.out.println("-----teste 3.11-----");
		BigDecimal total = new BigDecimal("0.0");
		DecimalFormat df = new DecimalFormat("#,###.00");
		for (Funcionario emp : funcionarios) {
			total = total.add(emp.getSalario());
		}
		
		System.out.printf("%s%n%n", "Total da soma: " + df.format(total));
	}
	
	public void quantosSalariosMinimosCada(List<Funcionario> funcionarios) {
		System.out.println("-----teste 3.12-----");
		BigDecimal salarioMinimo = new BigDecimal("1212.00");
		for (Funcionario emp : funcionarios) {
			BigDecimal quant = emp.getSalario().divide((salarioMinimo), 0, RoundingMode.DOWN);
			System.out.println("Funcionario: " + emp.getNome() + " ganha " + quant + " salário(s) minímo(s).");
		}
	}
}
