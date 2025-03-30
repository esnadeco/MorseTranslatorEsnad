import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MorseCodeTranslator translator = new MorseCodeTranslator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välkommen till din morsekonverterare!");


        while (true) {
            System.out.println("Välj ett alternativ;");
            System.out.println("1. Översätt engelska till morsekod");
            System.out.println("2. Översätt morsekod till enegelska");
            System.out.println("3. Avsluta");

            int choice;
            try {
                choice = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Ogilitg input. Ange 1-3");
                scanner.nextLine();
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.println("Skriv den text du vill översätta till morse");
                    String text = scanner.nextLine();
                    System.out.println("Här är din översättning: " + translator.textToMorse(text));  //TODO: Lägg in funktion
                    break;

                case 2:
                    System.out.println("Skriv den morsekod du vill översätta");
                    String morse = scanner.nextLine();
                    System.out.println("Här är din översättning: " + translator.morseToText(morse)); //TODO: Lägg in funktion
                    break;

                case 3:
                    System.out.println("Avslutar programmet");
                    scanner.close();

                    return;


                default:
                    throw new IllegalArgumentException("Ogiltig input. Vänligen ange Siffror 1-3");
            }

        }


    }
    }
