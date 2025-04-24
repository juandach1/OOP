public class Operations {
    private int a,b,result;
    // geters y setters
    public int getResultado(){
        System.out.print("Result = ");
        return result;
    }
    //METODOS PARA OPERACIONES MATEMATICAS
    public int setsumar(int a, int b) {
        result = a + b;
        return result;
    }

    public int setrestar(int a, int b) {
        result = a - b;
        return result;  
    }

    public int setmultiplicar(int a, int b) {
        result = a * b;
        return result;   
    }

  

}
