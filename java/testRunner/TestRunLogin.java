package testRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features={"src\\main\\java\\features"},
glue="stepDefinition",
publish=true,
monochrome=true)
public class TestRunLogin extends AbstractTestNGCucumberTests {
	//glue - we have stepdefinitation package name
	//publish = basic cucumber report
	//monochrome= to remove junk data from console
	//UndefinedStepException - code its in feature file but it is not implement
	//DuplicateStepDefinitionException - already code implemented in another class
}
