package com.android.example.module06_module340_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.android.example.module06_module340_module3.ClassAAB = com.android.example.module06_module340_module3.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module340_module3.ClassAAB = com.android.example.module06_module340_module3.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module340_module3.ClassAAA,
		param1: com.android.example.module06_module340_module3.ClassAAA
	) {
		for (iAb in 0..5) {
			for (iAc in 0..0) {
				if (kotlin.Any().equals(kotlin.Any())) {
					val local_var_5_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
					local_var_5_0.verify<kotlin.Any>(kotlin.Any())

				} else {
					val local_var_5_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
					local_var_5_0.verifyNoMoreInteractions()

				}
				val local_var_4_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
				local_var_4_0.verify<kotlin.Any>(kotlin.Any())

			}
			param0.method2("SomeString")

		}
	}

	fun method1(
		param0: com.android.example.module06_module340_module3.ClassAAD,
		param1: com.android.example.module06_module340_module3.ClassAAJ,
		param2: com.android.example.module06_module340_module3.ClassAAE,
		param3: com.android.example.module06_module340_module3.ClassAAF
	) {
		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verify()

		val local_var_2_5: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_5.verifyNoMoreInteractions()

		val local_var_2_6: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_6.verify<kotlin.Any>(kotlin.Any())

	}

	fun method2(
		param0: com.android.example.module06_module340_module3.ClassAAC,
		param1: com.android.example.module06_module340_module3.ClassAAB,
		param2: com.android.example.module06_module340_module3.ClassAAG,
		param3: com.android.example.module06_module340_module3.ClassAAC
	) {
		param0.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verify()

		param0.method2("SomeString", "SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module06_module340_module3.ClassAAA
	) {
	}
}
