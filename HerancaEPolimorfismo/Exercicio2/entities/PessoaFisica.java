package entities;

public class PessoaFisica extends Pessoa{
    private Double gastosSaude;

    public PessoaFisica(){
      super();
    }

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
      super(nome, rendaAnual);
      this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
      return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
      this.gastosSaude = gastosSaude;
    }

    @Override
    public double imposto() {
      if (gastosSaude == 0) {
        if (super.getRendaAnual() < 20000.00) {
          return super.getRendaAnual()*0.15;
        } else {
          return super.getRendaAnual()*0.25;
        }
      } else {
        if (super.getRendaAnual() < 20000.00) {
          return super.getRendaAnual()*0.15 - 0.5*getGastosSaude();
        } else {
          return super.getRendaAnual()*0.25 - 0.5*getGastosSaude();
        }
      }
    }
}
