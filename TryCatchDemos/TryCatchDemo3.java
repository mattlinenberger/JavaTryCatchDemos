import static javax.swing.JOptionPane.*;

public class TryCatchDemo3
{
   public static void main( String args [ ] )
  {
      String prompt, input;
      prompt = "Enter your age";
      int age;
      try
      {
         input = showInputDialog( prompt );
         if ( input == null )
            throw new NullPointerException( );
         // parseInt may throw NumberFormatException
         age = Integer.parseInt( input );
         if ( age < 0 )
            throw new IllegalArgumentException( );
        // no exceptions
         showMessageDialog( null, age + " years" );
     }
      catch ( NullPointerException e )
      {
         showMessageDialog( null, "Operation cancelled" );
      }
      catch ( NumberFormatException e )
      {
         showMessageDialog( null, e.getMessage( ) 
            + " is not an integer" );
      }
      catch ( IllegalArgumentException e )
      {
         showMessageDialog( null, "Age cannot be negative" );
      }
      showMessageDialog( null, "Goodbye" );
   }
}
