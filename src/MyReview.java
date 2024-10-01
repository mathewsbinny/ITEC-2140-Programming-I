public class MyReview {
    public static void main(String[] args) {
        System.out.println(reverseDoubleChar("The"));
        System.out.println(reverseDoubleChar2("AABB"));
        System.out.println(reverseDoubleChar3("String"));
    }

    //Fixed method so it prints reversed String "eehhTT"
    public static String reverseDoubleChar(String word){
        String result = "";
        char ch;
        for(int i = word.length() - 1; i >= 0 ; i--)
        {
            ch = word.charAt(i); //extracts each character
            result = result + ch + ch; //adds each character at the end of the existing string
        }
        return result;

    }

    //Fixed method so it prints reversed String "BBBBAAAA"
    public static String reverseDoubleChar2(String word){
        String result = "";
        char ch;
        for(int i = word.length() - 1; i >= 0 ; i--)
        {
            ch = word.charAt(i); //extracts each character
            result = result + ch + ch; //adds each character at the end of the existing string
        }
        return result;
    }

    //Fixed method so it prints reversed String "ggnniirrttSS"
    public static String reverseDoubleChar3(String word){
        String result = "";
        char ch;
        for(int i = word.length() - 1; i >= 0 ; i--)
        {
            ch = word.charAt(i); //extracts each character
            result = result + ch + ch; //adds each character at the end of the existing string
        }
        return result;
    }
}