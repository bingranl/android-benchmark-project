package com.android.example.module19_module1_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: String = "SomeString"
	private 	val instance_var_1_1: String = "SomeString"

	fun method0(
		param0: String,
		param1: String,
		param2: String
	) {
		val local_var_2_3: org.mockito.internal.stubbing.DefaultLenientStubber = org.mockito.internal.stubbing.DefaultLenientStubber()
		local_var_2_3.doCallRealMethod()

	}

	fun method1(
		param0: String,
		param1: String,
		param2: String
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
			local_var_3_0.verify<kotlin.Any>(kotlin.Any())

		}
		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify()

		local_var_2_3.verify()

	}

	fun method2(
		param0: String
	) {
		val local_var_2_1: org.mockito.internal.junit.DefaultTestFinishedEvent = org.mockito.internal.junit.DefaultTestFinishedEvent(kotlin.Any(), "SomeString", kotlin.Throwable())
		local_var_2_1.getTestName()

		local_var_2_1.getTestName()

		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verifyNoMoreInteractions()

		local_var_2_1.getTestName()

	}

	fun method3(
		param0: String
	) {
		val local_var_2_1: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_1.verify()

		val local_var_2_2: org.mockito.configuration.DefaultMockitoConfiguration = org.mockito.configuration.DefaultMockitoConfiguration()
		local_var_2_2.getDefaultAnswer()

		local_var_2_1.verify()

		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify<kotlin.Any>(kotlin.Any())

	}

	fun method4(
		param0: String,
		param1: String,
		param2: String,
		param3: String
	) {
		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verifyNoMoreInteractions()

		local_var_2_4.verify()

		val local_var_2_5: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_5.verify<kotlin.Any>(kotlin.Any())

		val local_var_2_6: net.bytebuddy.utility.RandomString = net.bytebuddy.utility.RandomString()
		local_var_2_6.nextString()

	}
}
