
package calculadora;



public class Calculadora {
    int n1;
    int n2;
    int sumar(){
        return n1+n2;
    }
    
    int restar(){
        
    return n1-n2;
    
    }
    
    int multiplicar(){
       
    return n1*n2;
    
    }
    
    int dividir(){
        
    return n1/n2;
    
    }
    
    public void mostrar1(){
        System.out.println("la suma es "+ sumar());
        System.out.println("la resta es "+ restar());
        System.out.println("la multiplicacion es "+ multiplicar());
        System.out.println("la division es "+ dividir());
    }
    
    public void setn1(int newn1){
        n1=newn1;
    }
    
    public void setn2(int newn2){
         n2=newn2;
    }
    
    public int getn1(){
    return this.n1;
    }
    
    public int getn2(){
    return this.n2;
    }
    
   
   
   
}

