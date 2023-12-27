class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
        // Reverse the string str
        String rev="";
        for(int i=0;i<str.length();i++){
            rev=str.charAt(i)+rev;
        }
        return rev;
    }
}
