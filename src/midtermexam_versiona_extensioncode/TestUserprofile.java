package midtermexam_versiona_extensioncode;
/**
 * Aleks Bechard
 */
public class TestUserprofile
{
   public static void main (String[] args)
   {
      UserProfile profile = new UserProfile("54321", "Comedy");

      System.out.println(profile.getGenre());
      System.out.println(profile.getUserID());
   }
}
