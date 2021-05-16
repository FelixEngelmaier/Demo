
import at.Engelmailer.SLM.Demo.Controller;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.ws.rs.core.Response;

    public class Controller_Test {
        @Test
        public void testDefaultOnStartup(){
            // arrange
            Controller.reset();
            String expected = "nfqs";

            // act
            String actual = Controller.getRot13StringFromSourceString("asdf");

            // assert
            Assertions.assertEquals(expected, actual);
        }

        //POST-Test
        @Test
        public void test_Given_WeWantToSetAMessage_When_CallingFunctionSetMessage_Then_SetMessageShouldHaveReplacedThePreviousMessage() {
            //arrange
            String expectet ="ldoq";
            //act
            Controller.setDelta(11);
            String actual = Controller.getRot13StringFromSourceString("asdf");
            //assert
            Assertions.assertEquals(expectet, actual);
        }

        //DELETE-Test
        @Test
        public void test_Given_WantToResetAMessage_When_WeReset_Then_WeExpectTheDefaultMessageToBeSet() {
            //arrange
            Controller.delta = 11;
            String expected = "nfqs";
            //act
            Controller.reset();
            String actual = Controller.getRot13StringFromSourceString("asdf");


            //assert
            Assertions.assertEquals(expected, actual);
        }
    }
