// ------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : COMPOSIÇÃO E HERANÇA em JAVA
// Ano/S: 2024/1S
// ------------------------------------
 
// Classe EmpregadoComissionado2 representa um empregado APENAS comissionado
// -------------------------------------------------------------------------

public class EmpregadoComissionado_Base2
{
   // atributos
   protected String nome;                              
   protected String sobrenome;                               
   protected String cpf;                   
   protected double vendasBrutas; // vendas brutas semanais       
   protected double taxaComissao; // porcentagem da comissão

   // construtor de cinco argumentos
   public EmpregadoComissionado_Base2(
           String argNome,
           String argSobrenome,
           String argCpf,
           double argVendasBrutas,
           double argTaxaComissao )
   {
      // chamada implícita para o construtor Object ocorre aqui              
      nome = argNome;
      sobrenome = argSobrenome;
      cpf = argCpf;
      setVendasBrutas( argVendasBrutas ); // valida e armazena as vendas brutas       
      setTaxaComissao( argTaxaComissao ); // valida e armazena a taxa de comissão
   } // fim do construtor

   // configura o nome 
   public void setNome( String argNome )
   {
      nome = argNome;
   } // fim do método setNome 

   // retorna o nome
   public String getNome()
   {
      return nome;
   } // fim do método getNome

   // configura o sobrenome 
   public void setSobrenome( String argSobrenome )
   {
      sobrenome = argSobrenome;
   } // fim do método setSobrenome 

   // retorna o sobrenome
   public String getSobrenome()
   {
      return sobrenome;
   } // fim do método getSobrenome

   // configura o CPF
   public void setCPF( String argCpf )
   {
      cpf = argCpf; // deve validar
   } // fim do método setCPF

   // retorna o CPF
   public String getCPF()
   {
      return cpf;
   } // fim do método getCPF 

   // configura a quantidade de vendas brutas
   public void setVendasBrutas( double argVendasBrutas )
   {
      vendasBrutas = ( argVendasBrutas < 0.0 ) ? 0.0 : argVendasBrutas;
   } // fim do método setVendasBrutas 

   // retorna a quantidade de vendas brutas 
   public double getVendasBrutas()
   {
      return vendasBrutas;
   } // fim do método getVendasBrutas 

   // configura a taxa de comissão
   public void setTaxaComissao( double argTaxaComissao )
   {
      taxaComissao = ( argTaxaComissao > 0.0 && argTaxaComissao < 1.0 ) ? argTaxaComissao : 0.0;
   } // fim do método setTaxaComissao 

   // retorna a taxa de comissão 
   public double getTaxaComissao()
   {
      return taxaComissao;
   } // fim do método getTaxaComissao 

   // calcula os lucros                 
   public double vencimentos()
   {
      return taxaComissao * vendasBrutas;
   } // fim do método vencimentos              

   // retorna a representação String do objeto
   public String toString()
   {
      return String.format( "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f", 
         "Empregado comissionado", nome, sobrenome, 
         "CPF", cpf, 
         "Vendas brutas", vendasBrutas, 
         "Taxa de comissão", taxaComissao );
   } // fim do método toString
   
} // fim da classe 


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Fig. 9.9: CommissionEmployee2.java                                     *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *************************************************************************/