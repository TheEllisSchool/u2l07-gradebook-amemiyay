
public class FinalExam extends GradedActivity {
	//attributes
	private int numQuestions; //how many questions total
	private double pointsEach;
	private int numMissed;
	
	//methods
	public FinalExam(int questions, int missed) { //constructor
		setNumQuestionsAndPoints(questions); //need set here because if not, it doesn't have restrictions
		setNumMissed(missed);
		
		double s = (numQuestions - numMissed) * pointsEach;
		setScore(s); //GradedActivity has the setScore() so you can just use that
	}
	
	public void setNumQuestionsAndPoints(int q) { //just setting a value, so void; q = how many questions there are
		if (q > 0) {
			numQuestions = q;
			pointsEach = 100/numQuestions;
		} else {
			numQuestions = 50;
			pointsEach = 100/numQuestions;
			System.out.println("Number of questions must be positive. Default to 50 questions");
		}
	}
	
	public void setNumMissed(int m) {
		if (m >= 0 && m <= numQuestions) {
			numMissed = m;
		} else {
			numMissed = 0;
			System.out.println("Number missed must be between 0 and number of questions. Default to no missed");
		}
	}
	
	public double getPointsEach() {
		return pointsEach;
	}
	
	public int getNumMissed() {
		return numMissed;
	}
	
	public int getNumQuestions() {
		return numQuestions;
	}
}
