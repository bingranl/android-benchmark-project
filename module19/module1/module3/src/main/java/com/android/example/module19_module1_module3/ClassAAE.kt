package com.android.example.module19_module1_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAE {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"
	private 	val instance_var_1_2: String = "SomeString"

	fun method0(
		param0: String,
		param1: String
	) {
		listOf("1", "2", "3").forEach {
			listOf("1", "2", "3").forEach {
				for (iAb in 0..6) {
					val local_var_5_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
					local_var_5_0.verifyNoMoreInteractions()

					local_var_5_0.verify<kotlin.Any>(kotlin.Any())

					val local_var_5_1: net.bytebuddy.matcher.ArrayTypeMatcher<net.bytebuddy.description.type.TypeDefinition> = net.bytebuddy.matcher.ArrayTypeMatcher()
					local_var_5_1.equals(kotlin.Any())

					val local_var_5_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
					local_var_5_2.verify<kotlin.Any>(kotlin.Any())

				}
			}
		}
	}

	fun method1(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verifyNoMoreInteractions()

	}
}
