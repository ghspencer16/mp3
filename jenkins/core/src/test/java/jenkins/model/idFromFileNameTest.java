package jenkins.model;

import java.io.File;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.jvnet.hudson.test.Issue;

public class idFromFileNameTest {
	public IdStrategy.CaseSensitive x  = new IdStrategy.CaseSensitive();

    @Test
    public void testB()
    {
    	assertEquals("b", x.idFromFilename("$0062"));
    }

    @Test
    public void testA()
    {
    	assertEquals("a", x.idFromFilename("$0061"));
    }
}
