package Model;

public abstract class Ingresso {
    
    private String nome;
    private int idade;
    private long cpf;
    private long phone;
    private String sexo;
    //private Evento e;
    
    
    public Ingresso(){  
        
    }
    
    public Ingresso (String nome, int idade, long cpf, long phone, String sexo){ 
        this.sexo = sexo;                        
        this.phone = phone;                              
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
    
    
    public void setCpf (long c){
        this.cpf = c;
    }
    
    public long getCpf(){
        return cpf;
    }
    
    public void setPhone(long phone){
        this.phone = phone;
    }
    
    public long getPhone(){
        return this.phone;
    }
    
    
    public abstract String imprimirValor (Evento e); //junção do método para cálcular valor do ingresso + mostrar tipo e valor do ingresso
       
}
