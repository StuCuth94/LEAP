package com.leap.exampleproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 *
 * Plan for the demo:
 *  - Open up app - emphasise speed (Ensure smart mode is turned off)
 *  - Highlight basic functionality
 *   - Navigation
 *   - Running code
 *   - Terminal
 *  - Turn on smart mode and show off indexed code
 *  - Generate share link and send it out
 *  - Show the follow function - give the example of wanting to walk someone through code
 *  - Split off into pair program scenario (someone writing code, other writing test for code)
 *   - Method skeleton will be in place, allowing for typeahead to identify inputs/return types
 *   - Both code/test case will be pre written, other demoing party will just need to paste it in
 *   - Can potentially do something in here with the person who has joined the session running the test to show they can execute on other machine
 * 
 */
@SpringBootApplication
public class ExampleProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExampleProjectApplication.class, args);
	}

}
