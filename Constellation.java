import java.util.*;
import java.io.*;
public class Constellation {
    public static void main(String []args)
    {
    String ans="";
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();sc.nextLine();
    String s[]=new String[3];
    int count=0;
    for(int i=0;i<3;i++)
    {
        s[i]=sc.nextLine();
    }
    int t=0,p=0,q=0;
    for(int i=0;i<n;i++)
    {
        count++;
        
        if(s[0].charAt(i)=='.' && s[1].charAt(i)=='.' && s[2].charAt(i)=='.')
        {
                t=i+1;
                count--;
                continue;
        }
        else if(s[0].charAt(i)=='#'||(count==3))
        {
            count=0;
            p=0;q=0;
            String[][] arr=new String[3][3];
            for(int j=0;j<3;j++)
            {
                for(int k=t;k<=i;k++)
                {
                arr[p][q++]=""+s[j].charAt(k);
                }
                p++;
                q=0;
            }
            
            // System.out.println("\n\n\n");
            if(printA(arr))
                ans=ans+"A";
            else if(printE(arr))
                ans=ans+"E";
            else if(printI(arr))
                ans=ans+"I";
            else if(printO(arr))
                ans=ans+"O";
            else if(printU(arr))
                ans=ans+"U";
            t=i+1;
            if(s[0].charAt(i)=='#')
                ans=ans+"#";
        }
        
        else
        {
            // count++;
        }
    }
    System.out.println(ans);
    }
       
             
             
    static boolean printA(String[][] arr){              // Function for A
        String arrayA[][]={{".","*","."},{"*","*","*"},{"*",".","*"}};
        for(int i=0;i<3;i++)
        {
          for(int j=0;j<3;j++)
          {
            if(!(arr[i][j].equals(arrayA[i][j])))
              return false;
          }
        }
        return true;
    }
    
    static boolean printE(String arr[][]){              // Function for E
        String arrayE[][]={{"*","*","*"},{"*","*","*"},{"*","*","*"}};
        for(int i=0;i<3;i++)
        {
          for(int j=0;j<3;j++)
          {
           if(!(arr[i][j].equals(arrayE[i][j])))
              return false;
          }
        }
        return true;
    }
    
    
    
    static boolean printI(String arr[][]){              // Function for I
        String arrayI[][]={{"*","*","*"},{".","*","."},{"*","*","*"}};
        for(int i=0;i<3;i++)
        {
          for(int j=0;j<3;j++)
          {
           if(!(arr[i][j].equals(arrayI[i][j])))
              return false;
          }
        }
        return true;
    }
    static boolean printO(String arr[][]){              // Function for O
    
        String arrayO[][]={{"*","*","*"},{"*",".","*"},{"*","*","*"}};
        for(int i=0;i<3;i++)
        {
          for(int j=0;j<3;j++)
          {
           if(!(arr[i][j].equals(arrayO[i][j])))
              return false;
          }
        }
        return true;
    }
    static boolean printU(String[][] arr){              // Function for U
    
        String[][] arrayU={{"*",".","*"},{"*",".","*"},{"*","*","*"}};
        for(int i=0;i<3;i++)
        {
          for(int j=0;j<3;j++)
          {
            if(!(arr[i][j].equals(arrayU[i][j])))
              return false;
          }
        }
        return true;
    }  
    
}