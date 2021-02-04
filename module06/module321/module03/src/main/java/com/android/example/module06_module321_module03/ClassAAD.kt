package com.android.example.module06_module321_module03

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module321_module01.ClassAAC = com.android.example.module06_module321_module01.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module321_module10.ClassAAC = com.android.example.module06_module321_module10.ClassAAC()
	private 	val instance_var_1_2: com.android.example.module06_module321_module10.ClassAAI = com.android.example.module06_module321_module10.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module321_module10.ClassAAJ,
		param1: com.android.example.module06_module321_module10.ClassAAA,
		param2: com.android.example.module06_module321_module10.ClassAAE
	) {
		param0.method0("SomeString")

		val local_var_2_3: com.android.example.module06_module109_module1.ClassAAG = com.android.example.module06_module109_module1.ClassAAG()
		local_var_2_3.method0("SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module321_module01.ClassAAF,
		param1: com.android.example.module06_module321_module10.ClassAAJ
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module109_module1.ClassAAH = com.android.example.module06_module109_module1.ClassAAH()
			local_var_3_0.method2("SomeString", "SomeString", "SomeString", "SomeString")

		}
		val local_var_2_2: com.android.example.module06_module109_module1.ClassAAF = com.android.example.module06_module109_module1.ClassAAF()
		local_var_2_2.method3("SomeString", "SomeString")

		val local_var_2_3: com.android.example.module06_module109_module1.ClassAAA = com.android.example.module06_module109_module1.ClassAAA()
		local_var_2_3.method2("SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module321_module01.ClassAAG
	) {
		param0.method1(com.android.example.module06_module321_module10.ClassAAE())

		param0.method2(com.android.example.module06_module109_module1.ClassAAC())

	}
}
