package de.tssd.service;

import de.tssd.service.impl.SampleServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Spring-Boot-Angular-Template
 * Author: tsteidle
 * Created: 19.11.16
 */
@RunWith(SpringRunner.class)
@SpringBootTest(classes = SampleServiceImpl.class)
public class SampleServiceTestJUnit {

    @Autowired
    private SampleService sampleService;

    @Test
    public void doSomethingTest() {
        Assert.assertEquals("a sample String", this.sampleService.doSomething());
    }
}
