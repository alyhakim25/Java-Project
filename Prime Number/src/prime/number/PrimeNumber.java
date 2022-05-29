
package prime.number;

public class PrimeNumber {

    public static void main(String[] args) {
        int number = 250;
        String[] primeNumber = new String[number];
        
        boolean prime;
        int intPrime = 0;
        for(int i = 2; i < number; i++)
        {
            prime = true;
            for(int j = 2; j < i; j++)
            {
                if(i % j ==0)
                {
                    prime = false;
                    break;
                }
            }
            if(i == 2)
            {
                prime = false;
            }
            if(prime == true)
                {
                    //System.out.println(String.valueOf(i) +" is Prime");
                    primeNumber[intPrime] = Integer.toString(i);
                    intPrime++;
                }
            else
            {
                //System.out.println(String.valueOf(i) + " is not Prime");
            }
        }
        String[] Result = new String[intPrime];
        for(int i = 0; i < intPrime; i++)
        {
            Result[i] = primeNumber[i];
        }
        for(int i = 0; i < Result.length; i++)
        {
            System.out.print(Result[i] + ",");
        }
        // TODO code application logic here
    }
    
}
