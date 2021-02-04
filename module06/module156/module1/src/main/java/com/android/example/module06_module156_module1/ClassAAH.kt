package com.android.example.module06_module156_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module109_module1.ClassAAD = com.android.example.module06_module109_module1.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module109_module1.ClassAAA = com.android.example.module06_module109_module1.ClassAAA()
	private 	val instance_var_1_2: com.android.example.module06_module156_module3.ClassAAF = com.android.example.module06_module156_module3.ClassAAF()

	fun method0(
		param0: com.android.example.module06_module109_module1.ClassAAA,
		param1: com.android.example.module06_module156_module3.ClassAAH,
		param2: com.android.example.module06_module156_module3.ClassAAH,
		param3: com.android.example.module06_module156_module3.ClassAAJ
	) {
		param0.method1("SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_4.disableInnerClassSerialization()

		param0.method3("SomeString", "SomeString", "SomeString")

	}

	fun method1(
		param0: com.android.example.module06_module156_module3.ClassAAA,
		param1: com.android.example.module06_module156_module3.ClassAAC,
		param2: com.android.example.module06_module109_module1.ClassAAG,
		param3: com.android.example.module06_module109_module1.ClassAAI
	) {
		param0.method1(com.google.gson.JsonPrimitive("SomeString"), com.google.gson.JsonArray(), com.google.gson.internal.Excluder())

		val local_var_2_4: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_4.disableInnerClassSerialization()

		val local_var_2_5: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_5.disableInnerClassSerialization()

		param0.method1(com.google.gson.JsonPrimitive("SomeString"), com.google.gson.JsonArray(), com.google.gson.internal.Excluder())

	}

	fun method2(
		param0: com.android.example.module06_module109_module1.ClassAAD
	) {
		val local_var_2_1: com.google.gson.JsonParser = com.google.gson.JsonParser()
		local_var_2_1.parse("SomeString")

		val local_var_2_2: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
		local_var_2_2.deepCopy()

		val local_var_2_3: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_3.withVersion(0.3236751)

	}

	fun method3(
		param0: com.android.example.module06_module156_module3.ClassAAG
	) {
		param0.method0(com.google.gson.internal.Excluder())

		val local_var_2_1: com.google.gson.JsonArray = com.google.gson.JsonArray()
		local_var_2_1.remove(45)

	}
}
