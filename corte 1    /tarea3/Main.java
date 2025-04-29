import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
        
        Operations resultado = new Operations();
        
    String a = JOptionPane.showInputDialog("ingrese el primer numero: ");
    String b = JOptionPane.showInputDialog("ingrese el segundo numero: ");
    
    int num1 = Integer.parseInt(a);
    int num2 = Integer.parseInt(b);
     
    String Opcion = JOptionPane.showInputDialog("DIgite la operacione que desea: \n1. Suma\n2.Resta\n3.Mulplicacion");
    
    int opcion = Integer.parseInt(Opcion);
    //hacemos un menu
    switch(opcion){
        case 1 ->{
             //suma
     resultado.setsumar(num1,num2);
     JOptionPane.showMessageDialog(null,"la suma es: "+resultado.getResultado());
        }
        case 2 -> {
            //resta
     resultado.setrestar(num1,num2);
     JOptionPane.showMessageDialog(null,"la resta es: "+resultado.getResultado());
        }   
        case 3 -> {
            //multiplicacion
     resultado.setmultiplicar(num1,num2);
     JOptionPane.showMessageDialog(null,"la multiplicacion es: "+resultado.getResultado());
    } 
        
   }
   
 }
}

        
        
   