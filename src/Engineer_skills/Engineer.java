package Engineer_skills;

import java.util.List;

public interface Engineer {

	void addSkill(Skill skill);
	void removeSkill(Skill skill);
	List<Skill> getSkills();
	String getName();
	
}
