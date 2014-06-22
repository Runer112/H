package vm;

import java.io.InputStream;
import java.io.OutputStream;

interface HRunnable {

	void run(HMasterStack stack, InputStream in, OutputStream out, OutputStream err);

}
