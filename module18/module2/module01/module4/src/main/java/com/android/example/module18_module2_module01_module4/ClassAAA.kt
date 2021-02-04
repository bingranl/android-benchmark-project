package com.android.example.module18_module2_module01_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module353_module1.ClassAAI = com.android.example.module06_module353_module1.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module353_module1.ClassAAF = com.android.example.module06_module353_module1.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module353_module1.ClassAAG,
		param1: com.android.example.module06_module353_module1.ClassAAC,
		param2: com.android.example.module06_module353_module1.ClassAAD,
		param3: com.android.example.module06_module353_module1.ClassAAA
	) {
		param0.method1(com.android.example.module06_module353_module2.ClassAAG())

		listOf("1", "2", "3").forEach {
			param0.method1(com.android.example.module06_module353_module2.ClassAAG())

		}
		val local_var_2_4: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()
		local_var_2_4.method0("SomeString", "SomeString", "SomeString")

		param0.method1(com.android.example.module06_module353_module2.ClassAAG())

	}

	fun method1(
		param0: com.android.example.module06_module353_module1.ClassAAI,
		param1: com.android.example.module06_module353_module1.ClassAAE,
		param2: com.android.example.module06_module353_module1.ClassAAG
	) {
		param0.method0(com.android.example.module06_module353_module2.ClassAAA())

		val local_var_2_3: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()
		local_var_2_3.method0("SomeString")

		val local_var_2_4: com.android.example.module06_module353_module2.ClassAAC = com.android.example.module06_module353_module2.ClassAAC()
		local_var_2_4.method2("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method0(com.android.example.module06_module353_module2.ClassAAA())

	}
}
