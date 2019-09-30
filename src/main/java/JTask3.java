public class JTask3 {
    /* Мое имя
Вывести на экран любой символ пирамидкой в обратную сторону высотой в 10 строк.
         *
        **
       ***
      ****
     *****
    ******
   *******
  ********
 *********
**********
System.out.println, System.out.print можно использовать только по одному разу
для этого нужно воспользоваться циклом
*/

    public static void main(String[] args) {
        int rows = 10;
        for (int i = 0; i < rows; i++) {

            for (int j = 0; j <= i; j++) {
                System.out.println("");
            }
            for (int x = 0; x <= i; x++) {
                System.out.print("*");
            }


        }
    }
}
