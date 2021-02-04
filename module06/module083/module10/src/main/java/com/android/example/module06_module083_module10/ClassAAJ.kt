package com.android.example.module06_module083_module10

@Suppress("UNUSED_PARAMETER")
class ClassAAJ {
	private 	val instance_var_1_0: com.android.example.module06_module083_module09.ClassAAG = com.android.example.module06_module083_module09.ClassAAG()
	private 	val instance_var_1_1: com.android.example.module06_module083_module09.ClassAAH = com.android.example.module06_module083_module09.ClassAAH()
	private 	val instance_var_1_2: com.android.example.module06_module083_module09.ClassAAI = com.android.example.module06_module083_module09.ClassAAI()
	private 	val instance_var_1_3: com.android.example.module06_module083_module09.ClassAAJ = com.android.example.module06_module083_module09.ClassAAJ()
	private 	val instance_var_1_4: com.android.example.module06_module083_module09.ClassAAG = com.android.example.module06_module083_module09.ClassAAG()

	fun method0(
		param0: com.android.example.module06_module083_module09.ClassAAE
	) {
		listOf("1", "2", "3").forEach {
			param0.method3(io.reactivex.subscribers.TestSubscriber())

		}
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertNotSubscribed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		param0.method3(io.reactivex.subscribers.TestSubscriber())

	}

	fun method1(
		param0: com.android.example.module06_module083_module09.ClassAAD,
		param1: com.android.example.module06_module083_module09.ClassAAJ
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module06_module083_module09.ClassAAA,
		param1: com.android.example.module06_module083_module09.ClassAAI,
		param2: com.android.example.module06_module083_module09.ClassAAB
	) {
		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.requestMore(-3993785213621089857)

		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.onError(kotlin.Throwable())

	}
}
