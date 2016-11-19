package de.tssd.service;

/**
 * Spring-Boot-Angular-Template
 * Author: tsteidle
 * Created: 19.11.16
 */
public interface SampleService {

    default String doSomething() {
        return "a sample String";
    }
}
