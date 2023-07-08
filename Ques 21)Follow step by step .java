/*Ques 21)Follow step by step instruction as given below:
Create a folder named "java_problem_17" inside your learning root folder.
Inside this folder create folder "java/service" and "java/view"
Create a class NameService inside java/service foder, with following functionality :
A method to convert the given name in Title Case,
For example : If input is "RAHUL Sharma" or "rahul sharma" the output should be "Rahul Sharma".
	 	Create a class NameView inside java/view foder with following functionality :
 	A method to return any input name as showen bellow, you you have to call the NameService method to get the proper format of the name.
"Hello Rahul Sharma!!"
 	Create a class TestService inside the folder "java/test", Use this test class to test the NameView method for various names in different format.*/

package java.service;

public class NameService {
    public String convertToTitleCase(String name) {
        String[] words = name.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String firstLetter = word.substring(0, 1).toUpperCase();
            String restOfWord = word.substring(1).toLowerCase();
            result.append(firstLetter).append(restOfWord).append(" ");
        }

        return result.toString().trim();
    }
}

Step 3: Create the NameView class
package java.view;
import java.service.NameService;

public class NameView {
    public String getFormattedName(String name) {
        NameService nameService = new NameService();
        String formattedName = nameService.convertToTitleCase(name);
        return "Hello " + formattedName + "!!";
    }
}
Step 4: Create the TestService class
package java.test;
import java.view.NameView;

public class TestService {
    public static void main(String[] args) {
        NameView nameView = new NameView();

        // Test the NameView method with different names
        String name1 = "RAHUL Sharma";
        String result1 = nameView.getFormattedName(name1);
        System.out.println(result1);

        String name2 = "rahul sharma";
        String result2 = nameView.getFormattedName(name2);
        System.out.println(result2);
    }
}