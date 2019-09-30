import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import static java.lang.Integer.min;

public class JTask1 {
    /* Минимум n чисел
   Написать функцию, которая вычисляет минимум из массива чисел.
   */
    public static void main(String[] args) {
        int [] arr = {2, 6, 8, 10};
        int min = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {

            min = min(min, arr[i]);

        }
        System.out.println(min);
    }



}