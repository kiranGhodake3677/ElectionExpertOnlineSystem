package com.services;

import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

import com.model.Candidate;
import com.model.VoterReg;

public class Voting  {
	
	Scanner sc=new Scanner (System.in);

  HashSet<VoterReg> v1=new HashSet<>();
  Set<Candidate> c=new HashSet<>();
  
  
  public void voterReg()throws AdharException {
	  System.out.println("Enter your name :=");
	  String name=sc.next()+sc.nextLine();
	  
	  long adharno = 0;
	  try {
	  System.out.println("Enter your BirthDate in YYYY-MM-DD Format :=");
	  String date=sc.next()+sc.nextLine();
	  LocalDate dob=LocalDate.parse(date);
	  
	  if(calculateAge(dob)>=18) {
		  System.out.println("Enter your address:=");
		  String addrs=sc.next()+sc.nextLine();
		
		try {
			System.out.println("Enter your AdharNo:=");
			  adharno = sc.nextLong();
			  String adharString = Long.toString(adharno);
			  if(adharString.length() == 12)
			  {
				  
				  int id=(int)(Math.random()*10+1);
				  System.out.println("your Voter id is:="+id);
				  
				  VoterReg v=new VoterReg(id, name, addrs, adharno, date, calculateAge(dob));
				  v1.add(v);
			  
			  }else {
				  throw new AdharException("Invalid adhar number:");
			  }
			  
		   
		}catch (AdharException e) {
				
				 System.out.println("Invalid input. Please enter a valid Aadhar number:");
	            //  e.printStackTrace();
			}
	  }
	  else {
		  System.out.println("your age is not eligible for voting..");
  }
	  
}catch(Exception e){
	  System.out.println("plese Insert BirthDate  YYYY-MM-DD this Format..");
}
	  
}
  
public static int calculateAge(LocalDate dob) {
	LocalDate currDate=LocalDate.now();
	if(dob !=null && currDate !=null) {
		return Period.between(dob, currDate).getYears();
	}else {
		return 0;
	}
}
public void displaVoter() {
	boolean empty=false;
	System.out.println("____________________***Voter List***_____________________");
	for(VoterReg i:v1) {
		System.out.println(i);
		empty=true;
		
	}
	if(empty==false) {
		System.err.println("Voter list is Empty..");
	}
}
public void candidateReg() {
	Candidate c0=new Candidate(101,"IRON MAN", 25, "Solapur"," Pandharpur","BJP" );

	Candidate c1=new Candidate(102,"SPIDER MAN", 26, "Solapur"," Pandharpur","NCP" );
	Candidate c2=new Candidate(103,"BAT MAN", 22, "Solapur"," Pandharpur","AAP" );
	
	c.add(c0);
	c.add(c1);
	c.add(c2);
	
	
	
	
}	
public void vote() {
	System.out.println("Enter your voter id:");
	int vId=sc.nextInt();
	boolean check=false;
	VoterReg temp=null;
	for(VoterReg i:v1) {
		if(i.getId()==vId) {
			check=true;
			temp=i;
			break;
		}
	}
	if(check==true) {
		if(temp.getVoting()==false) {
			System.out.println("These candidate eligible for voting..:=");
			for(Candidate i:c) {
				System.out.println(i);
			}
			boolean cond=true,checkcanId=false;
			
			while(cond) {
				System.out.println("Enter id to you want vote:=");
				int id=sc.nextInt();
				boolean ch=false;
				for(Candidate i:c) {
					if(i.getId()==id) {
						ch=true;
					}
				}
				if(ch!=true) {
					System.out.println("Invalid Candidate Id Enter Again: ");
					id=sc.nextInt();
				}
				for(Candidate i:c) {
					if(i.getId()==id) {
						switch(1) {
						case 1:
							i.SetVote(1);
							temp.isVoting(true);
							cond=false;
							System.out.println("your vote is sucessfully..");
							break;
						}
					}
						
									}
				cond=false;
			}
		}else {
			System.out.println("Voter is all ready voting..:");
		}
	}else {
		System.out.println("Voter Id is Invalid..:");
	}
}


	public void result() {
	     int max=Integer.MIN_VALUE;
	     
	     for(Candidate i:c) {
	    	 if(max<i.getvote()) {
	    		 max=i.getvote();
	    	 }
	     }
	     for(Candidate i:c) {
	    	 System.out.println("\tId:= "+i.getId()+"\t    Name:= "+i.getName()+"\t     vote:= "+i.getvote());
	     }
	     System.out.println("___________****WINNER***__________");
	     for(Candidate i:c) {
	    	 if(max==i.getvote()) {
	    		 System.out.println("\tId:= "+i.getId()+"\t    Name:= "+i.getName()+"\t     vote:= "+i.getvote());
	    	 }
	     }
	}


}




