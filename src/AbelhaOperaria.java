public class AbelhaOperaria extends Abelha implements Coletora, Defensora {
    int horaDeVoo;

    public AbelhaOperaria(){
        this.consumoBasico = 10;
    }
    @Override
    public double consumoTotal() {
        return super.consumoTotal() + (horaDeVoo * 2);
    }

    @Override
    public void exibir() {
        super.exibir();
        System.out.println("Horas de voo: " + horaDeVoo);
    }
    @Override
    public void coletar() {
        System.out.println("Coletando néctar nas flores.");
    }

    @Override
    public void defender() {
        System.out.println("Defendendo a entrada da colmeia");
    }
}
