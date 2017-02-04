# maven-lifecycle-logger

Configuration:
To record only tests, do ` -DlogTestsOnly=true`. To specify output file, do `-DlogFile=some/log/file` otherwise default will be `maven.build.log`. If file exists, it's truncated.

To install:
Copy to your maven ext/ directory and it will always run
Or 
Add as an extension to your pom of interest:
```<build>
...
		<extensions>
			<extension>
				<groupId>net.jonbell.maven</groupId>
				<artifactId>lifecycle-logger</artifactId>
				<version>0.0.1-SNAPSHOT</version>
			</extension>
		</extensions>
...
</build>
```
You should be able to get it from my snapshot repo:

```<repositories>
		<repository>
			<id>jb.snapshots</id>
			<name>jons snapshots</name>
			<url>https://maven.jonbell.net/repository/snapshots</url>
		</repository>
	</repositories>
```
