package com.android.example.module06_module279_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
	private 	val instance_var_1_1: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
	private 	val instance_var_1_2: com.google.gson.JsonObject = com.google.gson.JsonObject()

	fun method0(
		param0: com.google.gson.JsonArray
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module342_module3.ClassAAI = com.android.example.module06_module342_module3.ClassAAI()
			local_var_3_0.method1("SomeString", "SomeString", "SomeString")

		}
		for (iAb in 0..1) {
			val local_var_3_0: com.android.example.module06_module351_module1.ClassAAF = com.android.example.module06_module351_module1.ClassAAF()
			local_var_3_0.method0("SomeString")

		}
		val local_var_2_1: com.android.example.module06_module351_module1.ClassAAC = com.android.example.module06_module351_module1.ClassAAC()
		local_var_2_1.method3("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: com.google.gson.internal.Excluder
	) {
		val local_var_2_1: com.android.example.module06_module351_module1.ClassAAJ = com.android.example.module06_module351_module1.ClassAAJ()
		local_var_2_1.method2("SomeString", "SomeString")

		param0.excludeFieldsWithoutExposeAnnotation()

	}

	fun method2(
		param0: com.google.gson.JsonArray,
		param1: com.google.gson.internal.Excluder
	) {
		val local_var_2_2: com.android.example.module06_module351_module1.ClassAAF = com.android.example.module06_module351_module1.ClassAAF()
		local_var_2_2.method1("SomeString")

		param0.remove(18)

		val local_var_2_3: com.android.example.module06_module351_module1.ClassAAG = com.android.example.module06_module351_module1.ClassAAG()
		local_var_2_3.method0("SomeString")

	}
}
