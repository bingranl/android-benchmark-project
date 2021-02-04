package com.android.example.module06_module340_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAA {
	private 	val instance_var_1_0: com.android.example.module06_module340_module3.ClassAAE = com.android.example.module06_module340_module3.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module340_module3.ClassAAB = com.android.example.module06_module340_module3.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module06_module340_module3.ClassAAG = com.android.example.module06_module340_module3.ClassAAG()

	fun method0(
		param0: com.android.example.module06_module340_module3.ClassAAA,
		param1: com.android.example.module06_module340_module3.ClassAAJ
	) {
		for (iAb in 0..1) {
			param0.method2("SomeString")

			val local_var_3_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
			local_var_3_0.verify()

			val local_var_3_1: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
			local_var_3_1.verify()

		}
		param0.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method2("SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module340_module3.ClassAAB,
		param1: com.android.example.module06_module340_module3.ClassAAJ
	) {
		param0.method4("SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verify()

	}

	fun method2(
		param0: com.android.example.module06_module340_module3.ClassAAJ,
		param1: com.android.example.module06_module340_module3.ClassAAA
	) {
		param0.method0("SomeString")

		val local_var_2_2: net.bytebuddy.matcher.IsNamedMatcher<net.bytebuddy.description.NamedElement.WithOptionalName> = net.bytebuddy.matcher.IsNamedMatcher()
		local_var_2_2.toString()

		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify<kotlin.Any>(kotlin.Any())

		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verifyNoMoreInteractions()

	}

	fun method3(
		param0: com.android.example.module06_module340_module3.ClassAAF,
		param1: com.android.example.module06_module340_module3.ClassAAH,
		param2: com.android.example.module06_module340_module3.ClassAAC,
		param3: com.android.example.module06_module340_module3.ClassAAG
	) {
		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verify()

		val local_var_2_5: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_5.verify()

		val local_var_2_6: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_6.verify()

	}

	fun method4(
		param0: com.android.example.module06_module340_module3.ClassAAF
	) {
		val local_var_2_1: org.mockito.internal.stubbing.DefaultLenientStubber = org.mockito.internal.stubbing.DefaultLenientStubber()
		local_var_2_1.doReturn(kotlin.Any())

		val local_var_2_2: net.bytebuddy.matcher.EqualityMatcher<kotlin.Any> = net.bytebuddy.matcher.EqualityMatcher(kotlin.Any())
		local_var_2_2.equals(kotlin.Any())

		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verifyNoMoreInteractions()

		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verify()

	}
}
