public class AbelhaZangao extends Abelha implements Defensora {
    int quantidadeDeVoo;

    public AbelhaZangao(){
        this.consumoBasico = 15;
    }

    @Override
    public double consumoTotal() {
        return super.consumoTotal() + (quantidadeDeVoo * 3);
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Quantidade de voos: " + quantidadeDeVoo);
    }
    @Override
    public void defender() {
        System.out.println("Defendendo a entrada da colmeia.");
    }

}
