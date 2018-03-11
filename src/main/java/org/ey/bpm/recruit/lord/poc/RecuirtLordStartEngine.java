package org.ey.bpm.recruit.lord.poc;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableProcessApplication
public class RecuirtLordStartEngine 
{
    public static void main( String[] args )
    {
    	SpringApplication.run(RecuirtLordStartEngine.class, args);
    }
}
