/**
 * @author: Caiden Henn
 * 2/19/2024
 * A Program to simulate a voting system consisting of an advanced class structure.
 */


package votingsystem;

import Exceptions.MinimumAgeException;


public class Voter extends Person{

    private int voterID;
    private boolean voted;


    public Voter(int VoterID, int age, char gender, String firstname, String lastname, String politicalParty /*,int voterID*/) throws MinimumAgeException{
        super(age, gender, firstname, lastname, politicalParty);
        if (super.getAge() < 18){
            throw new MinimumAgeException("Voters age cannot be less than 18");
        }
        this.voterID = voterID;
        this.voted = false;


    }

    public int getVoterID() {
        return voterID;
    }

public void voted(){
        voted = true;
}

    public boolean hasVoted() {
        return voted;
    }



    @Override
    public String getfullName(){
    return firstname + " " + lastname;
    }
}

