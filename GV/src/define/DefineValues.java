package define;

/**
 * Represents Project Global Variables - all congregated here for easy reference and modification
 * @author Mikhail Andreev
 *
 */
public class DefineValues {
	public static final int MAJOR_VERSION = 0;	//Current version of features - represents software generations - different versions should have large changes changes between them
	public static final int MINOR_VERSION = 0;	//represents small scale changes in release version. Different versions should have small changes between them - such as bug fixes or minor modifications in features - should not introduce large new features or changes
	public static final int BUILD_VERSION = 1;	//represents development scale changes - not present in release, but used to mark updates in the development version
	public static final String DEVELOPMENT_STATUS = "c";	//represents development stage - c = conceptual, pa = development for alpha version, a = alpha, b = beta, pr = pre-release, r = release
	
	//GUIFrame Constants
	public static final int INITIAL_SIZE_X = 700;
	public static final int INITIAL_SIZE_Y = 700;
}
