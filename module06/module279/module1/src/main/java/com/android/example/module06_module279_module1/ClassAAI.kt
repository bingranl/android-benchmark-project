package com.android.example.module06_module279_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
	private 	val instance_var_1_1: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()

	fun method0(
		param0: com.google.gson.internal.Excluder,
		param1: com.google.gson.JsonStreamParser,
		param2: com.google.gson.JsonParser,
		param3: com.google.gson.internal.Excluder
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..3) {
				param0.disableInnerClassSerialization()

				val local_var_4_0: com.android.example.module06_module342_module3.ClassAAB = com.android.example.module06_module342_module3.ClassAAB()
				local_var_4_0.method1("SomeString", "SomeString", "SomeString")

				local_var_4_0.method1("SomeString", "SomeString", "SomeString")

				val local_var_4_1: com.android.example.module06_module342_module3.ClassAAJ = com.android.example.module06_module342_module3.ClassAAJ()
				local_var_4_1.method4("SomeString")

			}
		}
	}

	fun method1(
		param0: com.google.gson.internal.Excluder,
		param1: com.google.gson.internal.Excluder,
		param2: com.google.gson.JsonArray
	) {
		val local_var_2_3: com.android.example.module06_module351_module1.ClassAAE = com.android.example.module06_module351_module1.ClassAAE()
		local_var_2_3.method1("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.android.example.module06_module342_module3.ClassAAB = com.android.example.module06_module342_module3.ClassAAB()
		local_var_2_4.method2("SomeString", "SomeString")

	}
}
