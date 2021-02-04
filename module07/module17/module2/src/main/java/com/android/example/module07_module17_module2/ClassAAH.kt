package com.android.example.module07_module17_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module07_module17_module3.ClassAAF = com.android.example.module07_module17_module3.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module07_module17_module3.ClassAAJ = com.android.example.module07_module17_module3.ClassAAJ()

	fun method0(
		param0: com.android.example.module07_module17_module3.ClassAAA,
		param1: com.android.example.module07_module17_module3.ClassAAE,
		param2: com.android.example.module07_module17_module3.ClassAAC,
		param3: com.android.example.module07_module17_module3.ClassAAC
	) {
		listOf("1", "2", "3").forEach {
			param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

			val local_var_3_0: com.android.example.module07_module17_module1.ClassAAI = com.android.example.module07_module17_module1.ClassAAI()
			local_var_3_0.method1(com.android.example.module07_module17_module3.ClassAAB(), com.android.example.module07_module17_module3.ClassAAJ(), com.android.example.module07_module17_module3.ClassAAE())

		}
	}

	fun method1(
		param0: com.android.example.module07_module17_module3.ClassAAC,
		param1: com.android.example.module07_module17_module1.ClassAAC
	) {
	}

	fun method2(
		param0: com.android.example.module07_module17_module3.ClassAAH,
		param1: com.android.example.module07_module17_module1.ClassAAI,
		param2: com.android.example.module07_module17_module3.ClassAAE
	) {
		val local_var_2_3: com.android.example.module07_module17_module1.ClassAAH = com.android.example.module07_module17_module1.ClassAAH()
		local_var_2_3.method0(com.android.example.module07_module17_module3.ClassAAD(), com.android.example.module07_module17_module3.ClassAAI())

		val local_var_2_4: com.android.example.module07_module17_module1.ClassAAH = com.android.example.module07_module17_module1.ClassAAH()
		local_var_2_4.method1(com.android.example.module07_module17_module3.ClassAAJ(), com.android.example.module07_module17_module3.ClassAAD(), com.android.example.module07_module17_module3.ClassAAF())

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module07_module17_module3.ClassAAJ = com.android.example.module07_module17_module3.ClassAAJ()
		local_var_2_5.method3("SomeString")

	}

	fun method3(
		param0: com.android.example.module07_module17_module1.ClassAAD
	) {
		val local_var_2_1: com.android.example.module07_module17_module1.ClassAAH = com.android.example.module07_module17_module1.ClassAAH()
		local_var_2_1.method0(com.android.example.module07_module17_module3.ClassAAD(), com.android.example.module07_module17_module3.ClassAAI())

		val local_var_2_2: com.android.example.module07_module17_module3.ClassAAI = com.android.example.module07_module17_module3.ClassAAI()
		local_var_2_2.method2("SomeString")

		param0.method0(com.android.example.module07_module17_module3.ClassAAH())

	}
}
