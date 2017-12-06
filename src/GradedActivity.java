/*
 * GradedActivity class
 */

import javax.swing.JOptionPane;

public class GradedActivity {
    private double score; //we can access this in the GradedActivity class, but not outside
    
    //setScore only allows scores between 0 and 100
    public void setScore(double s){
        if (s < 0 || s > 100){
            JOptionPane.showMessageDialog(null,
                    "Sorry, that score is out of the allowable range.");
        } else {
            score = s;
        }
    }
    
    //getScore returns the score
    public double getScore(){
        return score;
    }
    
    //getGrade finds and returns the letter grade associated with that score
    public char getGrade(){
        if (score >= 90){
            return 'A';
        } else if (score >= 80){
            return 'B';
        } else if (score >= 70){
            return 'C';
        } else if (score >= 60){
            return 'D';
        } else {
            return 'F';
        }
    }
    
    //toString method for printing
    @Override
    public String toString(){
        return "" + getScore() + "% is a letter grade of " + getGrade();
    }
    
    
}