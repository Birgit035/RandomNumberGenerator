import at.hofleitner.RandomController;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RandomControllerTest {
    @Test
    public void randomNumber_over100(){
        //Arrange
        RandomController rc = new RandomController();
        //Act
        int result = rc.randomMethod();
        //Assert
        Assertions.assertEquals(true, result <= 100);
    }

    @Test
    public void randomNumber_under100(){
        //Arrange
        RandomController rc = new RandomController();
        //Act
        int result = rc.randomMethod();
        //Assert
        Assertions.assertEquals(true, result >= 0);
    }


}
