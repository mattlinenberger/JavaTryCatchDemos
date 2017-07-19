import java.util.*;

public class TryCatchDemo2
{
   public static void main( String args [ ] )
   {
      int age;
      Scanner in = new Scanner( System.in );
      try
      {
         System.out.print( "Enter your age: " );
         age = in.nextInt( );
         if ( age < 0 )
            throw new RuntimeException( );
         System.out.println( age + " years" );
      }
      catch ( InputMismatchException e )
      {
         System.out.println( "Bad integer" );
      }
      catch ( RuntimeException e )
      {
         System.out.println( "Age cannot be negative" );
      }
   
      System.out.println( "Goodbye" );
   }
}
