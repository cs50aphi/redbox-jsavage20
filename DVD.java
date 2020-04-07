public class DVD
{
   //Declare the class variables.
   String title;
   int copies;
   int AvCopies;
   /** the title of the DVD */

   /** the number of available copies */


   /** Constructs a DVD object and sets the number of copies
    *  to 1.
    *  @param t the title of the DVD
    */

   public DVD(String t)
   {
      title = t;
      copies = 1;
      AvCopies = 1;
   }

   /** Increments the number of available copies of this DVD.
    */
   public void incrementCopies()
   {
      AvCopies++;
   }

   /** Decrements the number of available copies of this DVD.
    */
   public void decrementCopies()
   {
      AvCopies--;
   }

   /** Gets the title of this DVD.
    *
    *  @return the title of the DVD.
    */
   public String getTitle()
   {
      return title;
   }

   /** Gets the number of available copies for this DVD.
    *
    *  @return the number of available copies.
    */
   public int getNumCopies()
   {
      return AvCopies;
   }

   /** Returns a representation of this DVD object as a
    *  String in the format <title> copies: <num. copies>.
    *
    *  @return the String representation of the DVD.
    */

   public String toString()
   {
      return title + " copies: " + AvCopies;
   }

}
