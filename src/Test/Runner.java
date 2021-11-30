package Test;
/*import Logica.House;


import java.util.ArrayList;

import java.util.Collections;
import java.util.Comparator;
*/

import java.util.Scanner;
import java.util.Stack;

public class Runner {
    public static void main(String[] args) {
        /*
        ArrayList<House> casa=new ArrayList<House>();
       casa.add(new House("cra37#202-80","roja y blanco",2,150));
        casa.add(new House("cra5#21-90","blanco",3,250));
        casa.add(new House("cra36#569-780","roja ",1,249));
        casa.add(new House("cra87A#10b-87","azul",2,170));
        casa.add(new House("calle24#56-10","verde",3,190));
        //Collections.sort(casa,House.comDireccion);
        casa.forEach(System.out::println);
        Comparator.comparing(House::getArea);//ordena directamente si llamar a ningun comparator que tengo al otro lado
/*for(House house:casa){
    System.out.println(house);
}*/
        new Runner().load();
    }

    private void load() {
        Scanner input=new Scanner((System.in));
        while(input.hasNext()){
            System.out.println(validate(input.nextLine()));
        }
    }

    private String validate(String nextLine) {
       Stack<Integer> stack= new Stack<>();
       StringBuffer out= new StringBuffer();
       for(int index=0;index<nextLine.length();index++){
           if(nextLine.charAt(index)=='('){
               stack.push(index);

           }else if(nextLine.charAt(index)==')'){
                  if(!stack.isEmpty()){
out.append("["+ stack.pop()+"-"+index+"],");
                  }else{
                      return "Falso";
                  }

           }


       }
        return stack.isEmpty() ?out.toString():"FALSE";
    }
}
