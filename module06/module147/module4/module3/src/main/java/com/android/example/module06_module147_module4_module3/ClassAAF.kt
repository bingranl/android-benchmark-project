package com.android.example.module06_module147_module4_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module6.ClassAAA = com.android.example.module06_module147_module4_module6.ClassAAA()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module6.ClassAAA = com.android.example.module06_module147_module4_module6.ClassAAA()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAA,
		param1: com.android.example.module06_module147_module4_module6.ClassAAA,
		param2: com.android.example.module06_module147_module4_module6.ClassAAI
	) {
	}

	fun method1(
		param0: com.android.example.module06_module147_module4_module6.ClassAAD,
		param1: com.android.example.module06_module147_module4_module6.ClassAAI
	) {
	}

	fun method2(
		param0: com.android.example.module06_module147_module4_module6.ClassAAA
	) {
		param0.method1(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.onSuccess(kotlin.Any())

		listOf("1", "2", "3").forEach {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.hasSubscription()

			val local_var_3_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_1.onComplete()

		}
	}

	fun method3(
		param0: com.android.example.module06_module147_module4_module6.ClassAAH,
		param1: com.android.example.module06_module147_module4_module6.ClassAAF,
		param2: com.android.example.module06_module147_module4_module6.ClassAAF,
		param3: com.android.example.module06_module147_module4_module6.ClassAAA
	) {
	}

	fun method4(
		param0: com.android.example.module06_module147_module4_module6.ClassAAJ,
		param1: com.android.example.module06_module147_module4_module6.ClassAAA,
		param2: com.android.example.module06_module147_module4_module6.ClassAAB,
		param3: com.android.example.module06_module147_module4_module6.ClassAAA
	) {
		val local_var_2_4: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_4.assertNotSubscribed()

	}
}
