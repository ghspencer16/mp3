package jenkins.model;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.jvnet.hudson.test.Issue;

public class idFromFileNameTest {

    @Test
    public void testB()
    {
    	assertEquals("b", IdStrategy.idFromFilename("$0062"));
    }

    @Test
    public void testA()
    {
    	assertEquals("a", IdStrategy.idFromFilename("$0061"));
    }
}
