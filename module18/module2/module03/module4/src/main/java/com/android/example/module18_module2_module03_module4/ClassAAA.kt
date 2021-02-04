package com.android.example.module18_module2_module03_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module353_module1.ClassAAI = com.android.example.module06_module353_module1.ClassAAI()
	private 	val instance_var_1_1: com.android.example.module06_module276_module1.ClassAAI = com.android.example.module06_module276_module1.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module06_module353_module1.ClassAAH = com.android.example.module06_module353_module1.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module353_module1.ClassAAJ,
		param1: com.android.example.module06_module353_module1.ClassAAD,
		param2: com.android.example.module06_module353_module1.ClassAAC,
		param3: com.android.example.module06_module353_module1.ClassAAI
	) {
	}

	fun method1(
		param0: com.android.example.module06_module353_module1.ClassAAF,
		param1: com.android.example.module06_module276_module1.ClassAAI,
		param2: com.android.example.module06_module353_module1.ClassAAD
	) {
		val local_var_2_3: com.android.example.module06_module353_module2.ClassAAJ = com.android.example.module06_module353_module2.ClassAAJ()
		local_var_2_3.method1("SomeString", "SomeString", "SomeString")

		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				val local_var_4_0: com.android.example.module06_module353_module2.ClassAAJ = com.android.example.module06_module353_module2.ClassAAJ()
				local_var_4_0.method1("SomeString", "SomeString", "SomeString")

			}
			param0.method2(com.android.example.module06_module353_module2.ClassAAH(), com.android.example.module06_module353_module2.ClassAAG(), com.android.example.module06_module353_module2.ClassAAG())

		}
	}

	fun method2(
		param0: com.android.example.module06_module353_module1.ClassAAJ,
		param1: com.android.example.module06_module276_module1.ClassAAG
	) {
		val local_var_2_2: com.android.example.module06_module353_module2.ClassAAE = com.android.example.module06_module353_module2.ClassAAE()
		local_var_2_2.method1("SomeString")

		param0.method1(com.android.example.module06_module353_module2.ClassAAG(), com.android.example.module06_module353_module2.ClassAAF(), com.android.example.module06_module353_module2.ClassAAA(), com.android.example.module06_module353_module2.ClassAAD())

		val local_var_2_3: com.android.example.module06_module353_module2.ClassAAF = com.android.example.module06_module353_module2.ClassAAF()
		local_var_2_3.method0("SomeString")

		param0.method0(com.android.example.module06_module353_module2.ClassAAC(), com.android.example.module06_module353_module2.ClassAAD())

	}
}
