JAVAC = javac
JFLAGS = -g
.SUFFIXES: .java .class
.java.class:
	$(JAVAC) $(JFLAGS) $*.java

SOURCES = IpChecker.java IpSolver.java IpCheckerTest.java TestRunner.java

default: classes
classes: $(SOURCES:.java=.class)

clean:
		$(RM) *.class *validIP.txt