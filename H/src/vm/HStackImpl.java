package vm;

import object.HArray;
import object.HObject;

@SuppressWarnings("serial")
class HStackListImpl extends StackListImpl<HObject> implements HStackList, HArray {

	@Override
	public HArray toHArray() {
		return this;
	}

}
