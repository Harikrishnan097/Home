package com.capg.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features= {"features"},
		glue= {"com.capg.stepdefinitionfile"},
		tags= {"@execute"}
	)
public class Logintestunit {

}
