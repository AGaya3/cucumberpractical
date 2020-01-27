package cucumberlogin;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@ RunWith(Cucumber.class)

@ CucumberOptions(features="src/test/resources/feature/login.feature",glue="cucumberlogin",plugin="json:target/report.json")

public class Runner {

}
