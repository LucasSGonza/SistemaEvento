package Model;

public class Evento {

    private String nome;
    private String data;
    private double valorUnico;
    private int capacidadeMax;
    private int ingressosVendidos;

    public Evento() {

    }

    public Evento(String n, String d, double v, int c, int i) {
        this.nome = n;
        this.data = d;
        this.valorUnico = v;
        this.capacidadeMax = c;
        this.ingressosVendidos = i;
    }
    
    
    public void setValorUnico (double valor){
        this.valorUnico = valor;
    }
    
    public double getValorUnico() {
        return valorUnico;
    }

    
    public void setNome (String nome){
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    
    public void setData (String data){
        this.data = data;
    }
    
    public String getData(){
        return data;
    }
    
    
    public void setCapacidadeMax (int max){
        this.capacidadeMax = max;
    }
    
    public int getCapacidadeMax(){
        return capacidadeMax;
    }
    
    
    public void venderIngresso(){ //ingressos vendidos +  capacidade maxima - --> utilizar if's para verificar se ultrapassou ou nao o limite max
        
        if (this.capacidadeMax != 0){ //se ainda tem capacidade para vender...
            this.ingressosVendidos++;
            this.capacidadeMax--;
        } else if (this.capacidadeMax == 0){
            System.out.println("Nao e mais possivel comprar ingressos, pois o evento chegou em sua capacidade maxima!");
        }
        
    }
    
    public int getIngressosVendidos(){
        return ingressosVendidos;
    }
    
    public String mostrarIngressosVendidos(){
        return  "Evento: " + this.getNome() + "\n"
                + "Ingressos Vendidos: " + this.ingressosVendidos + "\n";
    }
         
    public String mostrarDados() {
        return "Evento: " + this.nome + "\n"
                + "Data: " + this.data + "\n"
                + "Valor Unico: R$" + this.valorUnico + "\n"
                + "Capacidade Maxima: " + this.capacidadeMax + "\n"
                + this.mostrarIngressosVendidos();
    }

}
