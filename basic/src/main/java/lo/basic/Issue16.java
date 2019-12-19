package lo.basic;

import java.util.Arrays;

public class Issue16 {

	static int[] stack = new int[10];
	static int index = 0;

	public static void main(String[] args) {
		push(9);
		push(4);
		push(8);
		push(7);
		System.out.println(pop());
		System.out.println(pop());
		System.out.println(pop());
		push(7);
		push(8);
		System.out.println(pop());

		for (int i = 0; i < 9487; i++) {
			push(i);
		}
		printStack(); 			// �C�L stack
		push(11); 				// index > 9, �q�Y�}�l
		printStack(); 			// �C�L
		allResetToZero(); 		// �����٭즨 arrays ���w�]�� 0
		printStack(); 			// �C�L
		System.out.println(pop());
		changeIndex(5); 		// ���д����6��
		push(168); 				// �q��7���|�[ "168"
		System.out.println(pop());
		printStack(); 			// �C�L
	}

	private static void push(int value) {
		if (index == stack.length - 1) {
			index = 0;
		} else {
			index += 1;
		}
		stack[index] = value;
	}

	private static int pop() {
		int tmp = stack[index];
		index -= 1;
		return tmp;
	}

	private static void allResetToZero() {
		for (int i = 0; i < stack.length; i++) {
			stack[i] = 0;
		}
		index = 0;
	}

	private static int changeIndex(int num) {
		if (num > 9) {
			System.out.println("Error!");
		} else {
			index = num;
		}
		return index;
	}

	private static void printStack() {
		System.out.println(Arrays.toString(stack));
	}
}
