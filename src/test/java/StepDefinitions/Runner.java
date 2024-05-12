package StepDefinitions;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\Win10 VM\\IdeaProjects\\DemoProject\\src\\main\\resources\\Features",
        glue = {"StepDefinitions"},
        monochrome = true,
        plugin = {"pretty", "junit:reports/JunitReports/report.xml",
                "json:reports/JsonReports/report.json",
                "html:reports/HtmlReports/report.html"},
        tags="@SmokeTest"
)
public class Runner {

}