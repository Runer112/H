package vm;

import object.HArray;
import object.HObject;

interface HStackList extends StackList<HObject>, HStack {

	HArray toHArray();

}
