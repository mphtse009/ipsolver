###IpChecker
##This program takes a file with ip addresses and reads it line by line.
##it then produces to files validIP.txt and invalidIP.txt which consists of a list of valid and invalid ip's.

####Assumptions
1. Valid ips lie in the range 0.0.0.0 - 255.255.255.255.
	Private networks and other reserved ip's will be consirdered as valid.
2. java and junit are installed on the machine

###How to run
1. First compile the files  (javac Filename.java)
		javac IpChecker.java
		javac IpCheckerTest.java
		javac IpSolver.java
		javac TestRunner.java
2. Run IpSolver with the argument of the textfiles
		java IpSolver ip2.txt