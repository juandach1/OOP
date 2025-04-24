import javax.swing.JOptionPane;
public class Main {
    public static void main(String[] args) {
    String a = JOptionPane.showInputDialog("ingrese el primer numero: ");
    String b = JOptionPane.showInputDialog("ingrese el segundo numero: ");
    int num1 = Integer.parseInt(a);
    int num2 = Integer.parseInt(b);
     Operations resultado = new Operations();
     //suma
     resultado.setsumar(a,b);
     System.out.println("La suma es: "+resultado.getResultado());
 //resta
     resultado.setrestar(a,6);
     System.out.println("La resta es: "+resultado.getResultado());
     //multiplicacion
     resultado.setmultiplicar(2,5);
     System.out.println("la multiplicacion es: "+resultado.getResultado());
    }
}