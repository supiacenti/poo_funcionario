package model;

public class Funcionario {
    private int cracha;
    private float salario;
    private String cargo;
    
    public Funcionario(){
    }
    
    public Funcionario(int c, float s, String car){
        this.setCracha(c);
        this.setSalario(s);
        this.setCargo(car);
    }
    
    public int getCracha(){
        return cracha;
    }
    public void setCracha(int c){
        this.cracha = c;
    }
    
    public float getSalario(){
        return salario;
    }
    public void setSalario(float s){
        this.salario = s;
    }
    
    public String getCargo(){
        return cargo;
    }
    public void setCargo(String car){
        this.cargo = car;
    }
    
    public float calculaAumento(float p){
        float sal = this.salario;
        float ap = (sal * (p / 100));
        return ap;
        
    }
    public float calculaAumento(int anos){
        float aa = 150 * anos;
        return aa;
    }
}