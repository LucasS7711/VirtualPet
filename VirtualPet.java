import java.util.Scanner;

public class VirtualPet {

   public static void main(String[] args) {

      Scanner input = new Scanner(System.in);

      int happiness = 5;
      int hunger = 5;
      int energy = 5;
      int choice = 0;

      System.out.println("Welcome to Virtual Pet Simulator!");
      System.out.println("Your pet's name is Mr. Pickles.");
      while (happiness < 15 && hunger < 10 && energy > 0 && choice != 5) {
         System.out.println("-------------------------\nHappiness: " + happiness + "\nHunger: " + hunger + "\nEnergy: " + energy + "\n-------------------------");
         System.out.println("What would you like to do?");
         System.out.println("1. Feed");
         System.out.println("2. Play");
         System.out.println("3. Sleep");
         System.out.println("4. Bath");
         System.out.println("5. Quit");     
         choice = input.nextInt();
         if (choice == 1) {
            happiness ++;
            hunger -= 3;
            System.out.println("Tasty!");
         } else {
            if (choice == 2) {
               happiness += 3;
               hunger += 2;
               energy -=2;
               System.out.println("Fun!");
            } else {
               if (choice == 3) {
                  happiness --;
                  hunger ++;
                  energy += 3;
                  System.out.println("Zzzzzz...");
               } else {
                  if (choice == 4) {
                     happiness += 2;
                     hunger ++;
                     energy --;
                     System.out.println("All clean!");
                  } else {
                     if (choice == 5) {
                     } else {
                        System.out.println(choice + " is not a valid option. Try again!");
                     }
                  }
               }
            }
         }
         
      }
      System.out.println("-------------------------\nHappiness: " + happiness + "\nHunger: " + hunger + "\nEnergy: " + energy + "\n-------------------------");
      if (hunger >= 10) {
         System.out.println("Pet starved. :(");
      } else {
         if (energy <= 0) {
            System.out.println("Pet ran out of battery...");
         } else {
            if (happiness >= 15) {
               System.out.println("Success! Pickles is happy :)");
            } else {
               System.out.println("Quitting already?");
            }
         }
      }
      input.close();
   }
}