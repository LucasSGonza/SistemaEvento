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
    public boolean cadastrarIngressoPista(String n, int i, String c, String e, String s) { //nome, idade, cpf, email, sexo, evento
        IngressoPista a = new IngressoPista(n, i, c, e, s);
        if (controlPista.inserirIngressoPistaBD(a) == true) {//metodo no Model para inserir no BD com esses dados do VIEW
            return true;
        } else {
            return false;
        }
        
    }
    
    //Read
    public IngressoPista carregarIngressoPista(String cpf) {
       return controlPista.buscarIngressoPistaBD(cpf);
    }
    
    public ArrayList getMinhaLista(){
        return controlPista.getMinhaLista();
    }
    
    //Update
    public boolean atualizarIngressoPista (String nome, int idade, String cpf, String email, String sexo){
        controlPista.alterarIngressoPistaBD(nome, idade, cpf, email, sexo);
        return true;
    }
    
    //Delete
    public boolean deletarIngressoPista (String cpf){
        if (controlPista.apagarIngressoPistaBD(cpf) == true){           
            return true;
        } else {
            return false;
        }       
    }
    
}
