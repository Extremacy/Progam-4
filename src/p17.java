public class p17 {
    public static void main(String[] args) {
        String[] test = new String[2];
        test[0] = "mandy";
        test[1] = "man";
        System.out.println(test[0].compareTo(test[1]));
    }
    public static String firstWord(String[] words) {
        String result = words[0];
        for (String s: words
             ) {
            if (result.compareTo(s) > 0){
                result = s;
            }
        }
        return result;
    }
}
