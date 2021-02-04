package com.android.example.module06_module340_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: com.android.example.module06_module340_module3.ClassAAH = com.android.example.module06_module340_module3.ClassAAH()
	private 	val instance_var_1_1: com.android.example.module06_module340_module3.ClassAAI = com.android.example.module06_module340_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module340_module3.ClassAAH,
		param1: com.android.example.module06_module340_module3.ClassAAB,
		param2: com.android.example.module06_module340_module3.ClassAAJ,
		param3: com.android.example.module06_module340_module3.ClassAAI
	) {
		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
			local_var_3_0.verifyNoMoreInteractions()

		}
		val local_var_2_4: net.bytebuddy.jar.asm.ByteVector = net.bytebuddy.jar.asm.ByteVector()
		local_var_2_4.putInt(75)

	}

	fun method1(
		param0: com.android.example.module06_module340_module3.ClassAAF,
		param1: com.android.example.module06_module340_module3.ClassAAA,
		param2: com.android.example.module06_module340_module3.ClassAAJ,
		param3: com.android.example.module06_module340_module3.ClassAAG
	) {
		val local_var_2_4: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_4.verifyNoMoreInteractions()

		param0.method2("SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_5.verifyNoMoreInteractions()

		param0.method1("SomeString", "SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module340_module3.ClassAAB,
		param1: com.android.example.module06_module340_module3.ClassAAC
	) {
		val local_var_2_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_2.verify()

		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify()

		param0.method2("SomeString", "SomeString")

	}
}
