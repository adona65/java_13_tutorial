package tutorial_000.languageNewFeatures;

public class _004_JvmChanges {
	/*
	 * Java 13 delivered various changes concerning JVM. Here are some.
	 */
	
	/*
	 * Dynamic CDS archive
	 * 
	 * CDS (Class Data Sharing) is an important feature of JVM to help reduce the startup time of an application. As it allows to share class 
	 * metadata across different JVMs, it reduces the startup time and memory footprint. Java 10 enhanced CDS by giving AppCDS, application CDS 
	 * which gave developers access to include application classes in a shared archive. Java 12 set CDS archive as default.
	 * 
	 * But the process of creating a CDS was tedious as developers has to go through multiple trials of their applications to create a class list 
	 * as first step and then dump that class list into an archive. Then this archive can be used to share metadata between JVMs.
	 * 
	 * From Java 13 onwards, java has dynamic archiving. Now developers can generate a shared archive at the time of application exit. So trial
	 * runs are now useless.
	 * 
	 * Following step show how to create a dynamic shared archive on top of default system archive using option "-XX:ArchiveClassesAtExit" and 
	 * passing the archive name :
	 * 
	     "java -XX:ArchiveClassesAtExit=sharedApp.jar -cp fakeAPI.jar fakeAPI"
	 *
	 * Once generated, the shared archive can be used to run the application using "-XX:SharedArchiveFile" option :
	 * 
	     "java -XX:SharedArchiveFile=sharedApp.jar -cp fakeAPI.jar fakeAPI"
	 * 
	 */
	
	/*
	 * ZGC Enhancements
	 * 
	 * The ZGC or Z Garbage Collector was introduced with Java 11 as a low latency garbage collection mechanism. ZGC makes sure that Garbage 
	 * Collection pause time is not dependent on heap size. It will never exceed 10 ms no matter heap size is 2MB or 2GB.
	 * 
	 * But ZGC had a limitation on returning unused heap memory to operating system like other HotSpot VM GCs such as G1 and Shenandoah. Following are 
	 * the enhancements done with Java 13:
	 *   - ZGC returns uncommited memory to operating system by default until the maximum heap size is reached.
	 *   - ZGC gives performance improvement with a reduced memory footprint.
	 *   - ZGC now supports heap size of 16 TB as compared to 4TB size limit.
	 *   
	 * In order to move back to Java 11 way of Garbage Collection, we can use following options :
	 *   - using "-XX:-ZUncommit" option
	 *   - set "-Xms" and "-Xmx" heap size as same.
	 */
}
