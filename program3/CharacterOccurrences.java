class CharacterOccurrences
{
    public static void main(String[] args)
    {
        String str = "naveen Garg naveen";
        int count = str.length() - str.replace("e", "").length();
        System.out.println("Number of occurances of 'e' in "+ str +" = "+count);
    }
}
