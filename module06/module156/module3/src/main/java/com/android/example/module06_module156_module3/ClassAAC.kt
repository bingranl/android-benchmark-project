package com.android.example.module06_module156_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAC {
	private 	val instance_var_1_0: com.google.gson.JsonArray = com.google.gson.JsonArray()
	private 	val instance_var_1_1: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
	private 	val instance_var_1_2: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")

	fun method0(
		param0: com.google.gson.internal.Excluder,
		param1: com.google.gson.internal.Excluder,
		param2: com.google.gson.internal.Excluder,
		param3: com.google.gson.JsonArray
	) {
		val local_var_2_4: com.android.example.module06_module340_module3.ClassAAA = com.android.example.module06_module340_module3.ClassAAA()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_5: com.android.example.module06_module340_module3.ClassAAB = com.android.example.module06_module340_module3.ClassAAB()
		local_var_2_5.method0("SomeString", "SomeString")

	}

	fun method1(
		param0: com.google.gson.internal.Excluder,
		param1: com.google.gson.internal.Excluder,
		param2: com.google.gson.internal.Excluder,
		param3: com.google.gson.internal.Excluder
	) {
		for (iAb in 0..1) {
			param0.disableInnerClassSerialization()

		}
	}

	fun method2(
		param0: com.google.gson.internal.Excluder
	) {
		val local_var_2_1: com.android.example.module15_module42_module1.ClassAAG = com.android.example.module15_module42_module1.ClassAAG()
		local_var_2_1.method0("SomeString", "SomeString")

	}

	fun method3(
		param0: com.google.gson.internal.Excluder
	) {
		val local_var_2_1: com.android.example.module15_module42_module1.ClassAAG = com.android.example.module15_module42_module1.ClassAAG()
		local_var_2_1.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.excludeFieldsWithoutExposeAnnotation()

		val local_var_2_2: com.android.example.module06_module342_module3.ClassAAF = com.android.example.module06_module342_module3.ClassAAF()
		local_var_2_2.method0("SomeString", "SomeString")

		param0.withVersion(0.018777132)

	}
}
