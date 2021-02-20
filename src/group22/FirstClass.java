package group22;

public class FirstClass{
    public static void main(String[] args) {
        System.out.println("Hello");

        String word = "Sergii";
        //             012345

       /* for(int i=word.length()-1; i>=0;i-- ){
            System.out.print(word.charAt(i));
        }

        */

        String result = "";
        for(int i=word.length()-1; i>=0;i-- ){
            result += word.charAt(i);
        }
        System.out.println(result);



    }
}

