package tutorial_000.languageNewFeatures;

public class _003_MiscellaneousChanges {
	/*
	 * Java 13 also introduced some miscellaneous modifications on various features :
	 *   - Addition of three new methods to java.nio.file.FileSystems to treat the content of a file as a file system easily
	 *      ¤ newFileSystem(Path)
	 *      ¤ newFileSystem(Path, Map<String, ?>)
	 *      ¤ newFileSystem(Path, Map<String, ?>, ClassLoader)
	 *   - java.time : Japanese era name added
	 *   - javax.crypto : MS Cryptography Next Generation (CNG)support
	 *   - javax.security : jdk.sasl.disabledMechanisms property added disabling SASL mechanisms
	 *   - javax.xml.crypto : String constants introduced to represent Canonical XML 1.1 URIs
	 *   - javax.xml.parsers : Methods added to instantiate DOM and SAX factories for namespaces support
	 *   - Unicode support is upgraded to version 12.1
	 *   - Kerberos (computer-network authentication protocol that works on the basis of tickets to allow nodes communicating over a 
	 *   	non-secure network to prove their identity to one another in a secure manner.) principal name canonicalization support added, 
	 *   	cross-realm referrals are supported.
	 *   
	 * Some APIs were also marked for removal. We may see them at : https://cr.openjdk.java.net/~iris/se/13/latestSpec/#APIs-proposed-for-removal
	 */
}
