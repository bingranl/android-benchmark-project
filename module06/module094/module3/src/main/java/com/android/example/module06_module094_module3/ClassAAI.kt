package com.android.example.module06_module094_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String
	) {
	}

	fun method1(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module109_module1.ClassAAF = com.android.example.module06_module109_module1.ClassAAF()
			local_var_3_0.method0("SomeString")

			for (iAb in 0..2) {
				local_var_3_0.method3("SomeString", "SomeString")

			}
		}
		val local_var_2_4: com.android.example.module06_module109_module1.ClassAAE = com.android.example.module06_module109_module1.ClassAAE()
		local_var_2_4.method3("SomeString", "SomeString")

	}

	fun method2(
		param0: String
	) {
	}

	fun method3(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.android.example.module06_module109_module1.ClassAAA = com.android.example.module06_module109_module1.ClassAAA()
		local_var_2_2.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_3: com.android.example.module06_module109_module1.ClassAAF = com.android.example.module06_module109_module1.ClassAAF()
		local_var_2_3.method0("SomeString")

		local_var_2_2.method2("SomeString", "SomeString")

	}
}
