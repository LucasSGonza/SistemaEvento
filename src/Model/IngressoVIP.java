package Model;

public class IngressoVIP extends Ingresso {

    private double valorIngresso;

    public IngressoVIP() {

    }

    public IngressoVIP(String nome, String cpf, Evento e) {
        super(nome, cpf, e);
    }

    public double getValor() {
        return valorIngresso;
    }

    @Override
    public String imprimirValor(Evento e) { //método para calcular valor do ingresso

        if (e.getValorUnico() == 0) {
            return "Evento: " + e.getNome() + "\n"
                    + "Ingresso VIP: Valor do Evento ainda nao definido!" + "\n";

        } else {

            //calculo do ingresso vip
            double valorIngressoVIP = e.getValorUnico() + (e.getValorUnico() * 0.3); // valor do ingresso VIP é o valor unico do evento + 30%
            this.valorIngresso = valorIngressoVIP;

            //fim do calculo
            return "Evento: " + e.getNome() + "\n"
                    + "Ingresso VIP: R$" + this.getValor() + "\n";
        }

    }

    @Override
    public void mostrarResumo(Evento e) { //método para exibir dados do ingresso
        System.out.println("Dados do Ingresso" + "\n"
                + "Tipo: VIP" + "\n"
                + "Evento: " + e.getNome() + "\n"
                + "Data: " + e.getData() + "\n"
                + "Nome: " + this.getNome() + "\n"
                + "CPF: " + this.getCpf() + "\n");

    }

}
