import java.util.*;

public class TryCatchDemo1
{
   public static void main( String args [ ] )
   {
      int age;
      Scanner in = new Scanner( System.in );
      try
      {
         System.out.print( "Enter your age: " );
         // nextInt may throw an exception
         age = in.nextInt( );
         // it didn't
         System.out.println( age + " years" );
      }
      // nextInt threw an exception
      catch ( InputMismatchException e )
      {
         System.out.println( "Bad integer" );
      }
      System.out.println( "Goodbye" );
   }
}
