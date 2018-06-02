package nl.han.app.Symbolchecker;

import nl.han.app.Symbolchecker.Interfaces.IBalancedSymbolChecker;
import org.junit.Assert;
import org.junit.Test;

public class BalancedSymbolCheckerTest {

    @Test
    public void matchingSymbolsTest() {
        // Arrange
        IBalancedSymbolChecker sut = new BalancedSymbolChecker();

        // Act
        boolean actual = sut.addSymbols("(){{}[()]}");

        // Assert
        Assert.assertEquals(true, actual);
    }

    @Test
    public void nonMatchingSymbolsTest() {
        // Arrange
        IBalancedSymbolChecker sut = new BalancedSymbolChecker();

        // Act
        boolean actual = sut.addSymbols("}([}");

        // Assert
        Assert.assertEquals(false, actual);
    }
}