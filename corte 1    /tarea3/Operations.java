public class Operations {
    private int a,b,result;
    // geters y setters
    public int getResultado(){
        return result;
        
    }
    //METODOS PARA OPERACIONES MATEMATICAS
    //suma
    public int setsumar(int a, int b) {
        result = a + b;
        return result;
    }
//resta
    public int setrestar(int a, int b) {
        result = a - b;
        return result;  
    }
//multiplicacion
    public int setmultiplicar(int a, int b) {
        result = a * b;
        return result;   
    }

}