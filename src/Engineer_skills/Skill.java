package Engineer_skills;

public class Skill{

	private String skillName;
	private String level;
	private int yearsOfExperience;
	private String description;
	
	public Skill(String skillName , String level , int yearsOfExperience, String description) {
		this.skillName = skillName;
		this.level = level;
		this.yearsOfExperience = yearsOfExperience;
		this.description = description;
	}
	
	public String getSkillName() {
		return skillName;
	}
	
	public String getLevel() {
		return level;
	}
	
	public int getYearsOfExperience() {
		return yearsOfExperience;
	}
	
	public String getDescription() {
		return description;
	}
	
	@Override
	public String toString() {
		return skillName + "(" + level + " , " + yearsOfExperience + " years ) " + description;
	}
	
}
