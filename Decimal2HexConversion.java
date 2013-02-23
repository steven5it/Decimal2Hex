import java.util.Scanner;
public class Decimal2HexConversion 
{
	public static void main (String[]args)
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter a decimal nuber: ");
		int decimal = sc.nextInt();
		
		System.out.println("The hex number for decimal " + decimal + " is " + decimalToHex(decimal));
		
	}
	public static String decimalToHex(int decimal)
	{
		String hex = "";
		
		while (decimal != 0)
		{
			int hexValue = decimal % 16;
			hex = toHexChar (hexValue) + hex;
			decimal = decimal/16;
		}
		return hex;
	}
	public static char toHexChar (int hexValue)
	{
		if (hexValue <= 9 && hexValue >= 0)
			return (char)(hexValue + '0');
		else
			return (char)(hexValue - 10 + 'A');
	}

}
