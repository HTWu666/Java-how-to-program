package ex7_18;

import java.security.SecureRandom;

public class GameOfCraps {
    private static SecureRandom random = new SecureRandom();
    private enum Status{WON, LOST, CONTINUE};

    public static void main(String[] args) {
        int numberOfGames = 1000000;
        int[] winCount = new int[22];
        int[] loseCount = new int[22];
        int rollTimes = 0;
        int totalRolls = 0;
        int totalWon = 0;
        Status gameStatus;
        int myPoint = 0;
        double[] winPosibilityOfRolls = new double[22];

        //Play Craps for 1,000,000 times
        for (int i = 1; i <= numberOfGames; i++) {
        	int sumOfDice = rollDice();
        	rollTimes++;
        	
        	switch(sumOfDice) {
        		case 7:
        		case 11:
        			gameStatus = Status.WON;
        			winCount[1]++;
        			break;
        			
        		case 2:
        		case 3:
        		case 12:
        			gameStatus = Status.LOST;
        			loseCount[1]++;
        			break;
        			
        		default:
        			gameStatus = Status.CONTINUE;
        			myPoint = sumOfDice;
        	}
        	
        	while(gameStatus == Status.CONTINUE) {
        		sumOfDice = rollDice();
        		rollTimes++;
        		
        		if(sumOfDice == myPoint) {
        			gameStatus = Status.WON;
        			
        			if(rollTimes <= 20)
        				winCount[rollTimes]++;
        			else
        				winCount[21]++;
        		}
        		else if(sumOfDice == 7) {
        			gameStatus = Status.LOST;
        			
        			if(rollTimes <= 20)
        				loseCount[rollTimes]++;
        			else
        				loseCount[21]++;
        		}
        	}
        	totalRolls += rollTimes;
        	rollTimes = 0;
        }
        
        for(int k = 1; k < winCount.length; k++)
        	winPosibilityOfRolls[k] = (double)winCount[k]/(winCount[k] + loseCount[k]) * 100;
        
        for(int j = 1; j < winCount.length; j++)
        	totalWon += winCount[j];
        
        // Output results
        System.out.println("Roll |  Won   |  Lost  | Win Posibility");
        for (int i = 1; i <= 20; i++) {
            System.out.printf(" %02d  | %-7d| %-7d|  %.2f %%%n", i, winCount[i], loseCount[i], winPosibilityOfRolls[i]);
        }
        System.out.printf(">21  | %-7d| %-7d|  %.2f %%%n%n", winCount[21], loseCount[21], winPosibilityOfRolls[21]);
        
        double winRate = (double) totalWon / numberOfGames;
        System.out.printf("Total win posibility: %.2f%%\n", winRate * 100);
        
        double avgRolls = (double) totalRolls / numberOfGames;
        System.out.printf("Average length of game: %.2f rolls\n", avgRolls);
    }

    private static int rollDice() {
        int die1 = random.nextInt(6) + 1;
        int die2 = random.nextInt(6) + 1;
        return die1 + die2;
    }
}
