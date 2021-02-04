package com.android.example.module06_module015_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module015_module3.ClassAAA = com.android.example.module06_module015_module3.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module015_module5.ClassAAI = com.android.example.module06_module015_module5.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module015_module5.ClassAAB = com.android.example.module06_module015_module5.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module015_module3.ClassAAC,
		param1: com.android.example.module06_module015_module3.ClassAAF
	) {
		param0.method2(com.android.example.module06_module015_module5.ClassAAC())

		val local_var_2_2: com.android.example.module06_module015_module5.ClassAAH = com.android.example.module06_module015_module5.ClassAAH()
		local_var_2_2.method0("SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module015_module3.ClassAAI,
		param1: com.android.example.module06_module015_module3.ClassAAC,
		param2: com.android.example.module06_module015_module3.ClassAAF
	) {
		param0.method0(com.android.example.module06_module015_module5.ClassAAA(), com.android.example.module06_module015_module5.ClassAAJ(), com.android.example.module06_module015_module5.ClassAAD(), com.android.example.module06_module015_module5.ClassAAB())

		param0.method1(com.android.example.module06_module015_module5.ClassAAI())

	}

	fun method2(
		param0: com.android.example.module06_module015_module5.ClassAAB,
		param1: com.android.example.module06_module015_module3.ClassAAB
	) {
		param0.method3("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.android.example.module06_module015_module5.ClassAAI = com.android.example.module06_module015_module5.ClassAAI()
		local_var_2_2.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_3: com.android.example.module06_module015_module5.ClassAAB = com.android.example.module06_module015_module5.ClassAAB()
		local_var_2_3.method2("SomeString", "SomeString", "SomeString")

	}
}
