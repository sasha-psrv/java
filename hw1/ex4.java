// 4) (дополнительное задание) Задано уравнение вида q + w = e, q, w, e >= 0.
// Некоторые цифры могут быть заменены знаком вопроса, например, 2? + ?5 = 69.
// Требуется восстановить выражение до верного равенства.
// Знаки вопроса - одинаковые цифры.
// Предложить хотя бы одно решение или сообщить, что его нет.

package hw1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите выражение: ");
        String sourceString = iScanner.nextLine();

       
        boolean isContainsQMark = sourceString.contains("?");        
        if(isContainsQMark){                         
            for (int i=0; i<10; i++){                 
                String str = sourceString.replace('?', String.valueOf(i).charAt(0));

                if(checkExpression(str)){
                    System.out.printf("Для '%s' найдено верное выражение: %s", sourceString, str);
                    iScanner.close();     
                    return;
                } 
            }
            System.out.printf("Для '%s' не найдено верное выражение",  sourceString);            
        }else{
            if(checkExpression(sourceString)){                
                System.out.printf("Исходное выражение '%s' является верным", sourceString);          
            }else{
                System.out.printf("Исходное выражение '%s' не является верным", sourceString);     
            } 
        }            
        iScanner.close();     
    }

    public static boolean checkExpression(String str){
        String[] splitted = str.split("[+|=]");
        try{
            int a = Integer.parseInt(splitted[0]);
            int b = Integer.parseInt(splitted[1]);
            int c = Integer.parseInt(splitted[2]);
            return (a + b == c);           
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
            return false;   
        }          
    }
}
    

