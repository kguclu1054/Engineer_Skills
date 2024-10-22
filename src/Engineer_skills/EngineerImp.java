package Engineer_skills;

import java.util.ArrayList;
import java.util.List;

public class EngineerImp implements Engineer {

	private String name;
	private List<Skill> skills;
	
	public EngineerImp(String name) {
		this.name = name;
		this.skills = new ArrayList<>();
		}
	
	@Override
	public void addSkill(Skill skill) {
	   skills.add(skill);
	}

	@Override
	public void removeSkill(Skill skill) {
		skills.remove(skill);
	}

	@Override
	public List<Skill> getSkills() {	
		return skills;
	}

	@Override
	public String getName() {
		return name;
	}

	
	
}
