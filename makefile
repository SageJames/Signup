JFLAGS = -d bin -sourcepath src

JUNIT_JAR = junit-platform-console-standalone-1.2.0.jar
JUNIT_RUNNER = org.junit.platform.console.ConsoleLauncher


default:
	@echo "'make clean' removes *.class *~ files"
	@echo "'make compile' compiles all Java files"
	@echo "'make test' runs JUnit5 test cases"

test: $(JUNIT_JAR) 
	java -cp .:bin:$(JUNIT_JAR): $(JUNIT_RUNNER) --scan-class-path

clean:
	rm -f bin/*.class
	rm -f src/*~
	rm -f *~

compile: $(JUNIT_JAR) 
	javac $(JFLAGS) -cp .:$(JUNIT_JAR): src/*.java

