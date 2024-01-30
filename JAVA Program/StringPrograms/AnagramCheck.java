import java.util.Arrays;
public class AnagramCheck{
   public static boolean checkAnagram(String inputStr1, String inputStr2) {
      // converting their characters to lowercase
      inputStr1 = inputStr1.toLowerCase();
      inputStr2 = inputStr2.toLowerCase();
      // to check both strings are anagram or not
      if(inputStr1.length() == inputStr2.length()) { // checking length
         // converting the given strings into character arrays
         char[] array1 = inputStr1.toCharArray();
         char[] array2 = inputStr2.toCharArray();
         // sorting both arrays
         Arrays.sort(array1);
         Arrays.sort(array2);
         // checking the characters are same or not
         for (int i = 0; i < array1.length; i++) {
            if ( array1[i] !=  array2[i]) {
               return false;
            } 
         }
      } 
      return true;
   }
   public static void main(String[] args) {
      // initializing two Strings
      String inputStr1 = "Race";
      String inputStr2 = "Care";
      System.out.println("The given strings are: " + inputStr1 +" and " + inputStr2);
      // calling the method to check anagram
      if(checkAnagram(inputStr1, inputStr2)) {
         System.out.println("Both strings are anagram");
      } else {
         System.out.println("Both strings are not anagram.");
      }
   }
}