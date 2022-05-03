
 package persistence;


public class Funcionario {
    
     private int matricula;
     private String nome;
     private String cargo;
     private double salario;
     
     public Funcionario(){ 
       
     }
     
     public Funcionario(int m, String n, String c, double s) {
        this.matricula = m;
        this.nome = n;
        this.cargo = c;
        this.salario = s;
    }
      
//  Métodos setter (armazernar valores nos atributos da clase)
        
     public void setMatricula(int m){
            this.matricula = m;  
    }
        public void setNome(String n){
            this.nome = n;
        }
        public void setCargo(String c){
            this.cargo = c; 
        }
        public void setSalario(double s){
            this.salario = s;
        }
        
        
 // Métodos getter (pegar valores atribuidos na clase)
        
        
        public int getMatricula() {
            return this.matricula;
        }
        public String getNome(){
            return this.nome;
        }
        public String getCargo(){
            return this.cargo;
        }
        public double getSalario(){
            return this.salario;
        }
}
