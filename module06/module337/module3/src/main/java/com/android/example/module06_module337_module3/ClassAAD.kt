package com.android.example.module06_module337_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAD {
	private 	val instance_var_1_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
	private 	val instance_var_1_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()

	fun method0(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param1: io.reactivex.subscribers.TestSubscriber<kotlin.Any>,
		param2: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		listOf("1", "2", "3").forEach {
			val local_var_3_0: com.android.example.module06_module321_module10.ClassAAG = com.android.example.module06_module321_module10.ClassAAG()
			local_var_3_0.method2("SomeString", "SomeString", "SomeString")

		}
		param0.assertSubscribed()

	}

	fun method1(
		param0: io.reactivex.subscribers.TestSubscriber<kotlin.Any>
	) {
		val local_var_2_1: com.android.example.module06_module321_module10.ClassAAF = com.android.example.module06_module321_module10.ClassAAF()
		local_var_2_1.method3("SomeString", "SomeString", "SomeString")

		val local_var_2_2: com.android.example.module06_module342_module3.ClassAAJ = com.android.example.module06_module342_module3.ClassAAJ()
		local_var_2_2.method0("SomeString", "SomeString")

	}
}
