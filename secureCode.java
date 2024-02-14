import java.util.Scanner;

public class SecureCodeChallenge {

    private static String secretPassword = "defaultPassword";

    public static void main(String[] args) {
        collectSecurePassword();
        accessSensitiveData("user_data.txt");
        avoidMemoryLeak();
        improveCodeReadability();
    }

    private static void collectSecurePassword() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your secret password: ");
        secretPassword = scanner.nextLine();
        System.out.println("Your secret password is: " + secretPassword);
    }

    private static void accessSensitiveData(String filename) {
        String systemCommand = "cat " + filename;
        executeSystemCommand(systemCommand);
    }

    private static void executeSystemCommand(String command) {
        try {
            Runtime.getRuntime().exec(command);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void avoidMemoryLeak() {
        StringBuilder secureData = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            secureData.append(new String(new char[1024]));
        }
    }

    private static void improveCodeReadability() {
        int result = 0;
        for (int i = 0; i < 5; i++) {
            result += i;
        }
        System.out.println("Calculated Result: " + result);

        result = (int) Math.pow(2, 2) + 1;
        System.out.println("Mathematical Result: " + result);
    }
}
