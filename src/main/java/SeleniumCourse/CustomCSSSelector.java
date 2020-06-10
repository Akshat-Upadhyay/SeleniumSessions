package SeleniumCourse;

public class CustomCSSSelector {

	public static void main(String[] args) {

		
		//1. For ID concept-->We use #
		
		// #username---># is represeting an ID
		
		//    OR
		
		//input#username
		
		//    OR
		
		//input[id='username']
		
		//   OR
		
		////input[id='username'][type='email']
		
		
		//2. For Class--->we have to use .{classname}
		
		// .form-control.private-form__control.login-email
		
		//   OR
		
		//input.form-control.private-form__control.login-email
		
		//   OR
		
		//input.login-email
		
		//   OR
		
		//button.login-submit
		
		
		//3. text:
		
		//   input[id^='username']---->starting with
		
		//   input[id$='username']------>ending with
		
		
		//4. contains():
		
		// input[id*='username']
		
		
		//5. parent child relationship
		
		// div>input[id='username']
	}

}
