package com.user;

import java.util.Scanner;

import com.services.AdharException;
import com.services.Voting;

public class Test {
public static void main(String[] args) throws AdharException {
	Scanner sc=new Scanner(System.in);
	Voting v=new Voting();
	v.candidateReg();
	 System.out.println("_____________***Welcome To ElectionExpertOnline Project***_________");
	while(true) {
		System.out.println("\n1.Voter Registation\n2.Show Voter List\n3.vote\n4.show result\n5.Exit");
		System.out.println("What do you want to do ?....");
		int ch=sc.nextInt();
		
		switch(ch) {
		case 1:
			v.voterReg();
			break;
		
		case 2 :
			
			v.displaVoter();
			
			break;
		
		case 3:
			v.vote();
			break;
			
	case 4:
		v.result();
		break;
	case 5:
		System.out.println("_______________****Application Closed****_________________");
		System.exit(0);
		break;
		default :
			
			System.out.println("Wrong Choice code...!!!!");
		}
		
	}
}
}
