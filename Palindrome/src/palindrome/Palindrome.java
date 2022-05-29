package palindrome;

public class Palindrome {

    public static void main(String[] args) {

        String ORString = "MiNiM";
        String RevString = "";
        
        ORString = ORString.toLowerCase();
        char[] charORString = ORString.toCharArray();
        for(int i = ORString.toCharArray().length-1; i >= 0; i--)
        {
            RevString += charORString[i];
            
        }
        
        if(RevString.equals(ORString) == true)
        {
            System.out.println(RevString);
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println(RevString);
            System.out.println("not Palindrome");
        }
    }
    
}
