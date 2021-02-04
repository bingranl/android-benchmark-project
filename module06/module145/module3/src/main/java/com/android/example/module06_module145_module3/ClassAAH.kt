package com.android.example.module06_module145_module3

@Suppress("UNUSED_PARAMETER")
class ClassAAH {
	private 	val instance_var_1_0: com.android.example.module06_module145_module6.ClassAAB = com.android.example.module06_module145_module6.ClassAAB()
	private 	val instance_var_1_1: com.android.example.module06_module145_module6.ClassAAG = com.android.example.module06_module145_module6.ClassAAG()
	private 	val instance_var_1_2: com.android.example.module06_module145_module6.ClassAAI = com.android.example.module06_module145_module6.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module145_module6.ClassAAB,
		param1: com.android.example.module06_module145_module6.ClassAAH
	) {
		for (iAb in 0..2) {
			if (kotlin.Any().equals(kotlin.Any())) {
				val local_var_4_0: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_0.onNext(kotlin.Any())

			} else {
				param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.schedulers.TestScheduler(), io.reactivex.subscribers.TestSubscriber())

			}
		}
		param0.method3(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.request(157247761294502656)

	}

	fun method1(
		param0: com.android.example.module06_module145_module6.ClassAAG
	) {
		param0.method4(io.reactivex.subscribers.TestSubscriber(), io.reactivex.subscribers.TestSubscriber())

		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.request(3765323503647875622)

		param0.method1(io.reactivex.subscribers.TestSubscriber())

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.isCancelled()

	}

	fun method2(
		param0: com.android.example.module06_module145_module6.ClassAAH
	) {
	}

	fun method3(
		param0: com.android.example.module06_module145_module6.ClassAAE
	) {
		val local_var_2_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_1.assertNotSubscribed()

		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onError(kotlin.Throwable())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.onError(kotlin.Throwable())

	}
}
