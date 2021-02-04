package com.android.example.module19_module1_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"
	private 	val instance_var_1_3: String = "SomeString"
	private 	val instance_var_1_4: String = "SomeString"

	fun method0(
		param0: String
	) {
		val local_var_2_1: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_1.verify<kotlin.Any>(kotlin.Any())

		local_var_2_1.verify()

	}

	fun method1(
		param0: String
	) {
		val local_var_2_1: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_1.verify()

		val local_var_2_2: org.mockito.configuration.DefaultMockitoConfiguration = org.mockito.configuration.DefaultMockitoConfiguration()
		local_var_2_2.getAnnotationEngine()

		local_var_2_1.verify()

	}

	fun method2(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
	}

	fun method3(
		param0: String,
		param1: String,
		param2: String
	) {
	}
}
