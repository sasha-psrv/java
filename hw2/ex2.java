package hw2;

import java.io.IOException;
import java.util.Arrays;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class ex2 {
     public static void main(String[] args) {
        Logger logger = Logger.getLogger(ex2.class.getName());
        FileHandler fh;
        try {  
            fh = new FileHandler("MyLogFile.log");  
            logger.addHandler(fh);
            SimpleFormatter formatter = new SimpleFormatter();  
            fh.setFormatter(formatter);  
            logger.info("My first log");
            } catch (SecurityException e) {  
                e.printStackTrace();  
            } catch (IOException e) {  
                e.printStackTrace();  
            }

        int arr[] = {9,3,2,5,1,7,6,4,8};
        int i = arr.length - 1;
        while(i >= 1)
        {
            int j = 0;
            while (j < i) {
                int temp;
                if(arr[j+1] < arr[j]) {temp = arr[j]; arr[j] = arr[j+1]; arr[j+1] = temp;}
                logger.info(Arrays.toString(arr));
                j++;
                }
            i--;
        }
        for(int k : arr){System.out.println(k);}
    }
}

