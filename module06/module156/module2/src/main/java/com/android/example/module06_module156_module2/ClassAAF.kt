package com.android.example.module06_module156_module2

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module156_module3.ClassAAE = com.android.example.module06_module156_module3.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module109_module1.ClassAAJ = com.android.example.module06_module109_module1.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module156_module3.ClassAAE,
		param1: com.android.example.module06_module156_module1.ClassAAJ
	) {
		val local_var_2_2: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_2.withVersion(0.027106643)

		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.google.gson.Gson = com.google.gson.Gson()
			local_var_3_0.toJsonTree(kotlin.Any())

			local_var_3_0.serializeNulls()

		}
		val local_var_2_3: com.google.gson.JsonArray = com.google.gson.JsonArray()
		local_var_2_3.add("SomeString")

		param0.method0(com.google.gson.internal.Excluder())

	}

	fun method1(
		param0: com.android.example.module06_module109_module1.ClassAAH,
		param1: com.android.example.module06_module109_module1.ClassAAG,
		param2: com.android.example.module06_module156_module3.ClassAAI
	) {
		val local_var_2_3: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
		local_var_2_3.getAsLong()

		val local_var_2_4: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
		local_var_2_4.deepCopy()

		val local_var_2_5: com.google.gson.JsonParser = com.google.gson.JsonParser()
		local_var_2_5.parse("SomeString")

	}

	fun method2(
		param0: com.android.example.module06_module156_module1.ClassAAI,
		param1: com.android.example.module06_module156_module1.ClassAAG,
		param2: com.android.example.module06_module109_module1.ClassAAB,
		param3: com.android.example.module06_module109_module1.ClassAAC
	) {
		val local_var_2_4: com.google.gson.JsonParser = com.google.gson.JsonParser()
		local_var_2_4.parse("SomeString")

		val local_var_2_5: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_5.withVersion(0.09287357)

	}
}
