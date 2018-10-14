/**
 * Programa principal.
 *
 * @author Maik
 * @author Ricardo
 * @version 1.0
 * @since 02/10/2018
 */

public class Trabalho {
  public static void main(String args[]){

    Funcionario obj1 = new Funcionario("Maik");

    System.out.printf("Funcionário: %s\n", obj1.nome);

    obj1.salario = 10.0;

    System.out.printf("Salario s/ Bonus: %.2f\n", obj1.salario);

    System.out.printf("Salario c/ Bonus: %.2f\n", obj1.getSalarioTotal(10.0));
    System.out.printf("Salario c/ Bonus: %.2f\n", obj1.getTotalSalario(10.0));

  }
}
