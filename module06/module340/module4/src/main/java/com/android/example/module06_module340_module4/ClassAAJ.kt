package com.android.example.module06_module340_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module340_module3.ClassAAF = com.android.example.module06_module340_module3.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module340_module3.ClassAAH = com.android.example.module06_module340_module3.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module06_module340_module3.ClassAAI = com.android.example.module06_module340_module3.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module06_module340_module3.ClassAAC = com.android.example.module06_module340_module3.ClassAAC()

	fun method0(
		param0: com.android.example.module06_module340_module3.ClassAAC,
		param1: com.android.example.module06_module340_module3.ClassAAI,
		param2: com.android.example.module06_module340_module3.ClassAAH,
		param3: com.android.example.module06_module340_module3.ClassAAG
	) {
	}

	fun method1(
		param0: com.android.example.module06_module340_module3.ClassAAH,
		param1: com.android.example.module06_module340_module3.ClassAAG,
		param2: com.android.example.module06_module340_module3.ClassAAC,
		param3: com.android.example.module06_module340_module3.ClassAAH
	) {
		for (iAb in 0..3) {
			for (iAc in 0..1) {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
					local_var_5_0.verifyNoMoreInteractions()

				} else {
					param0.method1("SomeString", "SomeString", "SomeString")

				}
				val local_var_4_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
				local_var_4_0.verifyNoMoreInteractions()

			}
			val local_var_3_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
			local_var_3_0.verify()

			val local_var_3_1: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
			local_var_3_1.verifyNoMoreInteractions()

		}
	}

	fun method2(
		param0: com.android.example.module06_module340_module3.ClassAAE,
		param1: com.android.example.module06_module340_module3.ClassAAJ,
		param2: com.android.example.module06_module340_module3.ClassAAH
	) {
	}

	fun method3(
		param0: com.android.example.module06_module340_module3.ClassAAJ,
		param1: com.android.example.module06_module340_module3.ClassAAB,
		param2: com.android.example.module06_module340_module3.ClassAAA
	) {
		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify()

		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verify()

		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

	}
}
