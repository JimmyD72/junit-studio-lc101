package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    private main.BalancedBrackets BalancedBrackets;

    //TODO: add tests here
    @Test
    public void emptyTest() {

        assertEquals(true, true);
    }


    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets ("[]"));
    }
    @Test
    public void emptyStringReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets(""));
    }
    @Test
    public void wordsInBracketReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[launchcode]"));
    }
    @Test
    public void bracketFirstReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("launch[code]"));
    }
    @Test
    public void missingClosingBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }
    @Test
    public void missingOpeningBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]"));
    }
    @Test
    public void reverseBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }
    @Test
    public void multipleBalancedBracketsReturnsTrue() {
     assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }
    @Test
    public void reverseSecondSetBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]["));
    }
    @Test
    public void nestingBracketsReturnTrue() {
        assertTrue((BalancedBrackets.hasBalancedBrackets("[[]]")));
    }
    @Test
    public void nonEmptyStringWithoutBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("launchcode"));
    }
}

