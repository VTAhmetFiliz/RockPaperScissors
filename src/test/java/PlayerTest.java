import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class PlayerTest {

    @Test
    public void testPlayerTypeConstructor(){
        Player player = new Player(Type.PAPER);
        assertEquals(Type.PAPER,player.getMoveType());
        assertEquals(1,player.getSkillList().size());
        assertEquals(Type.PAPER,player.getSkillList().get(0));
    }

    @Test
    public void testPlayerSkillListConstructor(){
        List<Type> list = new ArrayList<Type>();
        list.addAll(Arrays.asList(Type.PAPER,Type.ROCK));
        Player player = new Player(Arrays.asList(Type.PAPER,Type.ROCK));
        assertEquals(2,player.getSkillList().size());
        assertEquals(list,player.getSkillList());
    }
}
