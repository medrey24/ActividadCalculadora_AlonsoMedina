package actividadcalculadora_alonsomedina;
import actividadcalculadora_alonsomedina.ActividadCalculadora_AlonsoMedina;

public class Resultados {

    public static void main(String[] args) {
        
    ActividadCalculadora_AlonsoMedina calc = new ActividadCalculadora_AlonsoMedina();
    
    System.out.println("--------------------------------------------------------\n");
    System.out.println("            Universidad Autónoma de Campeche            \n");
    System.out.println("                  Alonso Medina Reyes                   \n");
    System.out.println("                       I.S.C 2 A                        \n");
    System.out.println("            Docente: Ing. Edgar Caamal Dzulu            \n");
    System.out.println("               Lenguaje de programación I               \n");
    System.out.println("                     Calculadora                        \n");
    System.out.println("                      11/05/2021                        \n");
    System.out.println("--------------------------------------------------------\n");

        calc.op_suma(17);
        calc.op_multiplic(8);
        calc.op_resta(16);
        calc.op_division(2);
        calc.op_multiplic(3);
        calc.op_resta(7);
        calc.op_suma(66);
        
        calc.eliminacion();
        calc.resultadoFin();
    
    System.out.println("");    
    System.out.println("--------------------------------------------------------\n");
    }
    
}
