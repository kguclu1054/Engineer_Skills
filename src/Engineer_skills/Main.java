package Engineer_skills;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Engineer blogger = new Blogger("Ahmet");
		Engineer ınstrumentPlayer = new InstrumentPlayer("Kaan");
		Engineer parent = new Parent("Kayhan");
		Engineer teamFan = new TeamFan("Arda");
		Engineer javaEnthusiast = new JavaEnthusiast("Oktay");
		
		
		Skill skill1 = new Skill("Blog Yazarlığı", "İleri", 4, "Blog yazarlığı deneyimi.");
        Skill skill2 = new Skill("Ebeveynlik", "Temel", 5, "Çocuk yetiştirme deneyimi.");
        Skill skill3 = new Skill("Futbol", "Orta", 3, "Futbol konusunda tutkulu.");
        Skill skill4 = new Skill("Gitar Çalma", "İleri", 2, "Gitar çalma yeteneği.");
        Skill skill5 = new Skill("Java Programlama", "İleri", 5, "Java'da uzmanlık.");
        Skill skill6 = new Skill("Python Programlama", "Orta", 3, "Python'da deneyim.");

        blogger.addSkill(skill6);
        ınstrumentPlayer.addSkill(skill2);
        parent.addSkill(skill4);
        teamFan.addSkill(skill5);
        javaEnthusiast.addSkill(skill5);
        blogger.removeSkill(skill6);
        
        
        printEngineerSkills(blogger);
        printEngineerSkills(ınstrumentPlayer);
        printEngineerSkills(parent);
        printEngineerSkills(teamFan);
        printEngineerSkills(javaEnthusiast);
        
	}
        
        private static void printEngineerSkills(Engineer engineer) {
            System.out.println("Mühendis: " + engineer.getName());
            List<Skill> skills = engineer.getSkills();
            if (skills.isEmpty()) {
                System.out.println("Bu mühendis herhangi bir yetkinliğe sahip değil.");
            } else {
                for (Skill skill : skills) {
                    System.out.println("Yetkinlik: " + skill);
                }
            }
        System.out.println();
	}

}
