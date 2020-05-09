package test;

import main.BalancedBrackets;
import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    BalancedBrackets test_brackets;

    @Before
    public void createBalancedBracketString() {
        test_brackets = new BalancedBrackets("Launch[Code]");
    }

    //TODO: add tests here
    @Test
    public void emptyTest() {
        assertEquals(true, true);
    }

    //check make sure just brackets returns true
    @Test
    public void onlyBracketsReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    //empty string returns true
    @Test
    public void emptyStringReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets(""));
    }

    //brackets at beginning of word is true
    @Test
    public void bracketsAtBeginningReturnsTrue() {
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]LaunchCode"));
    }

    //check to make sure empty Launch[Code] returns true
    @Test
    public void stringPairReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    // make sure brackets on outside returns true
    @Test
    public void stringPairOutsideReturnsTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    @Test
    public void stringOnlyOneBracketReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[LaunchCode"));
    }

    @Test
    public void stringOnlyOpenBracketsReturnsFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch]Code["));
    }

    //returns false with just one bracket
    @Test
    public void singleBracketReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("["));
    }

    @Test
    public void wrongBracketOrderReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    @Test
    public void tooManyBracketsReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]["));
    }

    @Test
    public void tooManyBracketsWithTextReturnsFalse() {
        assertFalse(BalancedBrackets.hasBalancedBrackets("Launch][Code]r[["));
    }


}
