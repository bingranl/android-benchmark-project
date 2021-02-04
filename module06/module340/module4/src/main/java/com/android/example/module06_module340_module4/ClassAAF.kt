package com.android.example.module06_module340_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module340_module3.ClassAAF = com.android.example.module06_module340_module3.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module340_module3.ClassAAE = com.android.example.module06_module340_module3.ClassAAE()

	fun method0(
		param0: com.android.example.module06_module340_module3.ClassAAD
	) {
		param0.method0("SomeString", "SomeString", "SomeString")

		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				param0.method2("SomeString")

			}
		}
	}

	fun method1(
		param0: com.android.example.module06_module340_module3.ClassAAE
	) {
		val local_var_2_1: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_1.verify<kotlin.Any>(kotlin.Any())

		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verify<kotlin.Any>(kotlin.Any())

	}

	fun method2(
		param0: com.android.example.module06_module340_module3.ClassAAG,
		param1: com.android.example.module06_module340_module3.ClassAAI,
		param2: com.android.example.module06_module340_module3.ClassAAA
	) {
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify()

		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module06_module340_module3.ClassAAE
	) {
	}
}
