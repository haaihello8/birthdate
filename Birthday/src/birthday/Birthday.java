

package birthday;
import java.text.*;
import java.util.*;
public class Birthday 
{

    public static void main(String[] args) 
    {
     String gd;
        do{
        Scanner get=new Scanner(System.in);
        System.out.println("Enter the Date: ");
        String fs=get.next();
        Date dd=new Date();
        
        SimpleDateFormat ft = 
        new SimpleDateFormat ("dd.MM.yyyy 'at' hh:mm:ss a zzz");
        String ss=ft.format(dd);
                
        String wq=fs.substring(0, 5);
        String we=ss.substring(0, 5);
              
       if (we.equals(wq))
        {
            System.out.println("Happy birthday!!!");
        }
        else
        {System.out.println("Today is  not your birthday");
        }
        System.out.println(" Do you Wish to continue?");
        gd=get.next();
        }while(gd.contains("y"));
                
    }
      
    }
