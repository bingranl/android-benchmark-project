package com.android.example.module06_module156_module1

@Suppress("UNUSED_PARAMETER")
class ClassAAG {
	private 	val instance_var_1_0: com.android.example.module06_module156_module3.ClassAAE = com.android.example.module06_module156_module3.ClassAAE()
	private 	val instance_var_1_1: com.android.example.module06_module109_module1.ClassAAB = com.android.example.module06_module109_module1.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module06_module156_module3.ClassAAJ = com.android.example.module06_module156_module3.ClassAAJ()

	fun method0(
		param0: com.android.example.module06_module156_module3.ClassAAG,
		param1: com.android.example.module06_module109_module1.ClassAAJ
	) {
	}

	fun method1(
		param0: com.android.example.module06_module156_module3.ClassAAD,
		param1: com.android.example.module06_module109_module1.ClassAAB
	) {
		val local_var_2_2: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_2.disableInnerClassSerialization()

		val local_var_2_3: com.google.gson.JsonPrimitive = com.google.gson.JsonPrimitive("SomeString")
		local_var_2_3.getAsByte()

	}

	fun method2(
		param0: com.android.example.module06_module156_module3.ClassAAH,
		param1: com.android.example.module06_module109_module1.ClassAAI
	) {
		param0.method2(com.google.gson.JsonPrimitive("SomeString"), com.google.gson.internal.Excluder(), com.google.gson.internal.Excluder())

	}

	fun method3(
		param0: com.android.example.module06_module156_module3.ClassAAB,
		param1: com.android.example.module06_module109_module1.ClassAAB
	) {
		val local_var_2_2: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_2.disableInnerClassSerialization()

		val local_var_2_3: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_3.withVersion(0.3092311)

		val local_var_2_4: com.google.gson.JsonArray = com.google.gson.JsonArray()
		local_var_2_4.get(22)

	}

	fun method4(
		param0: com.android.example.module06_module109_module1.ClassAAD,
		param1: com.android.example.module06_module156_module3.ClassAAG,
		param2: com.android.example.module06_module156_module3.ClassAAB,
		param3: com.android.example.module06_module109_module1.ClassAAA
	) {
		param0.method2("SomeString", "SomeString", "SomeString", "SomeString")

		val local_var_2_4: com.google.gson.internal.Excluder = com.google.gson.internal.Excluder()
		local_var_2_4.excludeFieldsWithoutExposeAnnotation()

	}
}
