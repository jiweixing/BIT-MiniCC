#https://github.com/antlr/grammars-v3/tree/master/C-preprocessor
#依赖antlr-3.5.2-complete.jar，输入的文件末尾必须有一空行
ANTLR_HOME=../../../../..
CP=$(ANTLR_HOME)/lib/antlr-3.5.2-complete.jar
ANTLR_TOOL=org.antlr.Tool
all: generate
generate:
	java -cp $(CP) $(ANTLR_TOOL) Cpp.g
	java -cp $(CP) $(ANTLR_TOOL) CppTree.g
#	java   $(ANTLR_TOOL) Macro.g
#	java   $(ANTLR_TOOL) MacroTree.g
build:
	javac  *.java
run:
	java  Main b.c
clean:
	rm -f *.tokens
	rm -f *.class
	rm -f Cpp*.java
	rm -f *~
	rm -f *.lexer.g
