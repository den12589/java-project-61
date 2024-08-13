run-dist : test install
		./build/install/app/bin/app
install :
		gradle clean
		gradle installDist
test :
		gradle checkstyleMain