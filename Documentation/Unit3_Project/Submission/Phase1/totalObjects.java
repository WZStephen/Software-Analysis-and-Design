package P2_Directory_Management_System_Phase_I;

public class totalObjects
{
   private static int numObjects = 0;

   public totalObjects() {
      numObjects=0;
   }

   public void objectAdded() {
      numObjects++;
   }

   public int getTotalObjects() {
      return numObjects;
   }
}