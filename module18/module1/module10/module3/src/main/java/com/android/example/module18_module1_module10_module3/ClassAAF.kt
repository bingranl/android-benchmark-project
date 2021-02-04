package com.android.example.module18_module1_module10_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module18_module1_module10_module2.ClassAAG = com.android.example.module18_module1_module10_module2.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module18_module1_module10_module2.ClassAAI = com.android.example.module18_module1_module10_module2.ClassAAI()
	private 	val instance_var_1_2: com.android.example.module18_module1_module10_module2.ClassAAA = com.android.example.module18_module1_module10_module2.ClassAAA()
	private 	val instance_var_1_3: com.android.example.module18_module1_module10_module2.ClassAAB = com.android.example.module18_module1_module10_module2.ClassAAB()
	private 	val instance_var_1_4: com.android.example.module18_module1_module10_module4.ClassAAH = com.android.example.module18_module1_module10_module4.ClassAAH()

	fun method0(
		param0: com.android.example.module18_module1_module10_module2.ClassAAC,
		param1: com.android.example.module18_module1_module10_module2.ClassAAD,
		param2: com.android.example.module18_module1_module10_module2.ClassAAJ
	) {
	}

	fun method1(
		param0: com.android.example.module18_module1_module10_module2.ClassAAG
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..3) {
				val local_var_4_0: com.android.example.module18_module1_module10_module2.ClassAAD = com.android.example.module18_module1_module10_module2.ClassAAD()
				local_var_4_0.method1(com.android.example.module18_module1_module10_module4.ClassAAD(), com.android.example.module18_module1_module10_module4.ClassAAC(), com.android.example.module18_module1_module10_module4.ClassAAA(), com.android.example.module18_module1_module10_module4.ClassAAA())

				val local_var_4_1: com.android.example.module18_module1_module10_module2.ClassAAB = com.android.example.module18_module1_module10_module2.ClassAAB()
				local_var_4_1.method1(com.android.example.module18_module1_module10_module4.ClassAAB(), com.android.example.module18_module1_module10_module4.ClassAAB(), com.android.example.module18_module1_module10_module4.ClassAAC())

				local_var_4_0.method2(com.android.example.module18_module1_module10_module4.ClassAAC(), com.android.example.module18_module1_module10_module4.ClassAAG(), com.android.example.module18_module1_module10_module4.ClassAAD())

				val local_var_4_2: com.android.example.module18_module1_module10_module4.ClassAAA = com.android.example.module18_module1_module10_module4.ClassAAA()
				local_var_4_2.method1("SomeString", "SomeString")

			}
			param0.method2(com.android.example.module18_module1_module10_module4.ClassAAA())

		}
		param0.method0(com.android.example.module18_module1_module10_module4.ClassAAI(), com.android.example.module18_module1_module10_module4.ClassAAI(), com.android.example.module18_module1_module10_module4.ClassAAB(), com.android.example.module18_module1_module10_module4.ClassAAH())

	}
}
