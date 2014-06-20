package vm;

interface Stack<E> {

	boolean isEmpty();

	void push(E element);

	E pop();

	E peek();

}
