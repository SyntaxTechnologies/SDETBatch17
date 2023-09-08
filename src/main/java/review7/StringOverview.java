package review7;

public class StringOverview {

    public static void main(String[] args) {

        String phone="iPhone";

       String color=new String();
       color="Yellow";

       String day=new String("Thursday");

       String sentence = "   Today is September 7    ";

       int size=sentence.length();
        System.out.println(size);

        sentence=sentence.trim();//Today is September 7
        System.out.println(sentence);

        String[] words=sentence.split(" ");
        System.out.println(words[3]);

        String modifiedNewString=sentence.replace("Today", "tomorrow");
        System.out.println(modifiedNewString);

        String str1="Hi Hi Friends";
        str1=str1.replace("Hi", "Hello");
        System.out.println(str1);

        str1=str1.replaceAll("Hello", "Bye");
        System.out.println(str1);

        char letter=str1.charAt(2);
        System.out.println(letter);

        int indexOfCharB=str1.indexOf('B');
        System.out.println(indexOfCharB);

    }
}
