package lesson16;

import java.util.Random;
import java.util.Stack;

public class StackOrnek {

	public static void main(String[] args) {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(2);
		stack.push(44);
		stack.push(5);
		stack.push(4);
		stack.push(9);

		// stack boş olana kadar tüm değerleri çıkar

		while (!stack.isEmpty()) {
			System.out.println(stack.pop());
		}
		System.out.println(stack);

		Stack<Integer> yuzdenBuyuk = new Stack<Integer>();
		stack.push(2);
		stack.push(44);
		stack.push(512);
		stack.push(400);
		stack.push(9);

		int toplam = 0;

		while (!stack.isEmpty()) {

			if (stack.peek() < 100) {
				toplam = toplam + stack.pop();
			} else {
				yuzdenBuyuk.push(stack.pop());
			}
		}

		System.out.println(stack);
		System.out.println(yuzdenBuyuk);
		System.out.println(toplam);
	}

}
