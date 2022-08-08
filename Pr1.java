/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pr1;
import java.util.Scanner;
import java.util.Arrays;
/**
 *
 * @author USUARIO
 */
public class Pr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {//System.out.println("");
        Scanner w=new Scanner(System.in);
        Scanner n=new Scanner(System.in);
        int e1=0, o1=0;
        System.out.println("-----CALCULADORA-----");
        System.out.println("1.Iniciar Sistema");
        System.out.println("2.Salir");
        System.out.print("Elija una opcion:");
        e1=w.nextInt();
        if(e1==1){//Inicio de las operaciones en la calculadora
             do{
            Scanner b= new Scanner(System.in);     
            int b1=0; 
            System.out.println("-------------------------");
            System.out.println("1.Operaciones Aritmeticas");
            System.out.println("2.Operaciones Geometricas");
            System.out.println("3.Operaciones Estadisticas");
            System.out.println("4.Operaciones Avanzadas");
            System.out.print("Elija una opcion:");
            b1=b.nextInt();
            switch(b1){//Inicio del programa
                case 1:
                    Scanner a1= new Scanner(System.in);
                    int a=0;
                    System.out.println("*-*-*-*-*-*-*-*-*");
                    System.out.println("1.---Operaciones Aritmeticas---");
                    System.out.println("1. Suma");
                    System.out.println("2. Resta");
                    System.out.println("3. Multiplicacion");
                    System.out.println("4. Division");
                    System.out.print("Elija una opcion:");
                    a=a1.nextInt();
                    switch(a){//Inicio de aritmeticas
                        case 1://Case numero 1 para la suma
                            Scanner x= new Scanner(System.in);
                            Scanner y= new Scanner(System.in);
                            double suma=0, s=0;
                            int os=0;
                            for(int f=1; f<11; f++){//inicio del for para la operacion suma
                                System.out.println("Ingrese el numero "+f);
                                s=y.nextDouble();
                                System.out.println("¿Deseas agrear otro numero?");
                                System.out.println("Presione 0 para agregar otro");
                                System.out.println("Presione cualquier otro numero para realizar la operacion");
                                os=x.nextInt();
                                suma=suma+s; 
                                if(os==0){
                                   System.out.print(""); 
                                }
                                else{
                                    f=12;
                                    System.out.println("");
                                }  
                            }//fin del for para la operacion suma
                            System.out.println("La suma de sus numero es: "+suma); 
                            break;
                        case 2://Case numero 2 para la resta
                            Scanner r= new Scanner(System.in);
                            Scanner z= new Scanner(System.in);
                            double resta=0, au=0;
                            int o=0;
                            for(int r1=1; r1<11; r1++){//inicio del for para la operacion suma
                                System.out.println("Ingrese el numero "+r1);
                                au=z.nextDouble();
                                System.out.println("¿Deseas agrear otro numero?");
                                System.out.println("Presione 0 para agregar otro");
                                System.out.println("Presione cualquier otro numero para realizar la operacion");
                                o=r.nextInt();
                                resta=resta-au; 
                                if(o==0){
                                   System.out.print(""); 
                                }
                                else{
                                    r1=12;
                                    System.out.println("");
                                }  
                            }//fin del for para resta
                            System.out.println("La resta de sus numero es: "+resta);
                            break;
                        case 3://case numero 3 para la multiplicacio
                            Scanner j= new Scanner(System.in);
                            Scanner h= new Scanner(System.in);
                            double mult=0, u=0;
                            int ñ=0;
                            for(int m1=1; m1<11; m1++){//inicio del for para la operacion suma
                                System.out.println("Ingrese el numero "+m1);
                                au=h.nextDouble();
                                System.out.println("¿Deseas agrear otro numero?");
                                System.out.println("Presione 0 para agregar otro");
                                System.out.println("Presione cualquier otro numero para realizar la operacion");
                                ñ=j.nextInt();
                                mult=mult-au; 
                                if(ñ==0){
                                   System.out.print(""); 
                                }
                                else{
                                    m1=12;
                                    System.out.println("");
                                }  
                            }//fin del for para multiplicacion
                            System.out.println("El resultado de la multiplicacon es: "+mult);
                            break;
                        case 4: //case numoer 2 para la divison
                           Scanner q= new Scanner(System.in);
                           Scanner p= new Scanner(System.in);
                           double d1=0, d2=0;
                        System.out.println("Division");
                        System.out.println("Ingrese el primer numero");
                        d1 = q.nextDouble();
                        System.out.println("Ingrese el segundo numero");
                        d2 = p.nextDouble();
                        d1 = d1/d2;
                        System.out.println("La divison de los números es: "+d1);
                            break;
                        default:
                            System.out.println("********");
                            System.out.println("Opcion incorrecta");
                            break;
                    }//Fin del switch dentro de arimeticas 
                case 2:// Case 2 de geometricas
                    Scanner t= new Scanner(System.in);
                    Scanner u=new Scanner(System.in);
                    int t1=0;
                    int u1=0;
                    System.out.println("********");
                    System.out.println("---Geometricas---");
                    System.out.println("1. Areas");
                    System.out.println("2. Perimetros");
                    System.out.print("Elija una opcion:");
                    t1=t.nextInt();
                    /*u1=u.nextInt();*/
                    switch(t1){ //swtch para las areas 
                        case 1://Case numero 1 para las areas
                        Scanner A1= new Scanner(System.in);
                        int A=0;
                        System.out.println("----Areas----");
                        System.out.println("1. Area de un triangulo");
                        System.out.println("2. Area de un cuadrado");
                        System.out.println("3. Area de un rectangulo");
                        System.out.println("4. Area de un circulo");
                            A=A1.nextInt();
                            switch(A){
                        case 1: //case 1 para triangulo
                        Scanner ta1= new Scanner(System.in);
                        Scanner ta2= new Scanner(System.in);
                        Scanner ta3=new Scanner(System.in);
                        int x1=0, x2=0, x3=0;
                        int triangulo;
                        System.out.println("triangulo");;
                        System.out.println("Ingrese lado 1");
                        x1 = ta1.nextInt();
                        System.out.println("Ingrese lado 2");
                        x2 = ta2.nextInt();
                        System.out.println("Ingrese lado 3");
                        x3 = ta3.nextInt();
                        triangulo= (x1+x2+x3);
                        System.out.println("El area del triangulo es: "+triangulo);
                           break;
                        case 2: //case 2 para el cuadrado
                    Scanner ca1= new Scanner(System.in);
                   int y1=0;
                   int cuadrado;
                    System.out.println("cuadrado");
                     System.out.println("Ingrese un lado del cuadrado");
                    y1 = ca1.nextInt();
                    cuadrado= (y1*y1);
                     if(y1>0){
                              System.out.println("El area del cuadrado es: "+cuadrado);
                                }
                                else{
         
                                    System.out.println("No existen areas negativas");
                                }  

                            break;
                        case 3: //case 3 para el rectangulo
                    Scanner ra1= new Scanner(System.in);
                    Scanner ra2= new Scanner(System.in);
                   int z1=0, z2=0;
                   int rectangulo;
                    System.out.println("rectanagulo");;
                    System.out.println("Ingrese la altura");
                    z1 = ra1.nextInt();
                    System.out.println("Ingrese la base");
                    z2 = ra2.nextInt();
                    rectangulo= (z1*z2);
                    if(z1>0 && z2>0){
                              System.out.println("El area del cuadrado es: "+rectangulo);
                                }
                                else{
         
                                    System.out.println("No existen areas negativas");
                                }  
                    System.out.println("El area del rectangulo es: "+rectangulo);
                            break;
                        case 4: //case 4 para el circulo 
                   Scanner Ca1= new Scanner(System.in);
                   int w1=0;
                   double circulo;
                    System.out.println("circulo");
                    System.out.println("Ingrese el radio del circulo");
                    w1 = Ca1.nextInt();
                    circulo= (w1*w1*3.1416);
                    if(w1>0){
                              System.out.println("El area del cuadrado es: "+circulo);
                                }
                                else{
         
                                    System.out.println("No existen areas negativas");
                                }  
                            break;
                        default:
                             System.out.println("-----------------------");
                            System.out.println("Opcion incorrecta");
                            break;
                            
                    }// fin del switch para las areas
                    /*switch(u1){//switch para los perimetros*/
                        case 2://case 2 para los perimetros
                    Scanner k1= new Scanner(System.in);
                    int k=0;
                    System.out.println("----Perimetros----");
                    System.out.println("1. Perimetro de un triangulo");
                    System.out.println("2. Perimetro de un cuadrado");
                    System.out.println("3. Perimetro de un rectangulo");
                    System.out.println("4. Perimetro de un circulo");
                     k=k1.nextInt();
                    switch(k){
                             case 1: //case 1 para triangulo
                    Scanner ta1= new Scanner(System.in);
                    Scanner ta2= new Scanner(System.in);
                    Scanner ta3=new Scanner(System.in);
                   int x1=0, x2=0, x3=0;
                   int triangulo;
                    System.out.println("triangulo");;
                     System.out.println("Ingrese lado 1");
                    x1 = ta1.nextInt();
                    System.out.println("Ingrese lado 2");
                    x2 = ta2.nextInt();
                    System.out.println("Ingrese lado 3");
                    x3 = ta3.nextInt();
                    triangulo= ((x1+x2+x3)/2);
                    if(x1>0 && x2>0 && x3>0){
                              System.out.println("El area del cuadrado es: "+triangulo);
                                }
                                else{
         
                                    System.out.println("No existen areas negativas");
                                }  
          
    
                           break;
                        case 2: //para un cuadrado
                    Scanner ca1= new Scanner(System.in);
                   int y1=0;
                   int cuadrado;
                    System.out.println("cuadrado");
                     System.out.println("Ingrese un lado del cuadrado");
                    y1 = ca1.nextInt();
                    cuadrado= (y1+y1+y1+y1);
                     if(y1>0){
                              System.out.println("El area del cuadrado es: "+cuadrado);
                                }
                                else{
         
                                    System.out.println("No existen areas negativas");
                                }  

                            break;
                        case 3: //case 3 para el rectangulo
                    Scanner ra1= new Scanner(System.in);
                    Scanner ra2= new Scanner(System.in);
                   int z1=0, z2=0;
                   int rectangulo;
                    System.out.println("rectanagulo");;
                    System.out.println("Ingrese la altura");
                    z1 = ra1.nextInt();
                    System.out.println("Ingrese la base");
                    z2 = ra2.nextInt();
                    rectangulo= (z1+z1+z2+z2);
                     if(z1>0 && z2>0){
                              System.out.println("El area del cuadrado es: "+rectangulo);
                                }
                                else{
         
                                    System.out.println("No existen areas negativas");
                                }  

                            break;
                        case 4: //case 4 para el circulo 
                   Scanner Ca1= new Scanner(System.in);
                   int w1=0;
                   double circulo;
                   System.out.println("circulo");
                   System.out.println("Ingrese el radio del circulo");
                   w1 = Ca1.nextInt();
                   circulo= (2*3.1416*w1);
                    if(w1>0){
                              System.out.println("El area del cuadrado es: "+circulo);
                                }
                                else{
         
                                    System.out.println("No existen areas negativas");
                                }  
                            break;
                        default:
                             System.out.println("********");
                            System.out.println("Opcion incorrecta");
                            break;       
                  }//fin de swith para los perimetros

                    break;//fin de las operaciones geometricas 
                    
                case 3:// case 3 Estadistica
                    Scanner i1= new Scanner(System.in);
                    int i=0;
                    System.out.println("********");
                    System.out.println("---Estadistica---");
                    System.out.println("1. Moda");
                    System.out.println("2. Mediana");
                    System.out.println("3. Media");
                    System.out.print("Elija una opcion:");
                     i=i1.nextInt();
                    switch(i){ //Inicio de switch para las operacines estadisticas
                        case 1:
                             int arreglo[] = { 550, 51, 89, 33, 50, 30, 10, 10, 1, 2, 3, 51, 9 };

        // Comenzamos con el promedio, lo cual es la media
        int sumatoria = 0;
        for (int x = 0; x < arreglo.length; x++) {
            sumatoria += arreglo[x];
        }
        double media = sumatoria / arreglo.length;
                          Arrays.sort(arreglo);

        int mediana;
        int mitad = arreglo.length / 2;
        // Si la longitud es par, se deben promediar los del centro
        if (arreglo.length % 2 == 0) {
            mediana = (arreglo[mitad - 1] + arreglo[mitad]) / 2;
        } else {
            mediana = arreglo[mitad];
        }

        // Imprimir valores
        System.out.println("El arreglo es: ");
        for (int x = 0; x < arreglo.length; x++) {
            System.out.printf("%d ", arreglo[x]);
        }
        System.out.printf("\nLa media es %.2f y la mediana es %d", media, mediana);
                        default:
                             System.out.println("-----------------------");
                            System.out.println("Opcion incorrecta");
                            break;   
                    } //Fin de switch para las operaciones estadistic
                    break; // break de estadistica caso 3 
                case 4:// case 4 avanzadas
                    Scanner d1= new Scanner(System.in);
                    int d=0;
                    System.out.println("********");
                    System.out.println("---Avanzadas---");
                    System.out.println("1. Factorial N");
                    System.out.println("2. Fibonacci");
                    System.out.print("Elija una opcion:");
                      d=d1.nextInt();
                    switch(d){ //Inicio de switch para las operacines avanzadas
                        case 1:
                            Scanner entrada=new Scanner(System.in);
                            int factorial =1;
                              System.out.println("Ingrese el numero el cual desee calcularle el factoria:" );
                            int numero=entrada.nextInt();
                            
                            while(numero !=0){
                                
                            factorial = factorial * numero;
                            numero = numero -1;
                            }
                            System.out.println("El factorial del numero es:"+factorial );
                            break;
                        case 2:
                             Scanner en=new Scanner(System.in);
                            int val, pre =0, pos=1, n31=0;
                            System.out.println("Ingrese el numero el cual desee calcularle su serie Fibonacci:" );
                            n31=en.nextInt();
                            System.out.print(pre+"\t"+pos);
                            for(int x3=0; x3<=n31; x3++){
                                val= pre+pos;
                                pre= pos;
                                pos=val;
                                System.out.println("\t"+val);
                            }
                            break;
                        default:
                             System.out.println("-----------------------");
                             System.out.println("Opcion incorrecta");
                             break;
                    } //Fin de switch para las operaciones avanzadas
                    break; // break de avanzadas 
                default:
                    System.out.println("********");
                    System.out.println("Opcion incorrecta");
                    break;
            }//Cierre del switch del menu
                    
            System.out.println("-----------------");
            System.out.println("Dese continuar?");
            System.out.println("Presione 1 para volver a inciar");
            System.out.print("Presione cualquier numero para finalizar: ");
            System.out.println("");
            System.out.println("");
            o1=w.nextInt();
        }
        }while(o1==1);//Final do
             
        System.out.println("Gracias por usar la calculadora");     
        }//Fin del programa
        else if(e1==2){
            System.out.println("Fin del programa");
        }
        else{System.out.println("Error opcion invalida");}
        // TODO code application logic here
        
    
}

    }   


