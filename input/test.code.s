.data
T1: .word
a: .word
b: .word
.text
.globl main
main:
	la $a0, T1
	la $t1, a
	la $t2, b
	add $t3, $t1, $t2
	sw $t3, 0($a0)
