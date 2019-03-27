package org.drools.samples;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class SampleUnitTest extends AbstractKieContainerSetup {

    @Test
    public void testSample() {
        Assert.assertNotNull(kieSession);
        kieSession.execute(new ArrayList<>());
    }
}
