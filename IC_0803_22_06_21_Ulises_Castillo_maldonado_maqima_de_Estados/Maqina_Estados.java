
import java.util.List;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.io.*;

 public class Maqina_Estados{
    public static void main(String[] args){
      int [] array = new int [10];
    array[0] = 1;
    array[1] = 2;
    array[2] = 2;
    array[3] = 4; 
    array[4] = 3;
    array[5] = 3;
    array[6] = 3;
    array[7] = 4;
    array[8] = 2; 
    array[8] = 1; 
    int estado_actual=11;
    int UnaEntrada=0;
    for(int i=0; i< array.length; i++){
        UnaEntrada=array[i];
        estado_actual = estadoss(estado_actual, UnaEntrada);
        System.out.println(estado_actual);
    }

 }
 public static int estadoss(int estado_actual, int UnaEntrada){
	//primer estdo
	if((estado_actual == 11 &&  UnaEntrada == 1 ) ||  (estado_actual == 11 &&  UnaEntrada == 3)){
	estado_actual = estado_actual;	
	}
    else if((estado_actual == 11 && UnaEntrada == 2) ||(estado_actual == 11 && UnaEntrada == 4)){
		estado_actual = 12;
    }
    else if(estado_actual== 12){
        estado_actual =13;
    
        //tercer estado
    }
    else if((estado_actual== 13 &&  UnaEntrada==1)||(estado_actual==13 && UnaEntrada==2)){
        estado_actual = estado_actual;
    }
    else if((estado_actual==13 && UnaEntrada==3)||(estado_actual==13 && UnaEntrada==4)){
        estado_actual =14;
    }
    else if(estado_actual==14){
        estado_actual =11;
    }
return estado_actual;


}
}