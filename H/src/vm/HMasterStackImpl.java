package vm;

import object.HArray;
import object.HObject;

class HMasterStackImpl implements HMasterStack {

	private final StackList<HStackList>	masterStack;
	private final StackList<HStackList>	nonEmptyMasterStack;

	public HMasterStackImpl() {
		masterStack = new StackListImpl<>();
		nonEmptyMasterStack = new StackListImpl<>();

		mark();
	}

	protected final HStackList getTopStack() {
		try {
			return masterStack.peek();
		} catch (final IndexOutOfBoundsException e) {
			throw new HInternalError("VM master stack empty");
		}
	}

	protected final HStackList getTopNonEmptyStack() throws HEmptyStackException {
		try {
			return nonEmptyMasterStack.peek();
		} catch (final IndexOutOfBoundsException e) {
			throw new HEmptyStackException();
		}
	}

	@Override
	public boolean isEmpty() {
		return nonEmptyMasterStack.isEmpty();
	}

	@Override
	public void push(final HObject obj) {
		final HStackList stack = masterStack.peek();

		if (stack.isEmpty()) {
			nonEmptyMasterStack.push(stack);
		}

		stack.push(obj);
	}

	@Override
	public HObject pop() throws HEmptyStackException {
		final HStack stack = getTopNonEmptyStack();

		final HObject obj;
		try {
			obj = stack.pop();
		} catch (final IndexOutOfBoundsException e) {
			throw new HInternalError("VM master stack of non-empty stacks contained an empty stack");
		}

		if (stack.isEmpty()) {
			nonEmptyMasterStack.pop();
		}

		return obj;
	}

	@Override
	public HObject peek() throws HEmptyStackException {
		final HStack stack = getTopNonEmptyStack();

		try {
			return stack.peek();
		} catch (final IndexOutOfBoundsException e) {
			throw new HInternalError("Empty stack encountered in VM master stack of non-empty stacks");
		}
	}

	@Override
	public void mark() {
		masterStack.push(new HStackListImpl());
	}

	@Override
	public void cut() {
		final HArray array = getTopStack().toHArray();

		if (masterStack.isEmpty()) {
			mark();
		}

		getTopStack().push(array);
	}

	@Override
	public void duplicate(final int index) {
		int indexInStack = index;
		int nonEmptyStackIndex = nonEmptyMasterStack.size();
		HStackList nonEmptyStack;

		do {
			try {
				nonEmptyStack = nonEmptyMasterStack.get(--nonEmptyStackIndex);
			} catch (final IndexOutOfBoundsException e) {
				throw new HStackAccessException("Stack element " + index + " does not exist");
			}
			indexInStack -= nonEmptyStack.size();
		} while (indexInStack >= 0);

		push(nonEmptyStack.get(1 - indexInStack));
	}

}
