package Guess;

import java.util.Random;
import java.util.Scanner;

public class guessNumber
{
  public static void main(String[]args)
  {
	  Scanner sc=new Scanner(System.in);
	  System.out.println("welcome to the NUMBER GAME!!!...");
	  //create random class object to generate random numbers
	  Random r=new Random();
	  int randomnumber=r.nextInt(100)+1;//1 is included and 101 is excluded means random number are generated in between 1 t0 100
	  boolean hasguesscorrectly=false;
	  int gnum=0;
	  int attempt=0;
	  int totalscore=0,totalround=0;
	  int limitattempt=10;
	  System.out.println("You have use attempt for  guess a number is "+"="+ limitattempt);
	  while(attempt<limitattempt && !hasguesscorrectly)
	  {
		  System.out.println("enter the guess number for generated number in between 1 to 100 ");
		  gnum=sc.nextInt();
		  attempt++;
		  
		  if(gnum==randomnumber)
		  {
			  System.out.println("the guess number is correct");
			  hasguesscorrectly=true;
		  }
		  else if(gnum>randomnumber)
		  {
			  System.out.println("too high");
			  
		  }
		  else if(gnum<randomnumber)
		  {
			  System.out.println("too low");
			  
		  }
		  else
		  {
			  System.out.println("Congress You guess the correct number");
		  }
		  
	  }
	  if(!hasguesscorrectly)
	  {
		  System.out.println("Sorry,you used all attempt please try again!..");
	  }
	  //if the user guess correctly then our score increase by 1
	  totalscore=totalscore+(hasguesscorrectly?1:0);
	  totalround++;
	  
	  System.out.println("Your total score is = "+totalscore);
	  System.out.println("Your total round is = "+totalround);
	  
  }

}
