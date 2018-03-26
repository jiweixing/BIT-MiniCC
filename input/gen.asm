# Code generated from MiniCCompiler at 
# input file:D:\research\bit-sys\教学\编译原理-全英文\2017\ws\MiniCCompiler\test\input.co
# Please do not change this file! 

	.data

	.text

__main:
	li $t8, 15
	li $s7, 1
	mul $s6, $t8, $s7
	li $s4, 4
	add $s3, $s6, $s4
	move $s2, $s3
	move $t9, $s2
	move $v0, $t9
	jr $ra


__foo:
	add $t7, $s1, $s0
	move $t6, $t7
	move $v0, $t6
	jr $ra