package com.android.example.module06_module112_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module353_module1.ClassAAC = com.android.example.module06_module353_module1.ClassAAC()
	private 	val instance_var_1_1: com.android.example.module06_module353_module1.ClassAAI = com.android.example.module06_module353_module1.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module353_module1.ClassAAA = com.android.example.module06_module353_module1.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module353_module1.ClassAAG
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.android.example.module06_module353_module2.ClassAAJ = com.android.example.module06_module353_module2.ClassAAJ()
				local_var_4_0.method1("SomeString", "SomeString", "SomeString")

				val local_var_4_1: com.android.example.module06_module353_module2.ClassAAA = com.android.example.module06_module353_module2.ClassAAA()
				local_var_4_1.method2("SomeString")

			}
		}
	}

	fun method1(
		param0: com.android.example.module06_module353_module1.ClassAAA
	) {
		val local_var_2_1: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()
		local_var_2_1.method0("SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.android.example.module06_module353_module2.ClassAAJ = com.android.example.module06_module353_module2.ClassAAJ()
		local_var_2_2.method1("SomeString", "SomeString", "SomeString")

		param0.method1(com.android.example.module06_module353_module2.ClassAAJ(), com.android.example.module06_module353_module2.ClassAAE())

	}

	fun method2(
		param0: com.android.example.module06_module353_module1.ClassAAE,
		param1: com.android.example.module06_module353_module1.ClassAAD,
		param2: com.android.example.module06_module353_module1.ClassAAH
	) {
		param0.method3(com.android.example.module06_module353_module2.ClassAAJ(), com.android.example.module06_module353_module2.ClassAAG(), com.android.example.module06_module353_module2.ClassAAG())

	}
}
