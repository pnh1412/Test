import java.util.EmptyStackException;

public class StackArray {
		protected Object[] a;
		int top, max;
		
		public StackArray(int max) {
			this.max = max;
			a = new Object[max];
			top=-1;
		}
		public StackArray() {
			this(50);
		}
		public boolean isEmpty() {
			return top==-1;
		}
		public boolean isFull() {
			return top == max-1;
		}
		public void clear() {
			top=-1;
		}
		public boolean grow() {
			int max1 = max + max/2;
			Object[] a1 = new Object[max1];
			for (int i = 0; i < top; i++) {
				a1[1]=a[i];
			}
			a=a1;
			max=max1;
			return true;
			}
	public void push(Object x) {
		if(isFull() && !grow()) return;
		a[++top] = x;
	}
	public Object top() throws EmptyStackException{
		if(isEmpty()) throw new EmptyStackException();
		return (a[top]);
	}
	public Object pop() throws EmptyStackException{
		if(isEmpty()) throw new EmptyStackException();
		Object x = a[top];
		top--;
		return x;
	}
}