 

public class LoopFun
{

      /**
       * Given a number, return the factorial of that number.
       * For example, given 5, the factorial is 5 x 4 x 3 x 2 x 1 which should return 120.
       * @param number
       * @return the factorial of the number
       */
      public Integer factorial(Integer number){
          Integer factorialValue = 1;
          for(int counter = 1; counter <= number ; counter ++)
          {
              factorialValue *= counter;
          }
          return factorialValue;
      }

      /**
       * Given a phrase, get the acronym of that phrase. Acronym is the combination of
       * the first character of each word in upper case.
       * For example, given "Ruby on Rails", this method will return "ROR"
       * @param phrase
       * @return Upper case string of the first letter of each word
       */
      public String acronym(String phrase) {
          String[] wordsList = phrase.split(" ");
          String acronym = "";
          for(int count = 0 ; count < wordsList.length; count++){
              acronym += Character.toUpperCase(wordsList[count].charAt(0));
          }
          
          return acronym;
      }

      /**
       * To prevent anyone from reading our messages, we can encrypt it so it will only be readable by its
       * intended audience. This method encrypt the message by shifting the letter by 3 characters. If the character is
       * at the end of the alphabet, it will wraps around.
       * For example:
       *  'a' => 'd'
       *  'w' => 'z'
       *  'x' => 'a'
       *  'y' => 'b'
       * @param word
       * @return the encrypted string by shifting each character by three character
       */
      public String encrypt(String word) {
          String outString = "";
        for(int counter = 0; counter < word.length(); counter ++)
        {
            char charValue = (char)(word.charAt(counter) + 3);
            if(charValue > 'z') 
                charValue = (char)('a' + (char) (charValue - 'z' - 1));
            outString += String.valueOf(charValue);
            
        }
        return outString;
      }
}
