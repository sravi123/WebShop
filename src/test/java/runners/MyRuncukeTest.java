package runners;


import io.cucumber.java.After;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)



@CucumberOptions(

        plugin={"pretty","html:target/cucumber","json:target/cucumber.json"

        }
        ,features = {"src/test/resources/Features"}
        ,glue = {"stepDefinition"}
        ,dryRun=false
        ,monochrome=true
        ,strict=true
        ,tags = {"@test"}

)



public class MyRuncukeTest {

}
