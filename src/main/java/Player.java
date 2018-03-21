import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Player {
    private List<Type> skillList;

    public Player(List<Type> skillList) {
        this.skillList = skillList;
    }

    public Player(Type type) {
        this.skillList = new ArrayList<Type>();
        this.skillList.add(type);
    }

    public List<Type> getSkillList() {
        return skillList;
    }

    public void setSkillList(List<Type> skillList) {
        this.skillList = skillList;
    }

    public Type getMoveType() {
        return skillList.get(new Random().nextInt(skillList.size()));
    }


}
