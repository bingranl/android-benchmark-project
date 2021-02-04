package com.android.example.module19_module1_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String
	) {
		listOf("1", "2", "3").forEach {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
				local_var_4_0.verify()

			}
		}
		val local_var_2_1: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_1.verify<kotlin.Any>(kotlin.Any())

		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verify()

	}

	fun method1(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verifyNoMoreInteractions()

	}

	fun method2(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verifyNoMoreInteractions()

	}

	fun method3(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verifyNoMoreInteractions()

		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify()

		local_var_2_2.verify<kotlin.Any>(kotlin.Any())

		val local_var_2_4: org.mockito.internal.util.ConsoleMockitoLogger = org.mockito.internal.util.ConsoleMockitoLogger()
		local_var_2_4.log(kotlin.Any())

	}
}
