
# Code generated from MiniCCompiler at 
# input file:D:\projects\bit-minicc\bit-minic-clean\input\test.ic2.xml
# Please do not change this file! 

	.data
	.text
__init:
	# setup the stack
	lui $sp, 0x8000
	addi $sp, $sp, 0x0000
	addiu $sp, $sp, -1024

	# redirect to main function
	jal __main

	# make system call to terminate the program
	li $v0, 10
	syscall


__MARS_SCANF_I:
	li $v0, 5
	syscall
	move $t0, $v0
	jr $ra


__MARS_PRINTF_I:
	li $v0, 1
	syscall
	jr $ra

__main:

	# allocate stack frame for the callee
	addiu $fp, $sp, 0
	addiu $sp, $sp, -136
	sw $ra, 0($fp)

	sw $a0, 8($fp)
	sw $a1, 12($fp)
	sw $a2, 16($fp)
	sw $a3, 20($fp)


	jal __MARS_SCANF_I

	lw $ra, 0($fp)

	lw $a0, 8($sp)
	lw $a1, 12($sp)
	lw $a2, 16($sp)
	lw $a3, 20($sp)

	move $t9, $v0
	sw $ra, 0($fp)

	sw $a0, 8($fp)
	sw $a1, 12($fp)
	sw $a2, 16($fp)
	sw $a3, 20($fp)


	jal __MARS_SCANF_I

	lw $ra, 0($fp)

	lw $a0, 8($sp)
	lw $a1, 12($sp)
	lw $a2, 16($sp)
	lw $a3, 20($sp)

	move $t8, $v0
	add $t9, $t9, $t8
	sw $ra, 0($fp)

	sw $a0, 8($fp)
	sw $a1, 12($fp)
	sw $a2, 16($fp)
	sw $a3, 20($fp)

	move $a0, $25

	jal __MARS_PRINTF_I

	lw $ra, 0($fp)

	lw $a0, 8($sp)
	lw $a1, 12($sp)
	lw $a2, 16($sp)
	lw $a3, 20($sp)

	addi $v0, $v0, 0
	addiu $sp, $fp, 0
	addiu $fp, $fp, -136
	jr $ra
	
	
