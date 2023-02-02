package assignmentRunner;

import assignmentSteps.ParentClass;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(features= {"src/test/java/assignmentFeatures"},
					 glue= "assignmentSteps",
		      monochrome = true, 
				publish  = true,
				tags = "@smoke and @sanity" )
public class RunnerSF extends ParentClass {


	
}
