public class EmpregadoProducao extends Empregado {

   private double valorPeca; // salário por hora
   private double qtdProduzida; // horas trabalhadas durante a semana

   public EmpregadoProducao(
         String argNome,
         String argSobrenome,
         String argCPF,
         int argDay,
         int argMonth,
         int argYear,
         double argValorpeca,
         double argQtdproduzida) {
      super(argNome, argSobrenome, argCPF, argDay, argMonth, argYear); // passa para o construtor de 'Empregado'
      setValorpeca(argValorpeca); // valida a remuneração por hora
      setQtdproduzida(argQtdproduzida); // valida as horas trabalhadas
   }

   // configura a remuneração
   public void setValorpeca(double argValorpeca) {
      valorPeca = (argValorpeca < 0.0) ? 0.0 : argValorpeca;
   } // fim do método setSalarioPorHora

   // retorna a remuneração
   public double getValorpeca() {
      return valorPeca;
   } // fim do método setSalarioPorHora

   // configura as horas trabalhadas
   public void setQtdproduzida(double argQtdproduzida) {
      qtdProduzida = ((argQtdproduzida >= 0.0) && (argQtdproduzida <= 168.0)) ? argQtdproduzida : 0.0;
   } // fim do método setQtdHorasSemanais

   // retorna as horas trabalhadas
   public double getQtdproduzida() {
      return qtdProduzida;
   } // fim do método getQtdHorasSemanais

   // calcula os rendimentos; sobrescreve o método 'vencimentos' em 'Empregado'
   public double vencimentos() {
      return getValorpeca() * getQtdproduzida();
   } // fim do método vencimentos

   // retorna a representação de String do objeto
   public String toString() {
      return String.format("EmpregadoProdução: %s\n%s: $%,.2f; %s: %,.2f",
            super.toString(), "Valor da peça produzida", getValorpeca(),
            "Qtd de peças produzidas", getQtdproduzida(),
            "Salario a receber", vencimentos());
   } // fim do método toString

}
