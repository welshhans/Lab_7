package edu.cscc;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class RPSLSpock_Test {

    private RPSLSpock test;

    @Before
    public void pretests() {
        test = new RPSLSpock();
    }

    // test for isValidPick method
    @Test
    public void testSuite1() {
        Assert.assertTrue(test.isValidPick("ROCK")
                || test.isValidPick("PAPER")
                || test.isValidPick("SCISSORS")
                || test.isValidPick("SPOCK")
                || test.isValidPick("LIZARD"));

        Assert.assertFalse(test.isValidPick("PANDA"));
    }


    // test generatePick() method
    @Test
    public void testSuite2() {
        Assert.assertNotNull(test.generatePick());
        // use the isValidPick() method to test if the returned value is valid
        Assert.assertTrue(test.isValidPick("ROCK")
                || test.isValidPick("PAPER")
                || test.isValidPick("SCISSORS")
                || test.isValidPick("SPOCK")
                || test.isValidPick("LIZARD"));
        
    }

    // test for isComputerWin method
    @Test
    public void testSuite3() {
        // test all ten win conditions
        Assert.assertTrue(test.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SCISSORS));
        Assert.assertTrue(test.isComputerWin(RPSLSpock.PAPER,RPSLSpock.ROCK));
        Assert.assertTrue(test.isComputerWin(RPSLSpock.ROCK,RPSLSpock.SPOCK));
        // and so forth

        // computer loses scenario
        Assert.assertFalse(test.isComputerWin(RPSLSpock.PAPER, RPSLSpock.SCISSORS));
    }
}
