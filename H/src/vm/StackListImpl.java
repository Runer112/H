package vm;

import java.util.ArrayList;

@SuppressWarnings("serial")
class StackListImpl<E> extends ArrayList<E> implements StackList<E> {

	@Override
	public void push(final E element) {
		add(element);
	}

	@Override
	public E pop() {
		return remove(size() - 1);
	}

	@Override
	public E peek() {
		return get(size() - 1);
	}

}
