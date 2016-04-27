package bit.minisys.minicc.optimizer;

import java.io.IOException;

public interface IMiniCCOptimizer {
	public void run(String iFile, String oFile) throws IOException;
}
