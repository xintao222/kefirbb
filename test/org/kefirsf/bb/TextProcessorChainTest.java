package org.kefirsf.bb;

import org.junit.Test;
import org.kefirsf.bb.test.Assert;

import java.util.Arrays;

/**
 * Test the TextProcessorChain
 */
public class TextProcessorChainTest {
    @Test
    public void test() {
        TextProcessor chain = new TextProcessorChain(
                Arrays.asList(
                        new EscapeProcessor(new String[][]{{"1", "2"}}),
                        new EscapeProcessor(new String[][]{{"2", "3"}}),
                        new EscapeProcessor(new String[][]{{"3", "4"}})
                )
        );
        Assert.assertProcess(chain, "4", "1");
    }
}
