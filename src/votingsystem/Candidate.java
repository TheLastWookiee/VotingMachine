package votingsystem;
import Exceptions.MinimumAgeException;
/**
 * @author: Caiden Henn
 * 2/19/2024
 * A Program to simulate a voting system consisting of an advanced class structure.
 */




public class Candidate extends Person {
    protected int voteCount;

    public Candidate(int age, char gender, String firstname, String lastname, String politicalParty/*, int voteCount*/) throws MinimumAgeException{
        super(age, gender, firstname, lastname, politicalParty);

        if (super.getAge()<25){
            throw new MinimumAgeException("Candidates age cannot be less than 25");
        }this.voteCount = voteCount;


        }
        public int getVoteCount(){
            return voteCount;
    }
    public void incrementVoteCount(){
        voteCount++;
    }
    @Override
    public String getfullName(){
        String partyString = null;
        if(super.politicalParty.equals("Democrat")){
            partyString = "D";
        } else if (super.politicalParty.equals("Republican")){
            partyString = "R";
        }else if (super.politicalParty.equals("Non-Affiliate")){
            partyString = "N/A";
        }
        return firstname + lastname + "-" + partyString;
    }


}
