package tutorial_000.languageNewFeatures;

public class _000_SwitchExpressions {

	public static void main(String[] args) {
		/*
		 * Java 12 introduced Switch as expression in preview feature. In Java 13, it's still a preview feature, but the "yield" word
		 * was added to return a value.
		 * 
		 * As a reminder, we will first call the "old" form of switch :
		 */
		System.out.println("Will call old form of Switch : ");
		System.out.println(oldStyleSwitch("Monday"));
		System.out.println(oldStyleSwitch("Wednesday"));
	    System.out.println(oldStyleSwitch("Saturday"));
	    System.out.println(oldStyleSwitch(""));
	    System.out.println("---------------------------------------------");

	    /*
	     * If we would like to call the new Switch expression, we would just call it just as "old" style :
	     */
	    newSwitchExpression("Monday"); // Would return "Weekday".
		newSwitchExpression("Wednesday"); // Would return "Weekday".
	    newSwitchExpression("Saturday"); // Would return "Weekend".
	    newSwitchExpression(""); // Would return "Invalid day.".
	}

	/**
	 * Contains the "old" style of Switch statement.
	 */
	public static String oldStyleSwitch(String day) {
		String result = null;
		switch (day) {
			case "Monday":
			case "Tuesday":
			case "Wednesday":
			case "Thursday":
			case "Friday":
				result = "Weekday";
				break;
			case "Saturday": 
			case "Sunday":
				result = "Weekend";
				break;
			default:
				result =  "Invalid day.";            
		}
		return result;
	}
	
	/**
	 * Contains the "preview-featured" style of Switch expression (with arrow from Java12, and new "yield" word).
	 */
	public static void newSwitchExpression(String day) {
		// Commented in order to avoid compilation error with more recent versions of JDK.
		/*
		var result = switch (day) {
			case "Monday", "Tuesday", "Wednesday","Thursday", "Friday" -> yield "Weekday";
			case "Saturday", "Sunday" -> yield "Weekend";
			default -> "Invalid day.";
		};
		return result;
		*/
	}
}
