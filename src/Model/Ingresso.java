package Model;

public abstract class Ingresso {
    
    private String nome;
    private int idade;
    private String cpf;
    private String email;
    private String sexo;
    //private Evento e;
    
    
    public Ingresso(){  
        
    }
    
    public Ingresso (String nome, int idade,String cpf, String email, String sexo){ 
        this.sexo = sexo;                        
        this.email = email;                              
        this.nome = nome;
        this.cpf = cpf;
        this.idade = idade;
    }
    
    
    public void setNome(String n){
        this.nome = n;
    }
    
    public String getNome(){
        return nome;
    }
    
    
    public void setCpf (String c){
        this.cpf = c;
    }
    
    public String getCpf(){
        return cpf;
    }
    
                  
    public abstract String imprimirValor (Evento e); //junção do método para cálcular valor do ingresso + mostrar tipo e valor do ingresso
       
}
