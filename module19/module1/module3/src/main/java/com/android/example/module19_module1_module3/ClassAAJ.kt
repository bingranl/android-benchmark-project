package com.android.example.module19_module1_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String
	) {
	}

	fun method1(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verify()

		for (iAb in 0..6) {
			if (kotlin.Any().equals(kotlin.Any())) {
				local_var_2_4.verify()

			}
			val local_var_3_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
			local_var_3_0.verifyNoMoreInteractions()

		}
		val local_var_2_5: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_5.verifyNoMoreInteractions()

		local_var_2_4.verify()

	}

	fun method2(
		param0: String,
		param1: String
	) {
		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verifyNoMoreInteractions()

		local_var_2_2.verify<kotlin.Any>(kotlin.Any())

		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify()

	}

	fun method3(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verify()

	}

	fun method4(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify()

		local_var_2_3.verify()

		local_var_2_3.verify<kotlin.Any>(kotlin.Any())

	}
}
