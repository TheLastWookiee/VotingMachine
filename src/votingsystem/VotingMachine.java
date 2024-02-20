/**
 * @author: Caiden Henn
 * 2/19/2024
 * A Program to simulate a voting system consisting of an advanced class structure.
 */


package votingsystem;
import Exceptions.MissingCandidateException;

public class VotingMachine {
    public Candidate candidates[];

    public VotingMachine (Candidate[] candidate) throws MissingCandidateException {
        if(candidates.length == 0 || candidates == null){
            throw new MissingCandidateException("The candidate list cannot be null or empty");
        }

        this.candidates = candidate;

    }
    public void vote( Voter v, Candidate c){
        if (!v.hasVoted()){
            c.incrementVoteCount();
            v.voted();
        }
    }
    public void tally(){
        Candidate winner = candidates[0];
        for (int i =0; i< candidates.length; i++){
            System.out.println(candidates[i].getfullName() +
                    " has " + candidates[i].getVoteCount() +" votes");
            if (candidates[i].getVoteCount() > winner.getVoteCount()){
                winner = candidates[i];

            }

        }
        System.out.println(winner.getfullName() + "won with " +winner.getVoteCount() +" votes");
    }
}
