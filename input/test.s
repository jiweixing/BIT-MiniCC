.data
ch: .word
i: .word
.text
.globl main
main:
	la $a0, ch
	li $v0, 68
	sw $v0, 0($a0)
	la $a0, i
	li $v0, 5
	sw $v0, 0($a0)
