/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

public class Palindrome {

    public static void main(String[] args) {
        // TODO code application logic here
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
