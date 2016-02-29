import java.util.Scanner;


public class Encoding {
     public static void main(String args[])
     {    
    System.out.print("Enter your Email ID: ");
    Scanner scanner = new Scanner(System.in);
    String Email = "mhulmani2014@my.fit.edu";//scanner.nextLine();
    String result = encoding(Email);
    System.out.println("Encoding after algorithm 1 : "+result);
    String result1 = ShortEncode(Email);
    System.out.println("Encoding after algorithm 2 : "+result1);  
    }
//Algoithm 1
public static String encoding(String s)
     {
         int i = 0;
         String t = "";
         while(i < s.length())
            {
                char c = s.charAt(i);
                if (Character.isUpperCase(c))
                    t = t+'U';
                else if (Character.isLowerCase(c))
                    t=t+'L';
                else if(Character.isDigit(c))
                    t=t+'D';
                else
                    t=t+'O';
                        
                i++;     
            }
         return t;

     }
//Algorithm 2
public static String ShortEncode(String s)
     {
        if(s.length()>0)
        {
		int i=0,j=0;
         String result1 = encoding(s);
         System.out.println(result1);
         StringBuilder curr= new StringBuilder("");
         StringBuilder t=new StringBuilder("");
         curr.append(result1.charAt(i)); 
        
         while(i<result1.length())
         {
             char c = result1.charAt(i);
            // System.out.println(i);
             //System.out.println(curr.length()+" "+curr.charAt(i));
             if(curr.charAt(j)!=c)
             {
                 t.append(c);
                 curr.append(c);
                 j++;
                 //curr=""+result1.charAt(i);
             } 
             i++;                  
         }
         return t.toString();
         
        }
        else 
        	return "Required String length should be greater than 0";
     }

}