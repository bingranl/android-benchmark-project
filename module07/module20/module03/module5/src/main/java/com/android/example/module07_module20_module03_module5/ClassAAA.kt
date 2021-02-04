package com.android.example.module07_module20_module03_module5

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module353_module1.ClassAAA = com.android.example.module06_module353_module1.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module353_module1.ClassAAA = com.android.example.module06_module353_module1.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module353_module1.ClassAAD = com.android.example.module06_module353_module1.ClassAAD()

	fun method0(
		param0: com.android.example.module06_module353_module1.ClassAAC,
		param1: com.android.example.module06_module353_module1.ClassAAB
	) {
	}

	fun method1(
		param0: com.android.example.module06_module353_module1.ClassAAG,
		param1: com.android.example.module06_module353_module1.ClassAAI,
		param2: com.android.example.module06_module353_module1.ClassAAF
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()
			local_var_3_0.method1("SomeString")

			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.android.example.module06_module353_module2.ClassAAA = com.android.example.module06_module353_module2.ClassAAA()
				local_var_4_0.method0("SomeString", "SomeString", "SomeString", "SomeString")

			}
		}
		val local_var_2_3: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()
		local_var_2_3.method1("SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module353_module1.ClassAAB,
		param1: com.android.example.module06_module353_module1.ClassAAH,
		param2: com.android.example.module06_module353_module1.ClassAAG,
		param3: com.android.example.module06_module353_module1.ClassAAD
	) {
		param0.method1(com.android.example.module06_module353_module2.ClassAAI(), com.android.example.module06_module353_module2.ClassAAE())

		param0.method1(com.android.example.module06_module353_module2.ClassAAI(), com.android.example.module06_module353_module2.ClassAAE())

	}

	fun method3(
		param0: com.android.example.module06_module353_module1.ClassAAH,
		param1: com.android.example.module06_module353_module1.ClassAAE,
		param2: com.android.example.module06_module353_module1.ClassAAF,
		param3: com.android.example.module06_module353_module1.ClassAAF
	) {
		val local_var_2_4: com.android.example.module06_module353_module2.ClassAAI = com.android.example.module06_module353_module2.ClassAAI()
		local_var_2_4.method3("SomeString", "SomeString")

		param0.method2(com.android.example.module06_module353_module2.ClassAAI(), com.android.example.module06_module353_module2.ClassAAI(), com.android.example.module06_module353_module2.ClassAAG(), com.android.example.module06_module353_module2.ClassAAF())

	}
}
