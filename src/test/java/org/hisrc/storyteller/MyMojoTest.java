package org.hisrc.storyteller;

import java.io.File;

import org.apache.maven.plugin.testing.AbstractMojoTestCase;
import org.junit.Test;

public class MyMojoTest extends AbstractMojoTestCase {

	@Test
    public void testSomething()
        throws Exception
    {
        File pom = getTestFile( "src/test/resources/org/hisrc/storyteller/pom.xml" );
        assertNotNull( pom );
        assertTrue( pom.exists() );

        MyMojo myMojo = (MyMojo) lookupMojo( "touch", pom );
        assertNotNull( myMojo );
        myMojo.execute();
    }
}