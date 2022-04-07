package listener;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import BasePackage.BaseClassKite;

public class Listener extends BaseClassKite implements ITestListener
{
public void onTestStart(ITestResult result) 
{
	Reporter.log("TC is Started",true);
}

public void onTestSuccess(ITestResult result) 
{
	Reporter.log("Passed TC name is :-"+result.getName(),true);	
}


public void onTestFailure(ITestResult result) 
{
	String TCName = result.getName();
	Reporter.log("The failed TC name Is :-"+TCName,true);
	try 
	{
		getScreenshot(TCName);
	} 
	catch (IOException e) 
	{
		e.printStackTrace();
	}
}


public void onTestSkipped(ITestResult result) 
{
	Reporter.log("TC is skipped please check",true);
}
}
