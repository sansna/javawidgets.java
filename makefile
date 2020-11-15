all: testemo
	@export JAVA_PATH=${JAVA_PATH}:`pwd`/src

testemo:
	@cd src;javac testemo.java; java testemo
