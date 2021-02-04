package com.android.example.module06_module238_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module238_module1.ClassAAH = com.android.example.module06_module238_module1.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module238_module1.ClassAAA = com.android.example.module06_module238_module1.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module238_module5.ClassAAJ,
		param1: com.android.example.module06_module238_module5.ClassAAC
	) {
	}

	fun method1(
		param0: com.android.example.module06_module238_module1.ClassAAH,
		param1: com.android.example.module06_module238_module5.ClassAAI,
		param2: com.android.example.module06_module238_module1.ClassAAG,
		param3: com.android.example.module06_module238_module1.ClassAAB
	) {
	}

	fun method2(
		param0: com.android.example.module06_module238_module5.ClassAAJ,
		param1: com.android.example.module06_module238_module5.ClassAAE,
		param2: com.android.example.module06_module238_module1.ClassAAJ
	) {
		param0.method1(com.android.example.module06_module090_module3.ClassAAI(), com.android.example.module06_module090_module3.ClassAAB(), com.android.example.module06_module090_module3.ClassAAI(), com.android.example.module06_module090_module3.ClassAAA())

	}

	fun method3(
		param0: com.android.example.module06_module238_module5.ClassAAJ,
		param1: com.android.example.module06_module238_module5.ClassAAB
	) {
		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				param0.method2(com.android.example.module06_module090_module3.ClassAAJ(), com.android.example.module06_module090_module3.ClassAAB(), com.android.example.module06_module090_module3.ClassAAD(), com.android.example.module06_module090_module3.ClassAAD())

			}
			val local_var_3_0: com.android.example.module06_module090_module3.ClassAAJ = com.android.example.module06_module090_module3.ClassAAJ()
			local_var_3_0.method3("SomeString")

		}
		param0.method0(com.android.example.module06_module090_module3.ClassAAE())

	}
}
