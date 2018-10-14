/**
 * Classe Funcionario.
 *
 * @author Maik
 * @author Ricardo
 * @see java.lang.String
 * @version 1.0
 * @since 14/10/2018
 */

 class Funcionario {

     final String nome;
     protected double salario;

     public Funcionario(String nome){
       this.nome = nome;
     }

     @Deprecated public double getSalarioTotal(double bonus) {
         return this.salario + bonus;
     }

     /**
      * Código adicionar bonus no salário
      * @param bonus double
      * @return Retorna o valor com o bonus como double
      */

     public double getTotalSalario(double bonus) {
         return this.salario + bonus;
     }

     /**
      * Código para uma simples Exception
      * @param num1 inteiro
      * @param num2 inteiro
      * @throws java.lang.ArithmeticException caso a divisao seja zero
      * @return Retorna o valor da divisao como double
      */

      public String getSimplesException(double num1, double num2){
        try {
          return String.valueOf(num1 / num2);
        }
        catch (java.lang.ArithmeticException e) {
          return "Divisão é zero";
        }
      }

 }
