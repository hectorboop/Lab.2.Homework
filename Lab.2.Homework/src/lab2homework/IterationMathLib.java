package lab2homework;

import java.util.Stack;

public class IterationMathLib extends MathLib {

	@Override
	public int gcd(int x, int y) {
		int temp;
		while (y != 0) {
			if (x >= y && x != 0) {
				temp = y;
				y = x % y;
				x = temp;
			}
		}
		return x;
	}

	@Override
	public int ack(int x, int y) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.add(x);
		while (!stack.isEmpty()) {
			x = stack.pop();
			if (x == 0 || y == 0) {
				y += x + 1;
			} else {
				stack.add(--x);
				stack.add(++x);
				y--;
			}
		}
		
		return y;
	}

	@Override
	public int fib(int x) {
		int temp, prev = 0, current = 1;
		while(x > 1) {
			temp = prev;
			prev = current;
			current = temp + prev;
			x--;
		}
		
		return current;
	}

	@Override
	public int hanoi(int n) {
		int temp = 1;
		while (n != 1) {
			if (n > 1) {
				temp = 2 * temp + 1;
				n--;
			}
		}
		return temp;
	}

}

