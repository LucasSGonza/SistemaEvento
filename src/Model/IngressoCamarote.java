/*
package Model;

public class IngressoCamarote extends Ingresso {

    private double valorIngresso;

    public IngressoCamarote() {

    }

    public IngressoCamarote(String nome, String cpf, Evento e) {
        super(nome, cpf, e);
    }

    public double getValor() {
        return valorIngresso;
    }

    @Override
    public String imprimirValor(Evento e) { //método para calcular valor do ingresso

        if (e.getValorUnico() == 0) {
            return "Evento: " + e.getNome() + "\n"
                    + "Ingresso Camarote: Valor do Evento ainda nao definido!" + "\n";

        } else {

            //calculo do ingresso vip
            double valorIngressoVIP = e.getValorUnico() + (e.getValorUnico() * 0.6); // valor do ingresso VIP é o valor unico do evento + 30%
            this.valorIngresso = valorIngressoVIP;

            //fim do calculo
            return "Evento: " + e.getNome() + "\n"
                    + "Ingresso Camarote: R$" + this.getValor() + "\n";
        }

    }

    @Override
    public void mostrarResumo(Evento e) { //método para exibir dados do ingresso
        System.out.println("Dados do Ingresso" + "\n"
                + "Tipo: Camarote" + "\n"
                + "Evento: " + e.getNome() + "\n"
                + "Data: " + e.getData() + "\n"
                + "Nome: " + this.getNome() + "\n"
                + "CPF: " + this.getCpf() + "\n");

    }

}
*/
