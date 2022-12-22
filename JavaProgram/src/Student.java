
public class Student {
	private String name;
	private int score;
	
	public void setName(String Name) {
		name = Name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setScore(int Score) {
		score = Score;
	}
	
	public int getScore() {
		return score;
	}
	
	public boolean checkScore() {
		if(score >= 0 && score <= 100 )
			return true;
		return false;
	}
	
	public boolean isPass() {
		return (score >= 50) ? true : false;
	}
	
	public String findGrade() {
		if(score<50)
			return "F";
		else if (score<55)
			return "D";
		else if (score<60)
			return "D+";
		else if (score<65)
			return "C";
		else if (score<70)
			return "C+";
		else if (score<75)
			return "B";
		else if (score<80)
			return "B+";
		return "A";		
	}
}
