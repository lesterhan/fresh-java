import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class NicerTest {

    @Test
    void testFails(){
    	Nicer nicer = new Nicer();
        assertThat(nicer.nice()).isEqualTo(false);
    }

}