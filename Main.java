package siguri;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

 public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.print("\n---Ky është algoritmi i enkriptimit/deshifrimit të Beale Ciphers që përdor një dokument teksti si libër!---\n");

      
       System.out.print("\nJu mund të shkruani encrypt për enkriptim, decrypt për dekriptim ose stop për të ndaluar programin që funksionon: ");
       String answer = input.nextLine().toLowerCase();
       answer = answer.replaceAll(" ", "");
       if (args.length == 0) {
       
           if (answer.equals("encrypt")) {
               System.out.println("\nJu zgjodhët enkriptimin\n");
               System.out.print("Futni tekstin që dëshironi të kriptoni: ");
               String plaintext = input.nextLine().toLowerCase();
               System.out.println(Encrypt.encrypt(plaintext, readFile()));
           } else if (answer.equals("decrypt")) {
               System.out.println("\nJu zgjodhët dekripitimin\n");
               System.out.print("Futni tekstin që dëshironi të dekriptoni:");
               String ciphertext = input.nextLine().toLowerCase();
              System.out.println(Decrypt.decrypt(ciphertext, readFile()));
           } else if (answer.equals("stop")) {
          System.out.println("\nProgrami po ndalon...");
       
           }
         
           }
          
           input.close();
       }
       
   


   public static String readFile() {

       String addNumber = "";

       try {
           File file = new File("/Users/qendr/OneDrive/Desktop/Siguri_Projekt2/book.txt");
           Scanner fileReader = new Scanner(file);
           while (fileReader.hasNextLine()) {
                 String text = fileReader.nextLine().toLowerCase();
                 String[] arrayOfText = text.split(" ");
                 int count = 1;
                 for (int i = 0; i < arrayOfText.length; i++, count++) {
                     addNumber += (arrayOfText[i] + count + " ");
                 }
             }
             fileReader.close();

         } catch (FileNotFoundException e) {
             System.err.println("\nNdodhi një gabim. Sistemi nuk mund ta gjejë skedarin e specifikuar.\n");
             e.printStackTrace();
             System.exit(1);
         }
         return addNumber;

  }
  }
