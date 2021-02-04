package com.android.example.module06_module340_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module340_module3.ClassAAG = com.android.example.module06_module340_module3.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module340_module3.ClassAAJ = com.android.example.module06_module340_module3.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module340_module3.ClassAAG
	) {
		val local_var_2_1: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_1.verify()

		val local_var_2_2: org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker = org.mockito.internal.creation.bytebuddy.SubclassByteBuddyMockMaker()
		local_var_2_2.getHandler(kotlin.Any())

		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
			local_var_3_0.verifyNoMoreInteractions()

		}
	}

	fun method1(
		param0: com.android.example.module06_module340_module3.ClassAAE,
		param1: com.android.example.module06_module340_module3.ClassAAD,
		param2: com.android.example.module06_module340_module3.ClassAAD,
		param3: com.android.example.module06_module340_module3.ClassAAA
	) {
		param0.method3("SomeString")

		val local_var_2_4: org.mockito.configuration.DefaultMockitoConfiguration = org.mockito.configuration.DefaultMockitoConfiguration()
		local_var_2_4.enableClassCache()

	}

	fun method2(
		param0: com.android.example.module06_module340_module3.ClassAAG,
		param1: com.android.example.module06_module340_module3.ClassAAF,
		param2: com.android.example.module06_module340_module3.ClassAAD,
		param3: com.android.example.module06_module340_module3.ClassAAG
	) {
		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_4: net.bytebuddy.matcher.IsNamedMatcher<net.bytebuddy.description.NamedElement.WithOptionalName> = net.bytebuddy.matcher.IsNamedMatcher()
		local_var_2_4.hashCode()

		val local_var_2_5: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_5.verify<kotlin.Any>(kotlin.Any())

	}

	fun method3(
		param0: com.android.example.module06_module340_module3.ClassAAJ,
		param1: com.android.example.module06_module340_module3.ClassAAG,
		param2: com.android.example.module06_module340_module3.ClassAAA,
		param3: com.android.example.module06_module340_module3.ClassAAD
	) {
		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

		param0.method3("SomeString")

		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verify()

		param0.method3("SomeString")

	}

	fun method4(
		param0: com.android.example.module06_module340_module3.ClassAAG,
		param1: com.android.example.module06_module340_module3.ClassAAB,
		param2: com.android.example.module06_module340_module3.ClassAAE
	) {
	}
}
