// ------------------------------------
// Disc.: IED-001 - ESTRUTURAS DE DADOS
// Prof.: Carlos - FATEC S J Rio Preto
// Lab. : COMPOSIÇÃO E HERANÇA em JAVA
// Ano/S: 2024/1S
// ------------------------------------
 
// A classe EmpregadoComissionadoMaisFixo representa um empregado que
// recebe um salário-base além da comissão
// ------------------------------------------------------------------

public class EmpregadoComissionadoMaisFixo_Avulso1
{
   // atributos
   private String nome;
   private String sobrenome;
   private String cpf;
   private double vendasBrutas; // vendas brutas semanais       
   private double taxaComissao; // porcentagem da comissão
   private double salarioFixo; // salário-base por semana

   // construtor de seis argumentos
   public EmpregadoComissionadoMaisFixo_Avulso1(
           String argNome,
           String argSobrenome,
           String argCpf,
           double argVendasBrutas,
           double argTaxaComissao,
           double argSalarioFixo )
   {
      // chamada implícita para o construtor Object ocorre aqui              
      nome = argNome;
      sobrenome = argSobrenome;
      cpf = argCpf;
      setVendasBrutas( argVendasBrutas ); // valida e armazena as vendas brutas       
      setTaxaComissao( argTaxaComissao ); // valida e armazena a taxa de comissão
      setSalarioFixo( argSalarioFixo ); // valida e armazena salário-base
   } // fim do construtor BasePlusCommissionEmployee de seis argumentos

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

   // calcula os vencimentos do empregado                 
   public double vencimentos()
   {
      return salarioFixo + ( taxaComissao * vendasBrutas );
   } // fim do método vencimentos              

   // retorna a representação de String do objeto
   public String toString()
   {
      return String.format( 
         "%s: %s %s\n%s: %s\n%s: %.2f\n%s: %.2f\n%s: %.2f", 
         "Empregado comissionado + fixo", nome, sobrenome,
         "CPF", cpf,
         "Vendas brutas", vendasBrutas,
         "Taxa de comissão", taxaComissao, 
         "Vencimento fixo", salarioFixo);
   } // fim do método toString
   
} // fim da classe


/**************************************************************************
 * (C) Copyright 1992-2005 by Deitel & Associates, Inc. and               *
 * Fig. 9.6: EmpregadoComissionadoMaisFixo.java                           *
 * Pearson Education, Inc. All Rights Reserved.                           *
 *************************************************************************/