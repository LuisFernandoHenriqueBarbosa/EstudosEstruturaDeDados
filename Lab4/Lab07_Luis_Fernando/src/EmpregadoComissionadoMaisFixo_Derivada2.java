// ------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : COMPOSIÇÃO E HERANÇA em JAVA
// Ano/S: 2024/1S
// ------------------------------------
 
// EmpregadoComissionadoMaisFixo_Derivada2 herda de EmpregadoComissionado_Base2 e tem
// acesso a membros protected de CommissionEmployee2.
// ----------------------------------------------------------------------------------

public class EmpregadoComissionadoMaisFixo_Derivada2 extends EmpregadoComissionado_Base2
{
   // atributos
   private double salarioFixo; // salário-base por semana

   // construtor de seis argumentos
   public EmpregadoComissionadoMaisFixo_Derivada2(
           String argNome,
           String argSobrenome,
           String argCpf,
           double argVendasBrutas,
           double argTaxaComissao,
           double argSalarioFixo )
   {
      super( argNome, argSobrenome, argCpf, argVendasBrutas, argTaxaComissao );
      setSalarioFixo( argSalarioFixo ); // valida e armazena salário-base
   } // fim do construtor
   
   // configura o salário-base                                    
   public void setSalarioFixo( double argSalarioFixo )
   {
      salarioFixo = ( argSalarioFixo < 0.0 ) ? 0.0 : argSalarioFixo;
   } // fim do método setSalarioFixo                         

   // retorna o salário-base                                   
   public double getSalarioFixo()
   {
      return salarioFixo;
   } // fim do método getSalarioFixo                            

   // calcula os lucros                 
   public double vencimentos()
   {
      return salarioFixo + ( taxaComissao * vendasBrutas );
   } // fim do método vencimentos              
   @Override
   // retorna a representação String do objeto
   public String toString()
   {
      return String.format(                                           
         "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f",           
         "Empregado comissionado + fixo", nome, sobrenome,    
         "CPF", cpf,              
         "Vendas brutas", vendasBrutas,
         "Taxa de comissao", taxaComissao,
         "Vencimento fixo", salarioFixo );                                 
   } // fim do método toString
   
} // fim da classe


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Fig. 9.10: BasePlusCommissionEmployee3.java                            *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *************************************************************************/