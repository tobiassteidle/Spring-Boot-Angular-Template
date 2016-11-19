package de.tssd.service

import de.tssd.service.SampleService
import de.tssd.service.impl.SampleServiceImpl
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.ContextConfiguration
import spock.lang.Specification

@ContextConfiguration
@SpringBootTest(classes = SampleServiceImpl.class)
class SampleServiceTestSpock extends Specification {

    @Autowired
    private SampleService sampleService;

    def 'doSomething() returns "a sample String'() {
        expect:
            this.sampleService.doSomething() == "a sample String"
    }
}