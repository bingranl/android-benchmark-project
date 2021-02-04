package com.android.example.module19_module1_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String
	) {
		for (iAb in 0..5) {
			val local_var_3_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
			local_var_3_0.verify<kotlin.Any>(kotlin.Any())

			local_var_3_0.verify()

		}
	}

	fun method1(
		param0: String
	) {
		val local_var_2_1: org.mockito.configuration.DefaultMockitoConfiguration = org.mockito.configuration.DefaultMockitoConfiguration()
		local_var_2_1.cleansStackTrace()

		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verifyNoMoreInteractions()

	}

	fun method2(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verify<kotlin.Any>(kotlin.Any())

		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify<kotlin.Any>(kotlin.Any())

		local_var_2_2.verify<kotlin.Any>(kotlin.Any())

		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verifyNoMoreInteractions()

	}

	fun method3(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
	}
}
