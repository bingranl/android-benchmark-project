package com.android.example.module06_module156_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module156_module3.ClassAAE = com.android.example.module06_module156_module3.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module109_module1.ClassAAG = com.android.example.module06_module109_module1.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module156_module3.ClassAAH = com.android.example.module06_module156_module3.ClassAAH()

	fun method0(
		param0: com.android.example.module06_module156_module3.ClassAAF,
		param1: com.android.example.module06_module109_module1.ClassAAG
	) {
		for (iAb in 0..0) {
			val local_var_3_0: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
			local_var_3_0.disableInnerClassSerialization()

		}
		param0.method0(com.google.gson.JsonStreamParser("SomeString"), com.google.gson.internal.Excluder(), com.google.gson.JsonArray(), com.google.gson.JsonPrimitive("SomeString"))

		val local_var_2_2: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
		local_var_2_2.getAsLong()

	}

	fun method1(
		param0: com.android.example.module06_module156_module3.ClassAAE,
		param1: com.android.example.module06_module109_module1.ClassAAH
	) {
		param0.method0(com.google.gson.internal.Excluder())

		param0.method0(com.google.gson.internal.Excluder())

		val local_var_2_2: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
		local_var_2_2.getAsString()

		val local_var_2_3: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
		local_var_2_3.getAsLong()

	}

	fun method2(
		param0: com.android.example.module06_module109_module1.ClassAAA,
		param1: com.android.example.module06_module109_module1.ClassAAJ,
		param2: com.android.example.module06_module109_module1.ClassAAE,
		param3: com.android.example.module06_module156_module3.ClassAAC
	) {
		val local_var_2_4: com.google.gson.JsonObject = com.google.gson.JsonObject()
		local_var_2_4.addProperty("SomeString", true)

		param0.method1("SomeString", "SomeString", "SomeString")

		param0.method1("SomeString", "SomeString", "SomeString")

		param0.method0("SomeString", "SomeString", "SomeString")

	}

	fun method3(
		param0: com.android.example.module06_module109_module1.ClassAAB,
		param1: com.android.example.module06_module109_module1.ClassAAH,
		param2: com.android.example.module06_module109_module1.ClassAAF
	) {
		val local_var_2_3: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_3.excludeFieldsWithoutExposeAnnotation()

		val local_var_2_4: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_4.disableInnerClassSerialization()

		val local_var_2_5: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
		local_var_2_5.getAsByte()

	}
}
