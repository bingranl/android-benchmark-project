package com.android.example.module06_module156_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
	private 	val instance_var_1_1: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
	private 	val instance_var_1_2: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
	private 	val instance_var_1_3: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()

	fun method0(
		param0: com.google.gson.internal.Excluder
	) {
		listOf("1", "2", "3").forEach {
			param0.disableInnerClassSerialization()

			for (iAb in 0..0) {
				val local_var_4_0: com.android.example.module15_module42_module1.ClassAAD = com.android.example.module15_module42_module1.ClassAAD()
				local_var_4_0.method1("SomeString", "SomeString")

				val local_var_4_1: com.android.example.module15_module42_module1.ClassAAG = com.android.example.module15_module42_module1.ClassAAG()
				local_var_4_1.method1("SomeString", "SomeString", "SomeString", "SomeString")

			}
		}
		val local_var_2_1: com.android.example.module15_module42_module1.ClassAAG = com.android.example.module15_module42_module1.ClassAAG()
		local_var_2_1.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.android.example.module06_module342_module3.ClassAAI = com.android.example.module06_module342_module3.ClassAAI()
		local_var_2_2.method3("SomeString")

		param0.excludeFieldsWithoutExposeAnnotation()

	}

	fun method1(
		param0: com.google.gson.internal.Excluder,
		param1: com.google.gson.JsonObject,
		param2: com.google.gson.JsonStreamParser,
		param3: com.google.gson.JsonParser
	) {
		val local_var_2_4: com.android.example.module06_module340_module3.ClassAAG = com.android.example.module06_module340_module3.ClassAAG()
		local_var_2_4.method1("SomeString", "SomeString", "SomeString", "SomeString")

		param0.withVersion(0.043065667)

		val local_var_2_5: com.android.example.module15_module42_module1.ClassAAF = com.android.example.module15_module42_module1.ClassAAF()
		local_var_2_5.method1("SomeString", "SomeString", "SomeString")

	}

	fun method2(
		param0: com.google.gson.internal.Excluder,
		param1: com.google.gson.JsonPrimitive
	) {
		param0.excludeFieldsWithoutExposeAnnotation()

		param0.disableInnerClassSerialization()

	}
}
