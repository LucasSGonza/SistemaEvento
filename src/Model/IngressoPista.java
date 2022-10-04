package Model;

import DAO.IngressoPistaDAO; //Conecta com o BD
import java.util.ArrayList;

public class IngressoPista extends Ingresso {

    //Atributo
    private double valorIngresso;

    //Método Construtor Vazio
    public IngressoPista() {

    }

    //Método Construtor inserindo dados
    public IngressoPista(String nome, int idade, String cpf, String email, String sexo) {
        super(nome, idade, cpf, email, sexo);
    }
    

    //Métodos
    public double getValor() {
        return valorIngresso;
    }

    
    @Override
    public String imprimirValor(Evento e) { //método para calcular valor do ingresso (funciona como um método setter)

        if (e.getValorUnico() == 0) {
            return "Evento: " + e.getNome() + "\n"
                    + "Ingresso Pista: Valor do Evento ainda nao definido!" + "\n";

        } else {
            this.valorIngresso = e.getValorUnico(); //ingresso pista é apenas o valor único do evento
            return "Evento: " + e.getNome() + "\n"
                    + "Ingresso Pista: R$" + this.getValor() + "\n";
        }

    }

    @Override
    public String toString() { //método para exibir dados do ingresso
        return  "Tipo: Pista" + "\n"
                + "Nome: " + this.getNome() + "\n"
                + "CPF: " + this.getCpf() + "\n"
                + "----------------------------" + "\n";
    }

    //Métodos CRUD com o BD, lembrando que VIEW --> CONTROL --> MODEL --> BD (e vice-versa)
    
    //Create
    public boolean inserirIngressoPistaBD(IngressoPista a) {
        IngressoPistaDAO.listaIngresso.add(a);
        return true;
    }

    //Read
    public IngressoPista buscarIngressoPistaBD(String cpf) { //procura um objeto no BD pelo seu CPF, retorna o seu indice (posição)
                                                                //dps retorna o objeto na posição encontrada
        int indice = IngressoPistaDAO.getIngressoPista(cpf);
        return IngressoPistaDAO.listaIngresso.get(indice);
    }
    
    public ArrayList getMinhaLista(){
        return IngressoPistaDAO.listaIngresso;
    }
    
    //Update
    public boolean alterarIngressoPistaBD (String nome, int idade, String cpf, String email, String sexo){
        IngressoPista a = new IngressoPista(nome, idade, cpf, email, sexo);
        IngressoPistaDAO.listaIngresso.add(a);
        return true;
    }
    
    //Delete
    public boolean apagarIngressoPistaBD (String cpf){
        IngressoPistaDAO.listaIngresso.remove(IngressoPistaDAO.getIngressoPista(cpf));
        return true;
    }
    
}
