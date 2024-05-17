package com.model;

public class Candidate {
private int id;
	
private String name,district,party,resisdance;
private int age,vote=0;
public Candidate(int id,String name, int age, String district, String resisdance, String party) {
	this.id=id;
	this.name = name;
	this.district = district;
	this.party = party;
	this.resisdance = resisdance;
	this.age = age;
}

   


	public void SetVote(int vote) {
	   this.vote=this.vote+vote;
    }
     public String getParty() {
      return party;
   }
     public int getId() {
    		
    		return id;
    	}

      public String getName() {
	    return name;
    }

   public int getvote() {
    	return vote;            
    }

@Override
public String toString() {
	return "Candidate [id="+id+",name=" + name + " age=" + age +", district=" + district +  ", resisdance=" + resisdance
			+  " party=" + party + ", vote=" + vote + "]";
}






}
