import java.util.Scanner;

public class exam {
    static String username = "";
    static String password = "";
    static int timeLimit = 1; // Time limit in minutes
    static int remainingTime = timeLimit * 60; // Time remaining in seconds
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        // Login
        System.out.print("Enter your username: ");
        username = input.nextLine();
        System.out.print("Enter your password: ");
        password = input.nextLine();
        
        // Update Profile and Password
        System.out.print("Do you want to update your profile and password? (yes or no) ");
        String update = input.nextLine();
        if (update.equals("yes")) {
            updateProfileAndPassword();
        }
        // Timer and auto submit
        System.out.println("You have " + timeLimit + " minutes to complete the exam.");
        System.out.println("The timer will start now.");
        
        // Selecting answers for MCQs
        System.out.println("Answer the following questions:");
        System.out.println("1. What is the capital of France?");
        System.out.println("a. Paris");
        System.out.println("b. Rome");
        System.out.println("c. Madrid");
        System.out.println("d. Berlin");
        System.out.print("Enter your answer (a, b, c or d): ");
        String answer1 = input.nextLine();
        
        System.out.println("2. Who is the CEO of Tesla?");
        System.out.println("a. Steve Jobs");
        System.out.println("b. Jeff Bezos");
        System.out.println("c. Elon Musk");
        System.out.println("d. Mark Zuckerberg");
        System.out.print("Enter your answer (a, b, c or d): ");
        String answer2 = input.nextLine();

        while (remainingTime > 0) {
            try {
                Thread.sleep(1000); // Sleep for 1 second
                remainingTime--;
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        System.out.println("Time's up!");
        submitAnswers(answer1, answer2);
        
        // Closing session and Logout
        System.out.println("Closing session...");
        logout();
        
        input.close();
    }
    
    public static void updateProfileAndPassword() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.print("Enter your email: ");
        String email = input.nextLine();
        System.out.print("Enter your new password: ");
        password = input.nextLine();
        System.out.println("Profile and password updated successfully.");
        input.close();
    }
    
    public static void submitAnswers(String answer1, String answer2) {
        System.out.println("Answers submitted successfully.");
    }
    
    public static void logout() {
        System.out.println("Logged out successfully.");
    }
}
