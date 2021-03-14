# CucumberAdvancedFrameWork
Advanced cucumber framework from scratch including CI jenkins and extent reporting
This is now including: 
log4j2 
Testng.xml  
abstract class
Listeners - taking a screenshot in failed tests


Import the POM file with intellij - I had some issues which were resolved from stackoverflow:
__________________________________________________________________________________________________________________

https://stackoverflow.com/questions/29888592/errorjava-javactask-source-release-8-requires-target-release-1-8

File > Settings > Build, Execution, Deployment > Compiler > Java Compiler
Change Target bytecode version to 1.8 of the module that you are working for.

If you are using Maven
Add the compiler plugin to pom.xml under the top-level project node:
<build>
    <plugins>
        <plugin>
            <groupId>org.apache.maven.plugins</groupId>
            <artifactId>maven-compiler-plugin</artifactId>
            <configuration>
                <source>1.8</source>
                <target>1.8</target>
            </configuration>
        </plugin>
    </plugins>
</build>

__________________________________________________________________________________________________________________
