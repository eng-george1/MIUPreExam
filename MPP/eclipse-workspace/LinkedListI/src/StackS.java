import java.util.Stack;

public class StackS {
	static void stack_pop(Stack<Integer> stack) {
		System.out.println("Pop Operation:");

		for (int i = 0; i < 5; i++) {
			Integer y = (Integer) stack.pop();
			System.out.println(y);
		}

	}

	public static boolean find(Integer num, Stack<Integer> stack, Stack<Integer> tempstack) {
		// Stack<Integer> stack=new Stack<Integer> ();
		// Stack<Integer> tempstack=new Stack<Integer> ();

		if (stack.empty()) {
			// finalize
			return false;
		} else {
			int value = (Integer) stack.pop();
			tempstack.push(value);
			if (num == value) {
				// we found
				// finalize
				// return true
				stack.push(value);
				tempstack.pop();
				return true;
			} else {
				boolean result= find(num, stack, tempstack);
				stack.push(value);
			 	tempstack.pop();
			 	return result;
			}

		}

		//return true;
	}

}
