public class findindex {

    public static void main (String[] args) {
        
        String s = "I am engineer";
        char character = 'g';
        int indexFirst = 1;
        
        for(int index = 1; index < s.length(); index++)
          {
            if(s.charAt(index) == character)
            {
              indexFirst = index+1;
              break;
            }
          }
        System.out.println(indexFirst);
    }

}