import java.util.List;
import java.util.Random;

public class Player {
    private List<Type> skillList;
    private Type currentType;

    public Player(List<Type> skillList) {
        this.skillList = skillList;
        if (skillList != null && skillList.size() == 1) {
            this.currentType = skillList.get(0);
        }
    }

    public Player(Type currentType) {
        this.currentType = currentType;
    }

    public List<Type> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Type> skillList) {
        this.skillList = skillList;
    }

    public Type getCurrentType() {
        if (skillList != null && skillList.size() > 1) {
            return skillList.get(new Random().nextInt(skillList.size()));
        }
        return currentType;
    }

    public void setCurrentType(Type currentType) {
        this.currentType = currentType;
    }

}
