package com.android.example.module06_module340_module4

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module340_module3.ClassAAA = com.android.example.module06_module340_module3.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module340_module3.ClassAAD = com.android.example.module06_module340_module3.ClassAAD()
	private 	val instance_var_1_2: com.android.example.module06_module340_module3.ClassAAG = com.android.example.module06_module340_module3.ClassAAG()
	private 	val instance_var_1_3: com.android.example.module06_module340_module3.ClassAAI = com.android.example.module06_module340_module3.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module340_module3.ClassAAF,
		param1: com.android.example.module06_module340_module3.ClassAAJ,
		param2: com.android.example.module06_module340_module3.ClassAAJ
	) {
		for (iAb in 0..4) {
			val local_var_3_0: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
			local_var_3_0.verifyNoMoreInteractions()

			for (iAc in 0..0) {
				val local_var_4_0: net.bytebuddy.utility.RandomString = net.bytebuddy.utility.RandomString()
				local_var_4_0.nextString()

				val local_var_4_1: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
				local_var_4_1.verifyNoMoreInteractions()

				val local_var_4_2: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
				local_var_4_2.verifyNoMoreInteractions()

			}
		}
	}

	fun method1(
		param0: com.android.example.module06_module340_module3.ClassAAC,
		param1: com.android.example.module06_module340_module3.ClassAAJ,
		param2: com.android.example.module06_module340_module3.ClassAAC
	) {
		val local_var_2_3: net.bytebuddy.jar.asm.TypeReference = net.bytebuddy.jar.asm.TypeReference(85)
		local_var_2_3.getSort()

	}

	fun method2(
		param0: com.android.example.module06_module340_module3.ClassAAH,
		param1: com.android.example.module06_module340_module3.ClassAAJ,
		param2: com.android.example.module06_module340_module3.ClassAAB
	) {
	}

	fun method3(
		param0: com.android.example.module06_module340_module3.ClassAAF,
		param1: com.android.example.module06_module340_module3.ClassAAE,
		param2: com.android.example.module06_module340_module3.ClassAAD
	) {
		param0.method0("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_3: com.nhaarman.mockitokotlin2.InOrderOnType<kotlin.Any> = com.nhaarman.mockitokotlin2.InOrderOnType(kotlin.Any())
		local_var_2_3.verify<kotlin.Any>(kotlin.Any())

		param0.method4("SomeString")

	}
}
