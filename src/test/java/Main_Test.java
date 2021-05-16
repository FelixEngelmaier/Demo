import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Main_Test {
    @Test
    public void test_given_applicationIsStartet_when_MainGetMessageIsCalled_then_correctOutputIsExpected(){
        //Tripple A (Act, Arrange, Assert)
        //Act zb Etwas initiallisieren, variable etc.
        //Arrange
        String Actuall = Main.GetMessage();
        //Assert
        Assertions.assertEquals("hello rot13",Actuall);
    }

}
