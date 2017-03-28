
 
package calculadora;

import java.util.Scanner;


public class Carrito {
   Calculadora objeto1=new Calculadora();
   int[] precios={1000,2000,3000,4000,5000};
   int[]cant=new int[5];
   Scanner leer= new Scanner(System.in);
   public void agregarcantidad(){
      
      
       int cantidad;
       int posicionproducto;
       
       
          System.out.println("Ingrese posicion producto");
          posicionproducto=leer.nextInt();
        
          System.out.println("Ingrese cantidad del producto");
          cantidad=leer.nextInt();  
          
          for(int j=0;j<cant.length;j++){
                
                if(j==posicionproducto){
                    objeto1.setn1(cant[j]);
                    objeto1.setn2(cantidad);
                    objeto1.sumar();
                    cant[j]=objeto1.sumar();
                }
              
          }
       }
       
   public void descontarcantidad(){
       int opcion;
       int cantidad;
       for(int i=0;i<cant.length;i++){
           if(cant[i]>0){
               System.out.println("Desea descontar el producto "+i+"?");
               System.out.println("0:Si  1:no");
               opcion=leer.nextInt();
               if(opcion==0){
                   System.out.println("cantidad a descontar");
                   cantidad=leer.nextInt();
                   while(cantidad>cant[i]){
                        System.out.println("la cantidad a descontar no debe superar la cantidad inicial");
                        cantidad=leer.nextInt();
                   }
                   
                   objeto1.setn1(cant[i]);
                   objeto1.setn2(cantidad);
                   objeto1.restar();
                   cant[i]=objeto1.restar();
               }
           }
           
       }
       
   }
   
   public void eleccionusuario(){
    boolean respuesta;
    int opcionpagar=0;
    int opcioneditar=0;
    
    while(respuesta=!false){    
        System.out.println("0:Agregar productos");
        System.out.println("1:Descontar productos");
        opcioneditar=leer.nextInt();
        switch(opcioneditar){
            case 0: agregarcantidad();
                    break;
            case 1: descontarcantidad();
                    break;
        
        }
        System.out.println("el total es "+calculartotal());
        System.out.println("Desea pagar?(0:si  1:no)");
        opcionpagar=leer.nextInt();
        if(opcionpagar==0){
            respuesta=false;
            break;
        }
        if(opcionpagar==1){
            respuesta=true;
            
        }
    
    }    
   
   }     
        
   public int calculartotal(){
       
        int acumulador=0;
        
            
        for(int i=0;i<cant.length;i++){
            objeto1.setn1(cant[i]);
            objeto1.setn2(precios[i]);
            objeto1.multiplicar();
            
            objeto1.setn1(objeto1.multiplicar());
            objeto1.setn2(acumulador);
            objeto1.sumar();
            
            acumulador=objeto1.sumar();
            objeto1.setn2(acumulador);
            
                
            }
      
        
   return objeto1.getn2();     
   } 
 
   public int pago(){
       int dinero;
       int vuelto;
       System.out.println("Ingrese dinero a cancelar");
       dinero=leer.nextInt();
       while(dinero<calculartotal()){
           System.out.println("Insuficiente dinero para cancelar");
           dinero=leer.nextInt();
       }
       objeto1.setn1(dinero);
       vuelto=objeto1.restar();
       
   
    return vuelto;
   }
}
   
   
        
       
           
   
   
   
   
    
      
      
      
      
      
       
   
  
  
   

