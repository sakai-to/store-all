package jp.co.techmatrix.servlet;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenshotUtil {

	private String prefix;
	private int sequenceNumber;
	
	public ScreenshotUtil(String prefix) {
		this.prefix = prefix;
		this.sequenceNumber = 0;
	}

	public void take(WebDriver driver) {
		try {
			TakesScreenshot screen = (TakesScreenshot)driver;
			Path capture = Paths.get(String.format("./%s-%04d.png", prefix, sequenceNumber++));
			Files.write(capture, screen.getScreenshotAs(OutputType.BYTES));
		} catch (IOException e) {
			System.err.println("Failed to copy screenshot file: " + e.getMessage());
		}
	}
}
