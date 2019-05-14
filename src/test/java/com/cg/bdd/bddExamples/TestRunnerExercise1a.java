package com.cg.bdd.bddExamples;




import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
@CucumberOptions(features= "src/main/java/features/demowebshop.feature",tags="@execute",

		glue= {"com.cg.pom.beans"}
		)

public class TestRunnerExercise1a {

}
