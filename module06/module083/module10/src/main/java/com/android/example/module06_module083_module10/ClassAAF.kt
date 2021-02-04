package com.android.example.module06_module083_module10

@Suppress("UNUSED_PARAMETER")
class ClassAAF {
	private 	val instance_var_1_0: com.android.example.module06_module083_module09.ClassAAF = com.android.example.module06_module083_module09.ClassAAF()
	private 	val instance_var_1_1: com.android.example.module06_module083_module09.ClassAAI = com.android.example.module06_module083_module09.ClassAAI()

	fun method0(
		param0: com.android.example.module06_module083_module09.ClassAAD
	) {
		listOf("1", "2", "3").forEach {
			for (iAb in 0..6) {
				listOf("1", "2", "3").forEach {
					param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.schedulers.TestScheduler())

				}
				param0.method2(io.reactivex.subscribers.TestSubscriber())

				val local_var_4_0: io.reactivex.internal.disposables.ListCompositeDisposable = io.reactivex.internal.disposables.ListCompositeDisposable()
				local_var_4_0.dispose()

				val local_var_4_1: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
				local_var_4_1.hasSubscription()

			}
			param0.method2(io.reactivex.subscribers.TestSubscriber())

		}
		param0.method2(io.reactivex.subscribers.TestSubscriber())

		param0.method0(io.reactivex.internal.disposables.ListCompositeDisposable(), io.reactivex.schedulers.TestScheduler())

	}

	fun method1(
		param0: com.android.example.module06_module083_module09.ClassAAE
	) {
		val local_var_2_1: io.reactivex.observers.TestObserver<kotlin.Any> = io.reactivex.observers.TestObserver()
		local_var_2_1.assertSubscribed()

	}

	fun method2(
		param0: com.android.example.module06_module083_module09.ClassAAF,
		param1: com.android.example.module06_module083_module09.ClassAAB
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.onNext(kotlin.Any())

		val local_var_2_3: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_3.cancel()

	}

	fun method3(
		param0: com.android.example.module06_module083_module09.ClassAAA,
		param1: com.android.example.module06_module083_module09.ClassAAA
	) {
		val local_var_2_2: io.reactivex.subscribers.TestSubscriber<kotlin.Any> = io.reactivex.subscribers.TestSubscriber()
		local_var_2_2.assertSubscribed()

	}
}
