
package javaarrayex;
public class ArrayEx3 {
    
    public static void declare()
    {
    int[] Age = {12,13,12,11,14};
            
    System.out.println("Age is " +Age[0]);
    System.out.println("Age is " +Age[1]);
    System.out.println("Age is " +Age[2]);
    System.out.println("Age is " +Age[3]);
    System.out.println("Age is " +Age[4]);
    }
    
    public static void twodimension()
    {
    String [][] NameAge = new String[2][4];
    
    NameAge[0][0]="John";
    NameAge[1][0]="12";
    
    NameAge[0][1]="David";
    NameAge[1][1]="13";
    
    NameAge[0][2]="Johnny";
    NameAge[1][2]="13";
    
    NameAge[0][3]="Harry";
    NameAge[1][3]="12";
    
    //using nested for-loop
    
        for (int i = 0; i < NameAge[i].length; i++)//2
        {
            
            for (int j = 0; j < NameAge[i][j].length(); j++) //4
            {
                System.out.println("Name and Age is " +NameAge[i][j]);
            }
        }
    
    }
    
    public static void main(String[] args)
            
    {
    declare();
    twodimension();
    }
}
