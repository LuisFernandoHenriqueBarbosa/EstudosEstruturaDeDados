// ------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : COMPOSIÇÃO E HERANÇA em JAVA
// Ano/S: 2024/1S
// ------------------------------------
 
// Classe EmpregadoComissionado representa um empregado que recebe APENAS comissão sobre vendas
// --------------------------------------------------------------------------------------------

public class EmpregadoComissionado_Avulso0 //extends Object
{
   // atributos
   private String nome;                              
   private String sobrenome;                               
   private String cpf;                   
   private double vendasBrutas; // vendas brutas semanais       
   private double taxaComissao; // porcentagem da comissão

   // construtor de cinco argumentos                                       
   public EmpregadoComissionado_Avulso0(
           String argNome,
           String argSobrenome,
           String argCpf,
           double argVendasBrutas,
           double argTaxaComisscao )                                     
   {                                                                  
      // chamada implícita para o construtor Object ocorre aqui              
      nome = argNome;                                              
      sobrenome = argSobrenome;                                                
      cpf = argCpf;                                     
      setVendasBrutas( argVendasBrutas ); // valida e armazena as vendas brutas       
      setTaxaComissao( argTaxaComisscao ); // valida e armazena a taxa de comissão
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
   public void setTaxaComissao( double argTaxaComisscao )
   {
      taxaComissao = ( argTaxaComisscao > 0.0 && argTaxaComisscao < 1.0 ) ? argTaxaComisscao : 0.0;
   } // fim do método setTaxaComissao 

   // retorna a taxa de comissão 
   public double getTaxaComissao()
   {
      return taxaComissao;
   } // fim do método getTaxaComissao 

   // calcula os vencimentos do empregado
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
 * Fig. 9.4: EmpregadoComissionado.java                                   *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *************************************************************************/