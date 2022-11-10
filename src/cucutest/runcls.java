package cucutest;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(features = "feature",
				glue={"stepdefination"})
public class runcls {

}
