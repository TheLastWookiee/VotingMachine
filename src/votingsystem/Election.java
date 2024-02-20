/**
 * @author: Caiden Henn
 * 2/19/2024
 * A Program to simulate a voting system consisting of an advanced class structure.
 */







package votingsystem;

import Exceptions.MinimumAgeException;
import Exceptions.MissingCandidateException;

public class Election {
        public static void main(String[] args) {
            try {
                // Create candidates
                Candidate candidate1 = new Candidate(30, 'M', "Jonson", "Django", "Democrat");
                Candidate candidate2 = new Candidate(35, 'F', "Gertrude", "Jar", "Republican");
                Candidate candidate3 = new Candidate(40, 'M', "Milford", "Johnson", "Non-Affiliate");

                Candidate[] candidates = {candidate1, candidate2, candidate3};

                // Create voting machine
                VotingMachine votingMachine = new VotingMachine(candidates);

                // Create voters
                Voter voter1 = new Voter(1, 25, 'M', "Alice", "Brown", "Independent");
                Voter voter2 = new Voter(2, 20, 'F', "Bob", "White", "Democrat");
                Voter voter3 = new Voter(3, 30, 'M', "Charlie", "Green", "Republican");

                // Cast votes
                votingMachine.vote(voter1, candidate1);
                votingMachine.vote(voter2, candidate1);
                votingMachine.vote(voter3, candidate2);

                // Tally votes
                votingMachine.tally();
            } catch (MinimumAgeException | MissingCandidateException e) {
                System.err.println(e.getMessage());
            }
        }
    }

