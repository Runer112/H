package vm;

import object.HObject;

interface HMasterStack extends Stack<HObject> {

	@Override
	HObject pop() throws HEmptyStackException;

	@Override
	HObject peek() throws HEmptyStackException;

	void mark();

	void cut();

	void duplicate(int index) throws HStackAccessException;

}
