package Control;

import Model.Evento;
import Model.IngressoPista;
import java.util.ArrayList;

public class IngressoPistaControl {

    private final IngressoPista controlPista; //control será um objeto Ingresso, mas que não interage com o BD

    public IngressoPistaControl() { //quando for instanciar um objeto IngressoPistaControl, irá instanciar um objeto único IngressoControl
        this.controlPista = new IngressoPista();
    }

    //Métodos CRUD (irá receber os dados do VIEW e enviar para o MODEL para então enviar ao BD. VIEW --> CONTROL --> MODEL --> BD (e vice-versa)
    
    
    //Create
    public boolean cadastrarIngressoPista(String n, int i, long c, long p, String s) { //nome, idade, cpf, email, sexo, evento
        IngressoPista a = new IngressoPista(n, i, c, p, s);
        if (controlPista.inserirIngressoPistaBD(a) == true) {//metodo no Model para inserir no BD com esses dados do VIEW
            return true;
        } else {
            return false;
        }
        
    }
    
    //Read
    public IngressoPista carregarIngressoPista(long cpf) {
       return controlPista.buscarIngressoPistaBD(cpf);
    }
    
    public ArrayList getMinhaLista(){
        return controlPista.getMinhaLista();
    }
    
    //Update
    public boolean atualizarIngressoPista (String nome, int idade, long cpf, long phone, String sexo){
        controlPista.alterarIngressoPistaBD(nome, idade, cpf, phone, sexo);
        return true;
    }
    
    //Delete
    public boolean deletarIngressoPista (long cpf){
        if (controlPista.apagarIngressoPistaBD(cpf) == true){           
            return true;
        } else {
            return false;
        }       
    }
    
}
