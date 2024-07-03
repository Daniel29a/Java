
package Suma;

import javax.swing.JOptionPane;


public class Operacion {
    
    int n1,n2;
    int suma,resta,multiplicacion,division;
    
    
    
    public void LeerDatos(){
        
      n1 = Integer.parseInt(JOptionPane.showInputDialog("Ingresar un numero"));
      n2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese otro numero"));
        
        
    }
    public void Sumar(){
        
      suma = n1+n2;
      
        
        
    }
    public void Restar(){
        
        resta = n1-n2;
    }
    
    public void Multiplicar(){
        
      multiplicacion = n1*n2;
      
        
    }
    public void Dividir(){
        
     division = n1/n2;   
        
        
        
    }
    public void MostrarResultados(){
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La Multiplicacion es; "+multiplicacion);
        System.out.println("La Division es: "+division);
        
        
        
        
    }
    
    public static void main(String []args){
        
       Operacion op = new Operacion();
       op.LeerDatos();
       op.Sumar();
       op.Restar();
       op.Multiplicar();
       op.Dividir();
       op.MostrarResultados();
    }
    
}

