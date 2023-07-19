package teste.main;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

import teste.models.Funcionario;
import teste.services.FuncionarioServices;

public class Program {

	public static void main(String[] args) {
		
		FuncionarioServices service = new FuncionarioServices();

		ArrayList<Funcionario> funcionarios = new ArrayList<Funcionario>();

		//3.1
		funcionarios.add(new Funcionario("Maria", LocalDate.of(2000, 10, 18), new BigDecimal("2009.44"), "Operador"));
		funcionarios.add(new Funcionario("João", LocalDate.of(1990, 05, 12), new BigDecimal("2284.38"), "Operador"));
		funcionarios.add(new Funcionario("Caio", LocalDate.of(1961, 05, 02), new BigDecimal("9836.14"), "Coordenador"));
		funcionarios.add(new Funcionario("Miguel", LocalDate.of(1988, 10, 14), new BigDecimal("19119.88"), "Diretor"));
		funcionarios.add(new Funcionario("Alice", LocalDate.of(1995, 01, 05), new BigDecimal("2234.68"), "Recepcionista"));
		funcionarios.add(new Funcionario("Heitor", LocalDate.of(1999, 11, 19), new BigDecimal("1582.72"), "Operador"));
		funcionarios.add(new Funcionario("Arthur", LocalDate.of(1993, 03, 31), new BigDecimal("4071.84"), "Operador"));
		funcionarios.add(new Funcionario("Laura", LocalDate.of(1994, 07, 8), new BigDecimal("3017.45"), "Gerente"));
		funcionarios.add(new Funcionario("Heloísa", LocalDate.of(2003, 05, 24), new BigDecimal("1606.85"), "Eletricista"));
		funcionarios.add(new Funcionario("Helena", LocalDate.of(1996, 9, 02), new BigDecimal("2799.93"), "Gerente"));

		//3.2
		funcionarios.remove(1);
		
		//3.3
		service.imprimirFuncionarios(funcionarios);
		
		//3.4
		service.incrementarSalarios(funcionarios);
		
		//3.6
		service.imprimirPorFuncao(funcionarios);
		
		//3.8
		service.imprimirPorMesDeAniversario(funcionarios, 10);
		service.imprimirPorMesDeAniversario(funcionarios, 12);
		
		//3.9
		service.imprimirFuncinarioMaisVelho(funcionarios);
		
		//3.10
		service.imprimirEmOrdemAlfabetica(funcionarios);
		
		//3.11
		service.somarSalarios(funcionarios);
		
		//3.12
		service.quantosSalariosMinimosCada(funcionarios);
	}

}
