import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogicalOperatorsTest {

    @Test
    void shouldCheckIfBothTheConditionShouldBeTrue(){
        LogicalOperators logicalOperators=new LogicalOperators();
        int expectedOutput=45;
        int actualOutput = logicalOperators.logicalOperationsAnd(45,95,55);
        assertEquals(expectedOutput, actualOutput);



    }


    }



