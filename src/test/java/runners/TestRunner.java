package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = { "pretty", // cıktinin güzel olması icin
                "html:target/reports/html_reports/cucumber1.html", // html formatinda rapor almak icin
                "json:target/reports/json_reports/cucumber1.json", // json formatinda rapor almak icin
                "junit:target/reports/xml_reports/cucumber1.xml", // xml formatinda rapor almak icin
                "rerun:target/reports/failed_reports/failed.txt",// failed testler için
                "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"

        },
        features = "src/test/resources/features",
        glue = "stepdefinitions",
        tags = "@background",
        dryRun = false
)

public class TestRunner {


}
