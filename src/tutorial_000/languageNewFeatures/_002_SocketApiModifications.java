package tutorial_000.languageNewFeatures;

public class _002_SocketApiModifications {
	/*
	 * In java 13, a new implementation of Socket API arise. Old Socket APIs like java.net.Socket and java.net.ServerSocket has been replaced :
	 *   - PlainSocketImpl is no more in use. The Socket API provider now points to NioSocketImpl.
	 *   - New implementation leverages the java.nio infrastructure for better concurrency and i/o control.
	 *   - New implementation is backwards compatible with code using older implementation.
	 *   - New implementation is now default with Java 12.
	 *   - Old implementation can be selected by multiple ways :
	 *      ¤ Set system property "jdk.net.usePlainSockteImpl" to "true".
	 *      ¤ Run java with "-Djdk.net.usePlainSocketImpl" option.
	 *      ¤ Update JDK network configuration file available in "${java.home}/conf/net.properties".
	 *   - Beware : Old implementation and previous ways to select it will be removed from future release.
	 */
}
