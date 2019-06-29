import org.junit.Assert;
import org.junit.Test;

/**
 * Created by ehsan on 6/30/19.
 */
public class SolutionTest {

    @Test
    public void tests(){
        Solution solution = new Solution();

        Assert.assertEquals(solution.convert("EHSANSOLEIMANI", 4), "EONHSLAISNEMAI");
        Assert.assertEquals(solution.convert("1234567890", 3), "1592468037");
    }
}
