package com.android.example.module06_module070_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module070_module5.ClassAAA = com.android.example.module06_module070_module5.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module070_module5.ClassAAB = com.android.example.module06_module070_module5.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module070_module5.ClassAAG,
		param1: com.android.example.module06_module070_module5.ClassAAI
	) {
		val local_var_2_2: com.android.example.module06_module220_module5.ClassAAC = com.android.example.module06_module220_module5.ClassAAC()
		local_var_2_2.method1("SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module070_module5.ClassAAD,
		param1: com.android.example.module06_module070_module1.ClassAAH,
		param2: com.android.example.module06_module070_module5.ClassAAB,
		param3: com.android.example.module06_module070_module5.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module220_module5.ClassAAI = com.android.example.module06_module220_module5.ClassAAI()
			local_var_3_0.method3("SomeString")

			val local_var_3_1: com.android.example.module06_module220_module5.ClassAAD = com.android.example.module06_module220_module5.ClassAAD()
			local_var_3_1.method3("SomeString", "SomeString", "SomeString")

		}
		val local_var_2_4: com.android.example.module06_module220_module5.ClassAAE = com.android.example.module06_module220_module5.ClassAAE()
		local_var_2_4.method1("SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module070_module5.ClassAAC,
		param1: com.android.example.module06_module070_module1.ClassAAE,
		param2: com.android.example.module06_module070_module1.ClassAAG
	) {
		param0.method0("SomeString", "SomeString", "SomeString")

		param0.method1("SomeString", "SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module06_module070_module1.ClassAAE
	) {
	}
}
