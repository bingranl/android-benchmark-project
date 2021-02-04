package com.android.example.module06_module147_module4_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module147_module4_module6.ClassAAD = com.android.example.module06_module147_module4_module6.ClassAAD()
	private 	val instance_var_1_1: com.android.example.module06_module147_module4_module6.ClassAAB = com.android.example.module06_module147_module4_module6.ClassAAB()

	fun method0(
		param0: com.android.example.module06_module147_module4_module6.ClassAAA,
		param1: com.android.example.module06_module147_module4_module6.ClassAAC
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.assertSubscribed()

		if (kotlin.Any().equals(kotlin.Any())) {
			val local_var_3_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
			local_var_3_0.assertSubscribed()

		}
	}

	fun method1(
		param0: com.android.example.module06_module147_module4_module6.ClassAAC
	) {
		param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

	}

	fun method2(
		param0: com.android.example.module06_module147_module4_module6.ClassAAE,
		param1: com.android.example.module06_module147_module4_module6.ClassAAE,
		param2: com.android.example.module06_module147_module4_module6.ClassAAA
	) {
		param0.method3(io.reactivex.schedulers.TestScheduler())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

		param0.method2(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.schedulers.TestScheduler())

	}
}
