package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="featureFiles/LoginOSSPortal.feature", glue="stepDefinitions")

//Runs only particular feature file
//@CucumberOptions(features="featureFiles/OpenGoogle.feature", glue="stepDefinitions")

//Runs all feature files present in the folder
//@CucumberOptions(features="featureFiles/", glue="stepDefinitions")

public class RunnerClass {

	//It combines the feature file and step Definition
	
	
}
