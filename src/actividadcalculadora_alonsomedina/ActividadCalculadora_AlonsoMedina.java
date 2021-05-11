package actividadcalculadora_alonsomedina;
import javax.swing.JOptionPane;

public class ActividadCalculadora_AlonsoMedina {

    private int num;
    public double result;
    private String signo;
    private int result2;
    
    public ActividadCalculadora_AlonsoMedina(){
        
    }
    
    public void numIntr (int resultado){
        
        this.result = resultado;
        
    }
    
    public void op_suma(int ...numero){
        this.signo = "+";
        for (int i = 0; i < numero.length; i++) {
            
            this.num = numero[i];
            this.result += this.num;
            
        }
    }
    
    
    public void op_resta(int ...numero){
        this.signo = "-";
        for (int i = 0; i < numero.length; i++) {
            
            this.num = numero[i];
            this.result -= this.num;
            
        }
    }
    
   
    
    public void op_multiplic(int ...numero){
        this.signo = "*";
        for (int i = 0; i < numero.length; i++) {
            
            this.num = numero[i];
            this.result *= this.num;
            
        }
    }
    
   
    
    public void resultadoFin(){
        
        result2 = (int)result;
        if(result % result2 == 0){
            System.out.println("resultado = " + result2);
        } else{
            System.out.println("resultado = " + result);
        } 
    }
    
    
     public void eliminacion (){
        
        if(this.signo.equalsIgnoreCase("+")){
            this.result -= this.num;
        } else if(this.signo.equalsIgnoreCase("-")){
            this.result += this.num;
        } else if(this.signo.equalsIgnoreCase("*")){
            this.result /= this.num;
        } else if(this.signo.equalsIgnoreCase("/")){
            this.result *= this.num;
        }
    }
   
     
      public void op_division(int ...numero){
        this.signo = "/";
        for (int i = 0; i < numero.length; i++) {
            
            if(numero[i] == 0){
                
                result = 0;
                JOptionPane.showMessageDialog(null, "Introduzca un número correcto para dividir", "Error", 0);
                break;
                
            } else {
                
                this.num = numero[i];
                result /= this.num;
            }
        }
    }
}
