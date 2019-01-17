/* 
День недели
*/

import java.io.*;


public class Solution {
    public static void main(String[] args) throws Exception {
        //напишите тут ваш код
        
     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
     
   int numb = Integer.parseInt(reader.readLine());
     
     if( numb == 1)
        {
         System.out.println("понедельник");
        }
    if( numb == 2)
        {
         System.out.println("вторник");
        }
    if( numb == 3)
        {
         System.out.println("среда");
        }
    if( numb == 4)
        {
         System.out.println("четверг");
        }
    if( numb == 5)
        {
         System.out.println("пятница");
        }
    if( numb == 6)
        {
         System.out.println("суббота");
        }
    if( numb == 7)
        {
         System.out.println("воскресенье");
        }
    if( numb < 1 || numb > 7 )
        {
         System.out.println("такого дня недели не существует");
        }    
    }

}
