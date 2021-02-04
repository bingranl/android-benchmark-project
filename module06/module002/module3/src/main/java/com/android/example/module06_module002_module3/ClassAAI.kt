package com.android.example.module06_module002_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAI {
	private 	val instance_var_1_0: com.android.example.module06_module002_module5.ClassAAA = com.android.example.module06_module002_module5.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module002_module2.ClassAAB = com.android.example.module06_module002_module2.ClassAAB()
	private 	val instance_var_1_2: com.android.example.module06_module002_module2.ClassAAG = com.android.example.module06_module002_module2.ClassAAG()

	fun method0(
		param0: com.android.example.module06_module002_module2.ClassAAG
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.onComplete()

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.onNext(kotlin.Any())

			local_var_3_0.isCancelled()

		}
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(7435889575504812725)

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertNotSubscribed()

	}

	fun method1(
		param0: com.android.example.module06_module002_module5.ClassAAG,
		param1: com.android.example.module06_module002_module2.ClassAAD
	) {
	}

	fun method2(
		param0: com.android.example.module06_module002_module2.ClassAAD,
		param1: com.android.example.module06_module002_module5.ClassAAE,
		param2: com.android.example.module06_module002_module2.ClassAAF
	) {
		param0.method3(com.android.example.module06_module002_module5.ClassAAE())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

	}
}
