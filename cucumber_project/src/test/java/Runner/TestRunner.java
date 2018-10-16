package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
 
@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\rsharaf\\workspace\\cucumber_project\\src\\test\\java\\com\\thetestroom\\cucumber_project\\myFirstFeature.feature"
, glue="LoginStepDefinition")
public class TestRunner {
 
}