import java.util.Scanner;

public class Input_example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean correct;
		boolean done = false;
		Scanner myInput;
		while(done == false)
		{
			correct = false;
			
			do {
				System.out.print("Please input only number : ");
				myInput = new Scanner(System.in);
				String input = myInput.nextLine();
				char[] charInput = input.toCharArray();
				for(int i = 0; i < charInput.length; i++)
				{
					if(charInput[i] >= '0' && charInput[i] <= '9')
					{
						correct = true;
						
					}
					else
					{
						correct = false;
						System.out.println("Your input false");
						break;
					}
				}
				if(correct == true)
				{
					
					System.out.println("Your input is : " + String.valueOf(input));
				}
			}while(correct == false);
			
			correct = false;
			
			do {
				System.out.print("Please input only alphabet : ");
				myInput = new Scanner(System.in);
				String input = myInput.nextLine();
				char[] charInput = input.toCharArray();
				for(int i = 0; i < charInput.length; i++)
				{
					
					if((charInput[i] >= 'A' && charInput[i] <= 'Z') || (charInput[i] >= 'a' && charInput[i] <= 'z'))
					{
						correct = true;
						
					}
					else
					{
						correct = false;
						System.out.println("Your input false");
						break;
					}
				}
				if(correct == true)
				{
					System.out.println("Your input is : " + String.valueOf(input));
				}
			}while(correct == false);
			
			correct = false;
			
			
			System.out.print("Wanna stop ?(Y/N) : ");
			myInput = new Scanner(System.in);
			String input = myInput.nextLine();
			char[] charInput = input.toCharArray();
				
			if(Character.toUpperCase(charInput[0]) == 'Y')
			{
				done = true;
			}
			else
			{
				done = false;
			}	
		}
	}
}
