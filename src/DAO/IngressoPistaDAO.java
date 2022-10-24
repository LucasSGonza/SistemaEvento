package DAO;

import Model.IngressoPista;
import java.util.ArrayList;

public abstract class IngressoPistaDAO { //Ingresso funciona como Pessoa (possui nome, cpf, email,...)

    //atributo do BD --> nesse projeto é uma ArrayList
    public static ArrayList<IngressoPista> listaIngresso = new ArrayList<>();

    //Não tem método construtor --> não irei instanciar objeto BD
    
    
    //Método para procurar objeto no BD
    public static int getIngressoPista(long cpf) {
        
        int indice = 0;
        for (int i = 0; i < IngressoPistaDAO.listaIngresso.size(); i++) {
            if (IngressoPistaDAO.listaIngresso.get(i).getCpf() == cpf) {
                indice = i;
                return indice;
            }
        }
        return indice;
    }

    
}
